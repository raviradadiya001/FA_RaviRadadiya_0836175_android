package com.example.fa_raviradadiya_0836175_android.model;

public class MapModel {
    int id;
    String placename,streetname,cityname,countryname;

    public MapModel(int id, String placename, String streetname, String cityname, String countryname) {
        this.id = id;
        this.placename = placename;
        this.streetname = streetname;
        this.cityname = cityname;
        this.countryname = countryname;
    }

    public int getId() {
        return id;
    }

    public String getPlacename() {
        return placename;
    }

    public String getStreetname() {
        return streetname;
    }

    public String getCityname() {
        return cityname;
    }

    public String getCountryname() {
        return countryname;
    }
}
