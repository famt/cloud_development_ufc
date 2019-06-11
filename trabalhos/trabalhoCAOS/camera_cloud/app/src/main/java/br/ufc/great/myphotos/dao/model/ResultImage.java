package br.ufc.great.myphotos.dao.model;

import java.util.Date;

import android.graphics.Bitmap;

public final class ResultImage {
    private int id;
    private Date date;

    private long totalTime;

    private Bitmap bitmap;
    private AppConfiguration config;
    //private RpcProfile rpcProfile;

    public ResultImage(AppConfiguration config) {
        this();
        this.config = config;
        //  this.rpcProfile = new RpcProfile();
    }

    public ResultImage() {
        date = new Date();
    }

    public final int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public final Date getDate() {
        return date;
    }

    public final void setDate(Date date) {
        this.date = date;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public final AppConfiguration getConfig() {
        return config;
    }

    public final void setConfig(AppConfiguration config) {
        this.config = config;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

//    public void setRpcProfile(RpcProfile rpcProfile) {
//        this.rpcProfile = rpcProfile;
//    }
//
//    public RpcProfile getRpcProfile() {
//        return rpcProfile;
//    }

    @Override
    public String toString() {
        return "ResultImage [id=" + id + ", date=" + date + ", totalTime=" + totalTime + ", config=" + config + ", debug=";// + rpcProfile + "]";
    }
}