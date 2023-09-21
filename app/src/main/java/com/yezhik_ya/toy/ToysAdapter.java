package com.yezhik_ya.toy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yezhik_ya.model.Toy;
import com.yezhik_ya.model.Toys;

public class ToysAdapter extends RecyclerView.Adapter<ToysAdapter.toysHolder> {
    private Context context;
    private Toys toys;
    private int single_toy_layout;

    public ToysAdapter(Context context, Toys toys, int single_toy_layout)
    {
        this.context = context;
        this.toys = toys;
        this.single_toy_layout = single_toy_layout;
    }

    @NonNull
    @Override
    public ToysAdapter.toysHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new toysHolder(LayoutInflater.from(context).inflate(single_toy_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ToysAdapter.toysHolder holder, int position) {

        Toy toy = toys.get(position);

        if(toy != null){
            holder.etName.setText(toy.getName());
            holder.etPrice.setText(String.valueOf(toy.getPrice()));
        }
    }

    @Override
    public int getItemCount() {
        return (toys == null) ? 0 : toys.size();
    }
    public static class toysHolder extends RecyclerView.ViewHolder{

        public TextView etName;
        public TextView etPrice;
        public toysHolder(@NonNull View itemView) {
            super(itemView);

            itemView.findViewById(R.id.etName);
            itemView.findViewById(R.id.etPrice);
        }
    }
}
