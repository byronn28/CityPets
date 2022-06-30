package com.example.citypets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button botonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonIngresar=findViewById(R.id.btnIngresar);
        iniciaControl();
    }

    private void iniciaControl(){
        botonIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText miTxtUsuario=findViewById(R.id.txtUsuario);
                String usuario = miTxtUsuario.getText().toString();
                Intent intent = new Intent(getApplicationContext(),RegistroUser.class);
                intent.putExtra("usuarioNombre",usuario);
                startActivity(intent);
            }
        });
    }
}