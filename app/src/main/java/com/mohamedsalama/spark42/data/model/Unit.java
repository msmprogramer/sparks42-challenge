
package com.mohamedsalama.spark42.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Unit {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("originalPrice")
    @Expose
    private OriginalPrice originalPrice;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("stock")
    @Expose
    private Integer stock;

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
     *     The size
     */
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The originalPrice
     */
    public OriginalPrice getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 
     * @param originalPrice
     *     The originalPrice
     */
    public void setOriginalPrice(OriginalPrice originalPrice) {
        this.originalPrice = originalPrice;
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
     *     The stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 
     * @param stock
     *     The stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

}
