package com.directmedia.onlinestore.core.entity;

public class Work {
    private String title;
    private String genre;
    private int release;
    private String summary;
    private Artist mainArtist;

    public Work() {
    }

    public Work(String title) {
        this.title = title;
    }
}
