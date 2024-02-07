package com.example.yemektarifiapp.subcategory.vegetable.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemSubDetailBinding;

import java.util.List;

public class VegetableDetailAdapter extends RecyclerView.Adapter<VegetableDetailAdapter.DetailHolder> {
    private ItemSubDetailBinding binding;

    private final List<VegetableDetailModel> list;

    public VegetableDetailAdapter(List<VegetableDetailModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DetailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemSubDetailBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DetailHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailHolder holder, int position) {
        VegetableDetailModel vegetableDetailModel = list.get(position);

        binding.ivDetailPicture.setImageResource(vegetableDetailModel.getImageId());
        binding.tvDetailCalorie.setText(vegetableDetailModel.getCalorie());
        binding.tvDetailPerson.setText(vegetableDetailModel.getPerson());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DetailHolder extends RecyclerView.ViewHolder {
        ItemSubDetailBinding binding;

        public DetailHolder(ItemSubDetailBinding detailBinding) {
            super(detailBinding.getRoot());
            binding = detailBinding;
        }
    }
}
