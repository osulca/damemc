package com.example.myapplication;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorComplejo extends RecyclerView.Adapter<AdaptadorComplejo.ViewHolder> {
    private List<Producto> misDatos;

    public AdaptadorComplejo(List<Producto> misDatos) {
        this.misDatos = misDatos;
    }

    @NonNull
    @Override
    public AdaptadorComplejo.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.items_complejos, parent, false);

        ViewHolder miViewHolder = new AdaptadorComplejo.ViewHolder(view);
        return miViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorComplejo.ViewHolder holder, int position) {
        holder.traerDatos(misDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return misDatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProducto;
        TextView tvNombre, tvPrecio;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProducto = itemView.findViewById(R.id.imgProducto);
            tvNombre = itemView.findViewById(R.id.tvNombres);
            tvPrecio = itemView.findViewById(R.id.tvPrecio);
        }

        public void traerDatos(Producto producto) {
            imgProducto.setImageResource(producto.getImagen());
            tvNombre.setText(producto.getNombre());
            tvPrecio.setText("$ "+String.valueOf(producto.getPrecio()));
        }
    }
}
