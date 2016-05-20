
package com.mohamedsalama.spark42.data.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("modelId")
    @Expose
    private String modelId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("shopUrl")
    @Expose
    private String shopUrl;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("season")
    @Expose
    private String season;
    @SerializedName("seasonYear")
    @Expose
    private String seasonYear;
    @SerializedName("activationDate")
    @Expose
    private String activationDate;
    @SerializedName("additionalInfos")
    @Expose
    private List<Object> additionalInfos = new ArrayList<Object>();
    @SerializedName("genders")
    @Expose
    private List<String> genders = new ArrayList<String>();
    @SerializedName("ageGroups")
    @Expose
    private List<String> ageGroups = new ArrayList<String>();
    @SerializedName("brand")
    @Expose
    private Brand brand;
    @SerializedName("categoryKeys")
    @Expose
    private List<String> categoryKeys = new ArrayList<String>();
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = new ArrayList<Attribute>();
    @SerializedName("units")
    @Expose
    private List<Unit> units = new ArrayList<Unit>();
    @SerializedName("media")
    @Expose
    private Media media;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The modelId
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 
     * @param modelId
     *     The modelId
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The shopUrl
     */
    public String getShopUrl() {
        return shopUrl;
    }

    /**
     * 
     * @param shopUrl
     *     The shopUrl
     */
    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    /**
     * 
     * @return
     *     The color
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * 
     * @return
     *     The season
     */
    public String getSeason() {
        return season;
    }

    /**
     * 
     * @param season
     *     The season
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     * 
     * @return
     *     The seasonYear
     */
    public String getSeasonYear() {
        return seasonYear;
    }

    /**
     * 
     * @param seasonYear
     *     The seasonYear
     */
    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
    }

    /**
     * 
     * @return
     *     The activationDate
     */
    public String getActivationDate() {
        return activationDate;
    }

    /**
     * 
     * @param activationDate
     *     The activationDate
     */
    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    /**
     * 
     * @return
     *     The additionalInfos
     */
    public List<Object> getAdditionalInfos() {
        return additionalInfos;
    }

    /**
     * 
     * @param additionalInfos
     *     The additionalInfos
     */
    public void setAdditionalInfos(List<Object> additionalInfos) {
        this.additionalInfos = additionalInfos;
    }

    /**
     * 
     * @return
     *     The genders
     */
    public List<String> getGenders() {
        return genders;
    }

    /**
     * 
     * @param genders
     *     The genders
     */
    public void setGenders(List<String> genders) {
        this.genders = genders;
    }

    /**
     * 
     * @return
     *     The ageGroups
     */
    public List<String> getAgeGroups() {
        return ageGroups;
    }

    /**
     * 
     * @param ageGroups
     *     The ageGroups
     */
    public void setAgeGroups(List<String> ageGroups) {
        this.ageGroups = ageGroups;
    }

    /**
     * 
     * @return
     *     The brand
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The brand
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The categoryKeys
     */
    public List<String> getCategoryKeys() {
        return categoryKeys;
    }

    /**
     * 
     * @param categoryKeys
     *     The categoryKeys
     */
    public void setCategoryKeys(List<String> categoryKeys) {
        this.categoryKeys = categoryKeys;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The units
     */
    public List<Unit> getUnits() {
        return units;
    }

    /**
     * 
     * @param units
     *     The units
     */
    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    /**
     * 
     * @return
     *     The media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    public void setMedia(Media media) {
        this.media = media;
    }

}
