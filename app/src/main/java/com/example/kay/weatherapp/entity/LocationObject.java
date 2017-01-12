package com.example.kay.weatherapp.entity;

/**
 * Created by Kay on 2017/1/11.
 */

public class LocationObject {
    public LocationObject(int id, String locationCity, String weatherInformation) {
        this.id = id;
        this.locationCity = locationCity;
        this.weatherInformation = weatherInformation;
    }
    public String getLocationCity() {
        return locationCity;
    }
    public String getWeatherInformation() {
        return weatherInformation;
    }
    public int getId() {
        return id;
    }
}
