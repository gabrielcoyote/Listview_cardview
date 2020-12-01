package com.example.apex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MeuAdaptador extends RecyclerView.Adapter {

    ArrayList<Comidas> comidas;
    Context context;
    OnItemClickListener listener;

    public MeuAdaptador(ArrayList<Comidas> comidas , Context context, OnItemClickListener listener) {
        this.comidas = comidas;
        this.context = context;
        this.listener = listener;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.celula,parent,false);
        MeuViewHolder meuViewHolder = new MeuViewHolder(view);
        return meuViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MeuViewHolder meuViewHolder = (MeuViewHolder) holder;
        Comidas meuEpisodio = comidas.get(position);
        meuViewHolder.titulo.setText(meuEpisodio.getNome());
        meuViewHolder.imagem.setImageResource(comidas.get(position).fotoLocal);

        meuViewHolder.bind(comidas.get(position), listener);

    }

    @Override
    public int getItemCount() {
        return comidas.size();
    }

    public  interface OnItemClickListener{
        void onItemClick(Comidas comidas);


    }
}