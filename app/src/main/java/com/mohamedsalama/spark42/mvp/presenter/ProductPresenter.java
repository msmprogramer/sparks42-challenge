package com.mohamedsalama.spark42.mvp.presenter;

import android.support.annotation.NonNull;

import com.mohamedsalama.spark42.data.api.ProductsApi;
import com.mohamedsalama.spark42.data.model.ProductResponse;
import com.mohamedsalama.spark42.data.rest.ProductRestClient;
import com.mohamedsalama.spark42.mvp.view.ProductsContract;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import static com.google.common.base.Preconditions.checkNotNull;

public class ProductPresenter implements ProductsContract.UserActionsListener {

    private ProductsContract.View productsView;

    private ProductsApi productsApi;

    public ProductPresenter(@NonNull ProductsContract.View productsView) {
        this.productsView = checkNotNull(productsView);
        productsApi =  ProductRestClient.getInstance().getService();
    }

    @Override
    public void loadProducts(String page, String sortType) {

        productsApi.listProducts(page, sortType, new Callback<ProductResponse>() {
            @Override
            public void success(ProductResponse productResponse, Response response) {

                if (productsView != null) {
                    productsView.hideProgress();
                    productsView.showProducts(productResponse.getContent());
                }

            }

            @Override
            public void failure(RetrofitError error) {
                if (productsView != null) {
                    productsView.hideProgress();
                    productsView.showFailureMessage();
                }
            }
        });
    }

    @Override
    public void stopPresenter() {
        productsView = null;
    }
}