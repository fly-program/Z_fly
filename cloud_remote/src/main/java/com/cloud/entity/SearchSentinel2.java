package com.cloud.entity;

import java.util.Date;

public class SearchSentinel2 {
    private Integer searchId;

    private Integer userId;

    private Date startDate;

    private Date endDate;

    private String area;

    private String satellitePlatform;

    private String productType;

    private String relativeOrbitNum;

    private String cloudCover;

    public Integer getSearchId() {
        return searchId;
    }

    public void setSearchId(Integer searchId) {
        this.searchId = searchId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getSatellitePlatform() {
        return satellitePlatform;
    }

    public void setSatellitePlatform(String satellitePlatform) {
        this.satellitePlatform = satellitePlatform == null ? null : satellitePlatform.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getRelativeOrbitNum() {
        return relativeOrbitNum;
    }

    public void setRelativeOrbitNum(String relativeOrbitNum) {
        this.relativeOrbitNum = relativeOrbitNum == null ? null : relativeOrbitNum.trim();
    }

    public String getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover == null ? null : cloudCover.trim();
    }
}