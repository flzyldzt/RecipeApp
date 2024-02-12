package com.example.yemektarifiapp.subcategory.soup.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemDetailBinding;

import java.util.List;

public class SoupDetailAdapter extends RecyclerView.Adapter<SoupDetailAdapter.DetailHolder> {

    private ItemDetailBinding binding;

    private final List<SoupDetailModel> list;

    public SoupDetailAdapter(List<SoupDetailModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DetailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemDetailBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DetailHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailHolder holder, int position) {
        SoupDetailModel soupDetailModel = list.get(position);

        binding.ivDetailPicture.setImageResource(soupDetailModel.getImageId());
        binding.tvDetailCalorie.setText(soupDetailModel.getCalorie());
        binding.tvDetailPerson.setText(soupDetailModel.getPerson());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DetailHolder extends RecyclerView.ViewHolder {

        ItemDetailBinding binding;

        public DetailHolder(ItemDetailBinding detailBinding) {
            super(detailBinding.getRoot());
            binding = detailBinding;
        }
    }
}
