package com.example.yemektarifiapp.recipedetail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.ItemSubDetailBinding;

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailHolder> {

    private ItemSubDetailBinding binding;

    private List<DetailModel> list;

    public DetailAdapter(List<DetailModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DetailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemSubDetailBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sub_detail, parent, false);
        return new DetailHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailHolder holder, int position) {
        DetailModel detailModel = list.get(position);

        binding.ivDetailPicture.setImageResource(detailModel.getImageId());
        binding.tvDetailCalorie.setText(detailModel.getCalorie());
        binding.tvDetailPerson.setText(detailModel.getPerson());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DetailHolder extends RecyclerView.ViewHolder {

        ItemSubDetailBinding binding;

        //private ImageView ivSubListPicture;
        //private TextView  tvSubListCalorie, tvSubListPerson;

        public DetailHolder(ItemSubDetailBinding detailBinding) {
            super(detailBinding.getRoot());
            binding = detailBinding;
            /*ivSubListPicture = itemView.findViewById(R.id.ivDetailPicture);
            tvSubListCalorie = itemView.findViewById(R.id.tvDetailCalorie);
            tvSubListPerson = itemView.findViewById(R.id.tvDetailPerson);*/
        }
    }
}
