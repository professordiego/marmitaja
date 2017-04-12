package com.example.jheyele.projetomarmita;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadastro extends AppCompatActivity {

    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        button3 = (Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder a = new AlertDialog.Builder(Cadastro.this);
                a.setMessage("Cadastro Realizado com Sucesso!");
                a.setNeutralButton("OK", null);
                a.show();

                Intent i = new Intent(Cadastro.this,Cliente.class);
                startActivity(i);
            }
        });
    }

        public void backLogin(View view){

        Intent i = new Intent(Cadastro.this,Principal.class);
        startActivity(i);
    }

}

