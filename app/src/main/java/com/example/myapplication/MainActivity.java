package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

RecyclerView miRecyclerView;
RecyclerView.LayoutManager miLayoutManager;
RecyclerView.Adapter miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miRecyclerView = findViewById(R.id.miRecycler);

        miLayoutManager = new GridLayoutManager(this, 2);
        miRecyclerView.setLayoutManager(miLayoutManager);

        String[] datos = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        miAdaptador = new Adaptador(datos);
        miRecyclerView.setAdapter(miAdaptador);
    }
}