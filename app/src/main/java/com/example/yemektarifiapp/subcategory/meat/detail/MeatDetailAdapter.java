package com.example.yemektarifiapp.subcategory.meat.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemDetailBinding;

import java.util.List;

public class MeatDetailAdapter extends RecyclerView.Adapter<MeatDetailAdapter.DetailHolder> {
    private ItemDetailBinding binding;
    private final List<MeatDetailModel> list;

    public MeatDetailAdapter(List<MeatDetailModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MeatDetailAdapter.DetailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemDetailBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DetailHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MeatDetailAdapter.DetailHolder holder, int position) {
        MeatDetailModel meatDetailModel = list.get(position);
        binding.ivDetailPicture.setImageResource(meatDetailModel.getImageId());
        binding.tvDetailCalorie.setText(meatDetailModel.getCalorie());
        binding.tvDetailPerson.setText(meatDetailModel.getPerson());
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
