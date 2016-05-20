package com.mohamedsalama.spark42.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.mohamedsalama.spark42.R;
import com.mohamedsalama.spark42.adapter.ProductsAdapter;
import com.mohamedsalama.spark42.data.model.Content;
import com.mohamedsalama.spark42.mvp.presenter.ProductPresenter;
import com.mohamedsalama.spark42.mvp.view.ProductsContract;

import java.util.ArrayList;
import java.util.List;

public class ProductsFragment extends Fragment implements ProductsContract.View{

    private ProductsAdapter productsAdapter;

    private ProductPresenter productPresenter;

    private ProgressBar progressBarLoading;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        productsAdapter = new ProductsAdapter(getContext(), new ArrayList<Content>());

        productPresenter = new ProductPresenter(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        productPresenter.loadProducts("1", "sale");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        productPresenter.stopPresenter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_products, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //init recycle view
        RecyclerView recyclerViewDevices =
                (RecyclerView) view.findViewById(R.id.products_recycleView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewDevices.setLayoutManager(layoutManager);
        recyclerViewDevices.setHasFixedSize(true);
        recyclerViewDevices.setAdapter(productsAdapter);

        progressBarLoading = (ProgressBar) view.findViewById(R.id.loading_progressBar);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void showProducts(List<Content> products) {
        productsAdapter.replaceData(products);
    }

    @Override
    public void showFailureMessage() {

    }

    @Override
    public void hideProgress() {
        progressBarLoading.setVisibility(View.GONE);
    }
}
