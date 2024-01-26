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

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailHolder> {

    private List<DetailModel> list;

    private DetailInterface detailInterface;


    public DetailAdapter(List<DetailModel> list, DetailInterface detailInterface) {
        this.list = list;
        this.detailInterface = detailInterface;
    }

    @NonNull
    @Override
    public DetailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sub_detail, parent, false);
        return new DetailHolder(view, detailInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailHolder holder, int position) {
        DetailModel detailModel = list.get(position);

        holder.ivSubListPicture.setImageResource(detailModel.getImageId());
        //holder.tvSubListRecipe.setText(detailModel.getRecipe());
        //holder.tvSubListMaterials.setText(detailModel.getMaterial());
        holder.tvSubListCalorie.setText(detailModel.getCalorie());
        holder.tvSubListPerson.setText(detailModel.getPerson());
        holder.clDetail.setOnClickListener(v -> detailInterface.onItemClick(list.get(position), position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DetailHolder extends RecyclerView.ViewHolder {

        private ImageView ivSubListPicture;
        private TextView tvSubListRecipe, tvSubListMaterials, tvSubListCalorie, tvSubListPerson;
        public ConstraintLayout clDetail;
        private CardView cardViewDetail;


        public DetailHolder(@NonNull View itemView, DetailInterface selectDetailInterface) {
            super(itemView);
            ivSubListPicture = itemView.findViewById(R.id.ivDetailPicture);
            tvSubListRecipe = itemView.findViewById(R.id.tvDetailRecipe);
            tvSubListMaterials = itemView.findViewById(R.id.tvDetailMaterial);
            tvSubListCalorie = itemView.findViewById(R.id.tvDetailCalorie);
            tvSubListPerson = itemView.findViewById(R.id.tvDetailPerson);
            clDetail = itemView.findViewById(R.id.clDetail);
            cardViewDetail = itemView.findViewById(R.id.cardViewDetail);
        }
    }
}
