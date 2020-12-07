package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

RecyclerView miRecyclerView;
RecyclerView.LayoutManager miLayoutManager;
RecyclerView.Adapter miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miRecyclerView = findViewById(R.id.miRecycler);

        miLayoutManager = new LinearLayoutManager(this);
        miRecyclerView.setLayoutManager(miLayoutManager);

        // String[] datos = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        List<Producto> datosComplejos = new ArrayList<>();
        datosComplejos.add(new Producto(R.drawable.uno,"Americana traje", (float) 199.99));
        datosComplejos.add(new Producto(R.drawable.dos,"Pantalon Traje", (float) 59.99));
        datosComplejos.add(new Producto(R.drawable.tres,"Gorro Lana", (float) 25.25));
        datosComplejos.add(new Producto(R.drawable.cuatro,"Guantes de Cuero", (float) 40.85));
        datosComplejos.add(new Producto(R.drawable.cinco,"Casaca de Cuero", (float) 250.18));

        miAdaptador = new AdaptadorComplejo(datosComplejos);
        miRecyclerView.setAdapter(miAdaptador);
    }
}