package com.mohamedsalama.spark42.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.mohamedsalama.spark42.R;
import com.mohamedsalama.spark42.adapter.ProductsAdapter;
import com.mohamedsalama.spark42.data.model.Content;
import com.mohamedsalama.spark42.mvp.presenter.ProductPresenter;
import com.mohamedsalama.spark42.mvp.view.ProductsContract;
import com.mohamedsalama.spark42.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class ProductsFragment extends Fragment implements ProductsContract.View{

    private static final String TAG = "ProductsFragment";

    private final static int PAGE = 1;
    private final static int PAGE_SIZE = 100;

    private ProductsAdapter productsAdapter;

    private ProductPresenter productPresenter;

    private ProgressBar progressBarLoading;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        productsAdapter = new ProductsAdapter(getContext(), new ArrayList<Content>());

        productPresenter = new ProductPresenter(this);

        setHasOptionsMenu(true);
    }

    @Override
    public void onResume() {
        super.onResume();
        loadProducts(Constants.SALE_SORT_TYPE);
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
        RecyclerView recyclerViewProducts =
                (RecyclerView) view.findViewById(R.id.products_recycleView);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProducts.setLayoutManager(layoutManager);
        recyclerViewProducts.setHasFixedSize(true);

        recyclerViewProducts.setAdapter(productsAdapter);

        progressBarLoading = (ProgressBar) view.findViewById(R.id.loading_progressBar);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_sort_options, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menuSortSale) {
            loadProducts(Constants.SALE_SORT_TYPE);
        } else if (id == R.id.menuSortPopularity) {
            loadProducts(Constants.POPULARITY_SORT_TYPE);
        } else if (id == R.id.menuSortLowPrice) {
            loadProducts(Constants.LOW_PRICE_SORT_TYPE);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showProducts(List<Content> products) {
        Log.d(TAG, "showProducts: "+products.size());
        productsAdapter.replaceData(products);
    }

    @Override
    public void showFailureMessage() {
        Log.d(TAG, "showProducts: fail");
        Snackbar.make(getView(),
                getString(R.string.error_failed_load_products_message),
                Snackbar.LENGTH_SHORT).
                show();
    }

    @Override
    public void showProgress() {
        progressBarLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBarLoading.setVisibility(View.GONE);
    }

    private void loadProducts(String sortType) {
        productPresenter.loadProducts(PAGE, PAGE_SIZE , sortType);
    }
}
