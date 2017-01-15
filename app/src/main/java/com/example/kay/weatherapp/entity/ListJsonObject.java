package com.example.kay.weatherapp.entity;

import com.google.gson.annotations.SerializedName;
import com.example.kay.weatherapp.json.Coord;

/**
 * Created by Kay on 2017/1/11.
 */

public class ListJsonObject {
    @SerializedName("_id")
    private String _id;
    @SerializedName("name")
    private String name;
    @SerializedName("country")
    private String country;
    @SerializedName("coord")
    private Coord coord;
    public ListJsonObject(String _id, String name, String country, Coord coord) {
        this._id = _id;
        this.name = name;
        this.country = country;
        this.coord = coord;
    }
    public String get_id() {
        return _id;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public Coord getCoord() {
        return coord;
    }
}
