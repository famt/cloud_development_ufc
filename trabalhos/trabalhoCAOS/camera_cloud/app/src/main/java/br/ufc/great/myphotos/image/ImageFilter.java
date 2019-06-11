/*******************************************************************************
 * Copyright (C) 2014 Philipp B. Costa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package br.ufc.great.myphotos.image;

import java.io.IOException;

import br.ufc.great.myphotos.util.ImageUtils;

/**
 * More details see in project BenchImage how it work!
 * 
 * @author Philipp
 */
public final class ImageFilter {

    public byte[] mapTone(byte source[], byte map[]) {
        byte data[] = null;
        try {
            int image[][] = mapTone(ImageUtils.decodeJpegToRaw(source), ImageUtils.decodeJpegToRaw(map));
            data = ImageUtils.encodeRawToJpeg(image);
            image = null;
            System.gc();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public int[][] mapTone(int source[][], int map[][]) {
        int imgWidth = source.length;
        int imgHeight = source[0].length;
        int filterHeight = map[0].length;

        for (int x = 0; x < imgWidth; x++) {
            for (int y = 0; y < imgHeight; y++) {

                int color = source[x][y];
                int channelRed = ImageUtils.getRed(color);
                int channelGreen = ImageUtils.getGreen(color);
                int channelBlue = ImageUtils.getBlue(color);

                if (filterHeight == 1) {
                    channelRed = map[channelRed][0];
                    channelGreen = map[channelGreen][0];
                    channelBlue = map[channelBlue][0];
                } else {
                    channelRed = map[channelRed][0];
                    channelGreen = map[channelGreen][1];
                    channelBlue = map[channelBlue][2];
                }
                source[x][y] = ImageUtils.setColor(ImageUtils.getRed(channelRed), ImageUtils.getGreen(channelGreen), ImageUtils.getBlue(channelBlue));
            }
        }
        return source;
    }

    public byte[] cartoonizerImage(byte source[]) {
        byte data[] = null;
        try {
            int image[][] = cartoonizerImage(ImageUtils.decodeJpegToRaw(source));
            data = ImageUtils.encodeRawToJpeg(image);
            image = null;
            System.gc();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public int[][] cartoonizerImage(int source[][]) {
        source = greyScaleImage(source);

        int imageInvert[][] = invertColors(ImageUtils.rawImageClone(source));

        double maskFilter[][] = { {1, 2, 1}, {2, 4, 2}, {1, 2, 1}};
        imageInvert = filterApply(imageInvert, maskFilter, 1.0 / 16.020, 0.0);

        return colorDodgeBlendOptimized(imageInvert, source);
    }

    public byte[] filterApply(byte source[], double filter[][], double factor, double offset) {
        byte data[] = null;
        try {
            int image[][] = filterApply(ImageUtils.decodeJpegToRaw(source), filter, factor, offset);
            data = ImageUtils.encodeRawToJpeg(image);
            image = null;
            System.gc();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public int[][] filterApply(int source[][], double filter[][], double factor, double offset) {
        int imgWidth = source.length;
        int imgHeight = source[0].length;

        int filterHeight = filter.length;
        int filterWidth = filter[0].length;

        for (int x = 0; x < imgWidth; x++) {
            for (int y = 0; y < imgHeight; y++) {
                int red = 0;
                int green = 0;
                int blue = 0;

                for (int filterX = 0; filterX < filterWidth; filterX++) {
                    for (int filterY = 0; filterY < filterHeight; filterY++) {
                        int imageX = (x - (filterWidth / 2) + filterX + imgWidth) % imgWidth;
                        int imageY = (y - (filterHeight / 2) + filterY + imgHeight) % imgHeight;

                        int color = source[imageX][imageY];

                        double maskValue = filter[filterX][filterY];

                        red += (ImageUtils.getRed(color) * maskValue);
                        green += (ImageUtils.getGreen(color) * maskValue);
                        blue += (ImageUtils.getBlue(color) * maskValue);
                    }
                }

                red = Math.min(Math.max((int) (factor * red + offset), 0), 255);
                green = Math.min(Math.max((int) (factor * green + offset), 0), 255);
                blue = Math.min(Math.max((int) (factor * blue + offset), 0), 255);

                source[x][y] = ImageUtils.setColor(red, green, blue);
            }
        }

        return source;
    }

    public int[][] greyScaleImage(int source[][]) {
        final double greyScaleRed = 0.299;
        final double greyScaleGreen = 0.587;
        final double greyScaleBlue = 0.114;

        int red, green, blue;
        int pixel;

        int imgWidth = source.length;
        int imgHeight = source[0].length;

        for (int x = 0; x < imgWidth; x++) {
            for (int y = 0; y < imgHeight; y++) {
                pixel = source[x][y];

                red = ImageUtils.getRed(pixel);
                green = ImageUtils.getGreen(pixel);
                blue = ImageUtils.getBlue(pixel);

                red = green = blue = (int) (greyScaleRed * red + greyScaleGreen * green + greyScaleBlue * blue);

                source[x][y] = ImageUtils.setColor(red, green, blue);
            }
        }

        return source;
    }

    private int[][] colorDodgeBlendOptimized(int source[][], int layer[][]) {
        int imgWidth = source.length;
        int imgHeight = source[0].length;

        for (int i = 0; i < imgHeight; i++) {
            for (int j = 0; j < imgWidth; j++) {
                int filterInt = layer[j][i];
                int srcInt = source[j][i];

                int redValueFinal = colordodge(ImageUtils.getRed(filterInt), ImageUtils.getRed(srcInt));
                int greenValueFinal = colordodge(ImageUtils.getGreen(filterInt), ImageUtils.getGreen(srcInt));
                int blueValueFinal = colordodge(ImageUtils.getBlue(filterInt), ImageUtils.getBlue(srcInt));

                source[j][i] = ImageUtils.setColor(redValueFinal, greenValueFinal, blueValueFinal);
            }
        }

        return source;
    }

    private int[][] invertColors(int source[][]) {
        int pixelColor;
        int red, green, blue;

        int imgWidth = source.length;
        int imgHeight = source[0].length;
        for (int y = 0; y < imgHeight; y++) {
            for (int x = 0; x < imgWidth; x++) {
                pixelColor = source[x][y];

                red = 255 - ImageUtils.getRed(pixelColor);
                green = 255 - ImageUtils.getGreen(pixelColor);
                blue = 255 - ImageUtils.getBlue(pixelColor);

                source[x][y] = ImageUtils.setColor(red, green, blue);
            }
        }
        return source;
    }

    private int colordodge(int in1, int in2) {
        float image = (float) in2;
        float mask = (float) in1;
        return ((int) ((image == 255) ? image : Math.min(255, (((long) mask << 8) / (255 - image)))));
    }
}