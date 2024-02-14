package com.example.myapplication.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemDoggyBinding;
import com.example.myapplication.domain.Person;
import com.example.myapplication.domain.Pets;

import java.util.List;

public class DoggyAdapter extends RecyclerView.Adapter<DoggyViewHolder> {

    private List<Pets> petsList;

    public DoggyAdapter(List<Pets> pets) {
        this.petsList = pets;
    }

    @NonNull
    @Override
    public DoggyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDoggyBinding binding = ItemDoggyBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new DoggyViewHolder(binding);
    }
    public void setPetsList(List<Pets> petsList) {
        this.petsList = petsList;
    }

    @Override
    public void onBindViewHolder(@NonNull DoggyViewHolder holder, int position) {
        holder.bind(petsList.get(position));
    }

    @Override
    public int getItemCount() {
        return petsList.size();
    }
}
