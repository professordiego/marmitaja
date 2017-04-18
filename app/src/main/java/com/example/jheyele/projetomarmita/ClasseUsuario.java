package com.example.jheyele.projetomarmita;

/**
 * Created by Jheyele on 18/04/2017.
 */

public abstract class ClasseUsuario {

    private String nome;
    private String senha;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}


