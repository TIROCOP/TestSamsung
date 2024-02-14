package com.example.myapplication.recycler;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemDoggyBinding;
import com.example.myapplication.domain.Pets;

public class DoggyViewHolder extends RecyclerView.ViewHolder {
    private ItemDoggyBinding binding;

    public DoggyViewHolder(ItemDoggyBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Pets item) {
        binding.tvBreed.setText(item.getBreed());
//        binding.tvImg.setImageURI(item.getImgUrl());
//        int resID;
//        resID = context.getResources().getIdentifier(item.getImgUrl(),
//                "drawable", .getPackageName());
//        binding.tvImg.setImageResource(resID);
        binding.tvName.setText(item.getName());
    }
}
