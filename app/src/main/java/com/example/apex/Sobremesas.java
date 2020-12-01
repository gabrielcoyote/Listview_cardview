package com.example.apex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Sobremesas extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Comidas> comidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobremesas);

        recyclerView = findViewById(R.id.minhalistasobremesas);
        comidas = new ArrayList<Comidas>();

        comidas.add(new Comidas("Bolo de cenoura",R.drawable.bolo));
        comidas.add(new Comidas("Bolo simples",R.drawable.bolo));
        comidas.add(new Comidas("Bolo de banana de liquidificador",R.drawable.bolo));


        MeuAdaptador meuAdaptador = new MeuAdaptador(comidas, getApplicationContext(), new MeuAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Comidas personagens) { }
        });
        recyclerView.setAdapter(meuAdaptador);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
    }
}
