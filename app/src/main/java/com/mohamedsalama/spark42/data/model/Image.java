
package com.mohamedsalama.spark42.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("orderNumber")
    @Expose
    private Integer orderNumber;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("thumbnailHdUrl")
    @Expose
    private String thumbnailHdUrl;
    @SerializedName("smallUrl")
    @Expose
    private String smallUrl;
    @SerializedName("smallHdUrl")
    @Expose
    private String smallHdUrl;
    @SerializedName("mediumUrl")
    @Expose
    private String mediumUrl;
    @SerializedName("mediumHdUrl")
    @Expose
    private String mediumHdUrl;
    @SerializedName("largeUrl")
    @Expose
    private String largeUrl;
    @SerializedName("largeHdUrl")
    @Expose
    private String largeHdUrl;

    /**
     * 
     * @return
     *     The orderNumber
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 
     * @param orderNumber
     *     The orderNumber
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The thumbnailHdUrl
     */
    public String getThumbnailHdUrl() {
        return thumbnailHdUrl;
    }

    /**
     * 
     * @param thumbnailHdUrl
     *     The thumbnailHdUrl
     */
    public void setThumbnailHdUrl(String thumbnailHdUrl) {
        this.thumbnailHdUrl = thumbnailHdUrl;
    }

    /**
     * 
     * @return
     *     The smallUrl
     */
    public String getSmallUrl() {
        return smallUrl;
    }

    /**
     * 
     * @param smallUrl
     *     The smallUrl
     */
    public void setSmallUrl(String smallUrl) {
        this.smallUrl = smallUrl;
    }

    /**
     * 
     * @return
     *     The smallHdUrl
     */
    public String getSmallHdUrl() {
        return smallHdUrl;
    }

    /**
     * 
     * @param smallHdUrl
     *     The smallHdUrl
     */
    public void setSmallHdUrl(String smallHdUrl) {
        this.smallHdUrl = smallHdUrl;
    }

    /**
     * 
     * @return
     *     The mediumUrl
     */
    public String getMediumUrl() {
        return mediumUrl;
    }

    /**
     * 
     * @param mediumUrl
     *     The mediumUrl
     */
    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    /**
     * 
     * @return
     *     The mediumHdUrl
     */
    public String getMediumHdUrl() {
        return mediumHdUrl;
    }

    /**
     * 
     * @param mediumHdUrl
     *     The mediumHdUrl
     */
    public void setMediumHdUrl(String mediumHdUrl) {
        this.mediumHdUrl = mediumHdUrl;
    }

    /**
     * 
     * @return
     *     The largeUrl
     */
    public String getLargeUrl() {
        return largeUrl;
    }

    /**
     * 
     * @param largeUrl
     *     The largeUrl
     */
    public void setLargeUrl(String largeUrl) {
        this.largeUrl = largeUrl;
    }

    /**
     * 
     * @return
     *     The largeHdUrl
     */
    public String getLargeHdUrl() {
        return largeHdUrl;
    }

    /**
     * 
     * @param largeHdUrl
     *     The largeHdUrl
     */
    public void setLargeHdUrl(String largeHdUrl) {
        this.largeHdUrl = largeHdUrl;
    }

}
