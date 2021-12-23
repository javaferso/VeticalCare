package com.example.veticalcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import Objetos.Usuarios;

public class Home_Act extends AppCompatActivity {

    VideoView videoView;
    Usuarios us = new Usuarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        videoView = (VideoView) findViewById(R.id.videoView4);
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=iQ3g-gqKe_A");
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath(String.valueOf(uri));
        videoView.requestFocus();
        videoView.start();
    }
    public void Gestion_fichas (View view){
        Intent i = new Intent(this,Gestion_Animales_Act.class);
        startActivity(i);
    }
    public void Calcular_ingresos (View view){
        Intent i = new Intent(this,Ingresos_Act.class);
        startActivity(i);
    }
}