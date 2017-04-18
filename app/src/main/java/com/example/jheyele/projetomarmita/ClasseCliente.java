package com.example.jheyele.projetomarmita;

/**
 * Created by Jheyele on 18/04/2017.
 */

public class ClasseCliente extends ClasseUsuario {
    private String bairro;
    private String rua;
    private String num;
    private int telefone;


    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
