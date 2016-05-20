package com.mohamedsalama.spark42.mvp.view;

import com.mohamedsalama.spark42.data.model.Content;

import java.util.List;

public interface ProductsContract {

    interface View {

        void showProducts(List<Content> products);

        void showFailureMessage();

        void hideProgress();
    }

    interface UserActionsListener {

        void loadProducts(String page, String sortType);

        void stopPresenter();
    }
}
