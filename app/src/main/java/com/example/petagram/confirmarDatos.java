package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Button btn2 = (Button) findViewById(R.id.btnvolver);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent2, 0);
            }
        });
        Bundle bundle = getIntent().getExtras();
        String fraseimportada=bundle.getString("frase");
        String fraseimportada1=bundle.getString("frase1");
        String fraseimportada2=bundle.getString("frase2");
        String fraseimportada3=bundle.getString("frase3");

        String textoPasado = fraseimportada;
        String textoPasado1 = fraseimportada1;
        String textoPasado2 = fraseimportada2;
        String textoPasado3 = fraseimportada3;

        TextView out = (TextView)findViewById(R.id.lblnombre);
        out.setText(textoPasado);

        TextView out1 = (TextView)findViewById(R.id.lbltel);
        out1.setText(textoPasado1);

        TextView out2 = (TextView)findViewById(R.id.lblemail);
        out2.setText(textoPasado2);

        TextView out3 = (TextView)findViewById(R.id.lbldesc);
        out3.setText(textoPasado3);

    }
}