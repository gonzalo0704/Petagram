package com.example.petagram;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //Cargamos el texto a exportar
        final EditText textoexportar, textoeportartel,textoexportaremail,textoexportardesc;
        textoexportar=(EditText)findViewById(R.id.imputnombre);
        textoeportartel=(EditText)findViewById(R.id.editTextPhone);
        textoexportaremail =(EditText)findViewById(R.id.editTextTextEmailAddress);
        textoexportardesc=(EditText)findViewById(R.id.editTextTextPersonName2);

        Button btn = (Button) findViewById(R.id.btnsig);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), confirmarDatos.class);
                //Exportar parametro
                intent.putExtra("frase", textoexportar.getText().toString());
                intent.putExtra("frase1", textoeportartel.getText().toString());
                intent.putExtra("frase2", textoexportaremail.getText().toString());
                intent.putExtra("frase3", textoexportardesc.getText().toString());
                //
                startActivityForResult(intent, 0);
            }
        });
        };

    }



