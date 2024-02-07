package com.example.yemektarifiapp.subcategory.dessert.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.ItemCategorySubBinding;
import com.example.yemektarifiapp.subcategory.dessert.networking.DessertTariffResponseModel;

import java.util.List;

public class DessertCategoryAdapter extends RecyclerView.Adapter<DessertCategoryAdapter.CategoryListHolder> {

    private ItemCategorySubBinding binding;

    private final List<DessertTariffResponseModel> list;

    private final DessertTariffOnClickInterface dessertTariffOnClickInterface;

    public DessertCategoryAdapter(List<DessertTariffResponseModel> categorySubList, DessertTariffOnClickInterface dessertTariffOnClickInterface) {
        this.list = categorySubList;
        this.dessertTariffOnClickInterface = dessertTariffOnClickInterface;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategorySubBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CategoryListHolder(binding, dessertTariffOnClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, int position) {
        DessertTariffResponseModel dessertTariffItem = list.get(position);
        binding.tvSubCategoryText.setText(dessertTariffItem.getName());
        //  binding.ivSubCategoryPicture.setImageURI(Uri.parse(soapTariffItem.getIcon()));  //TODO Glide kullanılacak
        binding.ivSubCategoryPicture.setImageResource(R.drawable.ic_soup);
        binding.clCategorySub.setOnClickListener(v -> dessertTariffOnClickInterface.onItemClick(list.get(position), position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {
        ItemCategorySubBinding binding;

        public CategoryListHolder(ItemCategorySubBinding categorySubBinding, DessertTariffOnClickInterface dessertTariffOnClickInterface) {
            super(categorySubBinding.getRoot());
            binding = categorySubBinding;
        }
    }
}
