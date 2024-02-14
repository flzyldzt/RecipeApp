package com.example.yemektarifiapp.util.networking;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.yemektarifiapp.R;

public class GlideProvider {

    Context context;

    public GlideProvider(Context context) {
        this.context = context;
    }

    public void initGlide(String url, ImageView imageView) {
        Glide.with(context)
                .load(url)
                .error(R.drawable.error)
                .into(imageView);
    }
}
