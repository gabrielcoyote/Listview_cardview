package com.example.apex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navigationView;
    RecyclerView recyclerView;
    ArrayList<Comidas> comidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.Navegetion);
        navigationView.setOnNavigationItemSelectedListener(this);

        WebView webView = findViewById(R.id.WebView);
        webView.loadUrl("https://www.tudogostoso.com.br/");

       // carregar Atraves de html

       // String html = "<html><body>Hello World WebView</body></html>";
       // webView.loadData(html, "text/html", "UTF-8");
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {



            case R.id.Pratos: {
                Intent I = new Intent(MainActivity.this, Pratos.class);
                startActivity(I);
                break;
            }
            case R.id.Bebidas: {
                Intent I = new Intent(MainActivity.this, Bebidas.class);
                startActivity(I);
                break;
            }
            case R.id.Sobremesas: {
                Intent I = new Intent(MainActivity.this, Sobremesas.class);
                startActivity(I);
                break;
            }


        }

        return true;
    }


}