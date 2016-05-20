
package com.mohamedsalama.spark42.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Brand {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("logoUrl")
    @Expose
    private String logoUrl;
    @SerializedName("logoLargeUrl")
    @Expose
    private String logoLargeUrl;
    @SerializedName("brandFamily")
    @Expose
    private BrandFamily brandFamily;
    @SerializedName("shopUrl")
    @Expose
    private String shopUrl;

    /**
     * 
     * @return
     *     The key
     */
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    public void setKey(String key) {
        this.key = key;
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
     *     The logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 
     * @param logoUrl
     *     The logoUrl
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * 
     * @return
     *     The logoLargeUrl
     */
    public String getLogoLargeUrl() {
        return logoLargeUrl;
    }

    /**
     * 
     * @param logoLargeUrl
     *     The logoLargeUrl
     */
    public void setLogoLargeUrl(String logoLargeUrl) {
        this.logoLargeUrl = logoLargeUrl;
    }

    /**
     * 
     * @return
     *     The brandFamily
     */
    public BrandFamily getBrandFamily() {
        return brandFamily;
    }

    /**
     * 
     * @param brandFamily
     *     The brandFamily
     */
    public void setBrandFamily(BrandFamily brandFamily) {
        this.brandFamily = brandFamily;
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

}
