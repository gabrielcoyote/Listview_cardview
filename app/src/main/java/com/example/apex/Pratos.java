package com.example.apex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Pratos extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Comidas> comidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratos);

        recyclerView = findViewById(R.id.minhalista);
        comidas = new ArrayList<Comidas>();

        comidas.add(new Comidas("ARROZ INTEGRAL COM ABÓBORA",R.drawable.arroz));
        comidas.add(new Comidas("BIFE À PARMEGIANA",R.drawable.bife));
        comidas.add(new Comidas("FRANGO ASSADO COM ERVAS",R.drawable.frango));

        MeuAdaptador meuAdaptador = new MeuAdaptador(comidas, getApplicationContext(), new MeuAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Comidas personagens) { }
        });
        recyclerView.setAdapter(meuAdaptador);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
    }
    }
