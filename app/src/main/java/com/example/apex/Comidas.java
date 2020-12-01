package com.example.apex;

public class Comidas {

    private String Nome;
    private String descriçao;


    int fotoLocal;


    public String getNome() {
        return Nome;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public int getFotoLocal() {
        return fotoLocal;
    }

    public Comidas(String nome, int fotoLocal) {
        Nome = nome;
        this.fotoLocal = fotoLocal;
    }


}