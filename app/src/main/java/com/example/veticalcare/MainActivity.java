package com.example.veticalcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import Objetos.Usuarios;

public class MainActivity extends AppCompatActivity {

    private TextView name,pass;

    Usuarios us = new Usuarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.name);
        pass = (TextView) findViewById(R.id.pass);
    }
    public void Salir(View view){

        finish();

    }

    public void Validar(View view){

        String [] list_name = us.getName();
        String [] list_pass = us.getPass();

        String v_name = name.getText().toString();
        String v_pass = pass.getText().toString();

        if (v_name.equals(list_name[0]) && v_pass.equals(list_pass[0])){

            Intent home = new Intent(this, Home_Act.class);
            startActivity(home);
        }
        else{
            Toast.makeText(getApplicationContext(), "datos incorrecto,\nintententalo denuevo ", Toast.LENGTH_SHORT).show();
        }
    }
}