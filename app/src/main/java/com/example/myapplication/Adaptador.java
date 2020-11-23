package com.example.myapplication;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MiViewHolder> {
    private String[] misDatos;

    public Adaptador(String[] datos) {
        misDatos = datos;
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {
        TextView tvDias;
        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDias = itemView.findViewById(R.id.tvItem);
        }
    }

    @NonNull
    @Override
    public Adaptador.MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("ResourceType")
        View miVista = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.lista, parent, false);
        MiViewHolder miViewHolder = new MiViewHolder(miVista);
        return miViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.MiViewHolder miHolder, int position) {
        miHolder.tvDias.setText(misDatos[position]);
    }

    @Override
    public int getItemCount() {
        return misDatos.length;
    }
}
