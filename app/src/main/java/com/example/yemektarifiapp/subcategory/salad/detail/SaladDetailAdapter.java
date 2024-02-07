package com.example.yemektarifiapp.subcategory.salad.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemSubDetailBinding;

import java.util.List;

public class SaladDetailAdapter extends RecyclerView.Adapter<SaladDetailAdapter.DetailHolder> {

    private ItemSubDetailBinding binding;

    private final List<SaladDetailModel> list;

    public SaladDetailAdapter(List<SaladDetailModel> list) {
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
        SaladDetailModel saladDetailModel = list.get(position);
        binding.ivDetailPicture.setImageResource(saladDetailModel.getImageId());
        binding.tvDetailCalorie.setText(saladDetailModel.getCalorie());
        binding.tvDetailPerson.setText(saladDetailModel.getPerson());
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
