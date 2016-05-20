
package com.mohamedsalama.spark42.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("value")
    @Expose
    private Double value;
    @SerializedName("formatted")
    @Expose
    private String formatted;

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The value
     */
    public Double getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The formatted
     */
    public String getFormatted() {
        return formatted;
    }

    /**
     * 
     * @param formatted
     *     The formatted
     */
    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

}
