package com.mohamedsalama.spark42.data.api;

import com.mohamedsalama.spark42.data.model.ProductResponse;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface ProductsApi {

    @GET("/articles")
    void listProducts(
            @Query("page") String page,
            @Query("pageSize") String pageSize,
            @Query("sort") String sortType,
            Callback<ProductResponse> itemCallback);

}
