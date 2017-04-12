package com.example.jheyele.projetomarmita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }


    public void TelaCliente(View view){
        Intent x = new Intent(Principal.this,Cliente.class);
        startActivity(x);
    }

    public void GoForRegister(View view){
        Intent i = new Intent(Principal.this,Cadastro.class);
        startActivity(i);
    }


}
