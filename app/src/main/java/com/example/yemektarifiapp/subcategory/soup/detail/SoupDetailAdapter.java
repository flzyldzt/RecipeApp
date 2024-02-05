package com.example.yemektarifiapp.subcategory.soup.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemSubDetailBinding;

import java.util.List;

public class SoupDetailAdapter extends RecyclerView.Adapter<SoupDetailAdapter.DetailHolder> {

    private ItemSubDetailBinding binding;

    private final List<SoupDetailModel> list;

    public SoupDetailAdapter(List<SoupDetailModel> list) {
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
