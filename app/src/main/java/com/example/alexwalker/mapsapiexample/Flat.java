package com.example.alexwalker.mapsapiexample;

/**
 * Created by alexwalker on 25.04.17.
 */

class Flat {
    private String lat;
    private String lng;
    private String title;
    private String description;

    public Flat() {
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
