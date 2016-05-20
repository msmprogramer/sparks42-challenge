package com.mohamedsalama.spark42.data.rest;

import com.mohamedsalama.spark42.data.api.ProductsApi;
import com.mohamedsalama.spark42.utils.Constants;
import retrofit.RestAdapter;
import retrofit.converter.SimpleXMLConverter;

public class ProductRestClient {

    private ProductsApi productsApi;

    private static ProductRestClient instance;

    public static ProductRestClient getInstance() {
        if(instance == null) {
            instance = new ProductRestClient();
        }
        return instance;
    }

    private ProductRestClient() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Constants.BACKEND_API_URL)
                .setConverter(new SimpleXMLConverter())
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();


        productsApi = restAdapter.create(ProductsApi.class);
    }

    public ProductsApi getService() {
        return productsApi;
    }
}
