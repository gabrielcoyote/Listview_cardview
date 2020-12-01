package com.example.apex;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MeuViewHolder extends RecyclerView.ViewHolder {

    public ImageView imagem;
    public TextView titulo;


    public MeuViewHolder(@NonNull View itemView) {
        super(itemView);

        imagem = itemView.findViewById(R.id.imagem_celula);
        titulo = itemView.findViewById(R.id.nome);



    }
    public void bind(final Comidas item, final MeuAdaptador.OnItemClickListener listener){

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(item);
            }
        });

    }
}