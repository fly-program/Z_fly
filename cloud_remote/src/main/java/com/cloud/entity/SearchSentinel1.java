package com.cloud.entity;

import java.util.Date;

public class SearchSentinel1 {
    private int search_Id;
    private int user_Id;
    private Date start_Date;
    private Date end_Date;
    private String area;
    private String satellite_Platform;
    private String product_Type;
    private String polarisation;
    private String sensor_Mode;
    private String relative_Orbit_Num;
    private String collection;

    public int getSearch_Id() {
        return search_Id;
    }

    public void setSearch_Id(int search_Id) {
        this.search_Id = search_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public Date getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(Date start_Date) {
        this.start_Date = start_Date;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(Date end_Date) {
        this.end_Date = end_Date;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSatellite_Platform() {
        return satellite_Platform;
    }

    public void setSatellite_Platform(String satellite_Platform) {
        this.satellite_Platform = satellite_Platform;
    }

    public String getProduct_Type() {
        return product_Type;
    }

    public void setProduct_Type(String product_Type) {
        this.product_Type = product_Type;
    }

    public String getPolarisation() {
        return polarisation;
    }

    public void setPolarisation(String polarisation) {
        this.polarisation = polarisation;
    }

    public String getSensor_Mode() {
        return sensor_Mode;
    }

    public void setSensor_Mode(String sensor_Mode) {
        this.sensor_Mode = sensor_Mode;
    }

    public String getRelative_Orbit_Num() {
        return relative_Orbit_Num;
    }

    public void setRelative_Orbit_Num(String relative_Orbit_Num) {
        this.relative_Orbit_Num = relative_Orbit_Num;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Search_sentinel1{" +
                "search_Id=" + search_Id +
                ", user_Id=" + user_Id +
                ", start_Date=" + start_Date +
                ", end_Date=" + end_Date +
                ", area='" + area + '\'' +
                ", satellite_Platform='" + satellite_Platform + '\'' +
                ", product_Type='" + product_Type + '\'' +
                ", polarisation='" + polarisation + '\'' +
                ", sensor_Mode='" + sensor_Mode + '\'' +
                ", relative_Orbit_Num='" + relative_Orbit_Num + '\'' +
                ", collection='" + collection + '\'' +
                '}';
    }
}
