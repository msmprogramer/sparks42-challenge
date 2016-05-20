package com.mohamedsalama.spark42.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mohamedsalama.spark42.R;
import com.mohamedsalama.spark42.data.model.Content;
import com.squareup.picasso.Picasso;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    private List<Content> products;
    private Context context;
    public ProductsAdapter(Context context, List<Content> products) {
        this.context = context;
        setList(products);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View productView = inflater.inflate(R.layout.product_item, parent, false);
        ProductViewHolder holder = new ProductViewHolder(productView);
        return holder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder productViewHolder, int position) {
        Content content = products.get(position);

        productViewHolder.textViewProductName.setText(content.getName());

        productViewHolder.textViewProductBrand.setText(content.getBrand().getName());



        String productImageUrl = content.getMedia().getImages().get(0).getThumbnailHdUrl();

        if (productImageUrl != null && !productImageUrl.isEmpty()) {
            Picasso.with(context).load(productImageUrl)
                    .placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher)
                    .into(productViewHolder.imageViewProductImage
                    );
        } else {
            productViewHolder.imageViewProductImage.
                    setImageResource(R.mipmap.ic_launcher
                    );
        }
    }

    public void replaceData(List<Content> products) {
        setList(products);
        notifyDataSetChanged();
    }

    private void setList(@NonNull List<Content> products) {
        this.products = checkNotNull(products);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewProductName;
        public TextView textViewProductBrand;
        public TextView textViewProductPrice;
        public ImageView imageViewProductImage;

        public ProductViewHolder(View itemView) {
            super(itemView);
            textViewProductName = (TextView) itemView.findViewById(R.id.textView_productName);
            textViewProductBrand = (TextView) itemView.findViewById(R.id.textView_ProductBrand);
            textViewProductPrice = (TextView) itemView.findViewById(R.id.textView_ProductPrice);
            imageViewProductImage = (ImageView) itemView.findViewById(R.id.imgView_productImage);
        }

    }
}
