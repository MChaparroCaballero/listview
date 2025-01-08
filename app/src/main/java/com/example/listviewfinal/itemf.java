package com.example.listviewfinal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Itemf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemf); // Asegúrate de tener este archivo XML

        // Habilitar el ajuste para los márgenes de las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Clase Item, corregido el nombre de Iteme a Item
    public static class Item {
        private int imagenid;
        private String titulo;
        private String datos;
        private boolean selecionado;

        // Constructor
        public Item(int imagenid, String titulo, String datos, boolean selecionado) {
            this.imagenid = imagenid;
            this.titulo = titulo;
            this.datos = datos;
            this.selecionado = selecionado;
        }

        // Getters
        public int getImagenid() {
            return imagenid;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getDatos() {
            return datos;
        }

        public boolean isSelecionado() {
            return selecionado;
        }
    }
}
