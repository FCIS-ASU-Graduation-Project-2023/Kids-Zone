package com.example.kidszone.app_model;

import android.graphics.drawable.Drawable;

public class AppModel {
    String appName;
    Drawable icon;
    int status; // 0 --> Blocked App, 1 --> Unblocked App
    String packageName;

    public AppModel(String appName, Drawable icon, int status, String packageName) {
        this.appName = appName;
        this.icon = icon;
        this.status = status;
        this.packageName = packageName;
    }

    public AppModel(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int compareTo(AppModel app) {
        return this.getAppName().compareTo(app.appName);
    }
}
