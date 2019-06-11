package br.ufc.great.myphotos.dao.model;

/**
 * Configuration UI Control
 * 
 */
public final class AppConfiguration {
    private String local;
    private String image;
    private String filter;
    private String size;
    private String outputDirectory;

    public AppConfiguration() {
        this(null, null, null, null);
    }

    public AppConfiguration(String local, String image, String filter, String size) {
        this.local = local;
        this.image = image;
        this.filter = filter;
        this.size = size;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    @Override
    public String toString() {
        return "AppConfiguration [local=" + local + ", image=" + image + ", filter=" + filter + ", size=" + size + ", outputDirectory=" + outputDirectory + "]";
    }
}