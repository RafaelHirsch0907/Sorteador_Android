package com.rafaelhirsch0907dev.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View view){
        int a = new Random().nextInt(101);
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText(a);
    }
}