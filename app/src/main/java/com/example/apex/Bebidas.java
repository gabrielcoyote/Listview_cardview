package com.example.apex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Bebidas extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Comidas> comidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        recyclerView = findViewById(R.id.minhalistabebidas);
        comidas = new ArrayList<Comidas>();

        comidas.add(new Comidas("Batidas de frutas",R.drawable.batidafrutas));
        comidas.add(new Comidas("Gin Tônica",R.drawable.gintonica));
        comidas.add(new Comidas("Gin Mule",R.drawable.ginmule));


        MeuAdaptador meuAdaptador = new MeuAdaptador(comidas, getApplicationContext(), new MeuAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Comidas personagens) { }
        });
        recyclerView.setAdapter(meuAdaptador);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
    }
}

