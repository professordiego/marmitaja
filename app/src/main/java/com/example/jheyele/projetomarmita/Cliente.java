package com.example.jheyele.projetomarmita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
    }

    public void RealizarPedido(View view){

        Intent i = new Intent(Cliente.this,Pedido.class);
        startActivity(i);

    }


}
