package com.example.yemektarifiapp.subcategory.dessert.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemDetailBinding;

import java.util.List;

public class DessertDetailAdapter extends RecyclerView.Adapter<DessertDetailAdapter.DetailHolder> {

    private ItemDetailBinding binding;

    private final List<DessertDetailModel> list;

    public DessertDetailAdapter(List<DessertDetailModel> list) {
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
        DessertDetailModel dessertDetailModel = list.get(position);
        binding.ivDetailPicture.setImageResource(dessertDetailModel.getImageId());
        binding.tvDetailCalorie.setText(dessertDetailModel.getCalorie());
        binding.tvDetailPerson.setText(dessertDetailModel.getPerson());
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


