package com.example.listviewfinal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Itemf {
private String titulo;
private String datos;
private int imagenid;

    public Itemf(String titulo, String datos, int imagenid){
    this.titulo=titulo;
    this.datos=datos;
    this.imagenid=imagenid;
}

    public int getImagenid() {
        return imagenid;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDatos() {
        return datos;
    }
}
