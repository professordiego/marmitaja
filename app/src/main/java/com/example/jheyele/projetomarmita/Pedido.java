package com.example.jheyele.projetomarmita;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pedido extends AppCompatActivity {

    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        button6 = (Button)findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder p = new AlertDialog.Builder(Pedido.this);
                p.setMessage("Pedido Realizado!!");
                p.setNeutralButton("OK", null);
                p.show();
            }
        });


    }
}
