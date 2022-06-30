package com.example.citypets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegistroUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_user);
        Intent intent = getIntent();
        /*String miusuario = intent.getStringExtra("miusuario");
        TextView miTexto = findViewById(R.id.txtMensaje);
        miTexto.setText(miusuario);*/
    }
}