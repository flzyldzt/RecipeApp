package com.example.yemektarifiapp.subcategory.legume.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemDetailBinding;

import java.util.List;

public class LegumeDetailAdapter extends RecyclerView.Adapter<LegumeDetailAdapter.DetailHolder> {

    private ItemDetailBinding binding;
    private final List<LegumeDetailModel> list;

    public LegumeDetailAdapter(List<LegumeDetailModel> list) {
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
        LegumeDetailModel legumeDetailModel = list.get(position);

        binding.ivDetailPicture.setImageResource(legumeDetailModel.getImageId());
        binding.tvDetailCalorie.setText(legumeDetailModel.getCalorie());
        binding.tvDetailPerson.setText(legumeDetailModel.getPerson());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DetailHolder extends RecyclerView.ViewHolder {
        private final ItemDetailBinding binding;

        public DetailHolder(ItemDetailBinding detailBinding) {
            super(detailBinding.getRoot());
            binding = detailBinding;
        }
    }
}
