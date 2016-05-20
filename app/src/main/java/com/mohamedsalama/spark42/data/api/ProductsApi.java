package com.mohamedsalama.spark42.data.api;

import com.mohamedsalama.spark42.data.model.ProductResponse;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface ProductsApi {

    @GET("/articles")
    void listProducts(
            @Query("page") int page,
            @Query("pageSize") int pageSize,
            @Query("sort") String sortType,
            Callback<ProductResponse> itemCallback);

}
