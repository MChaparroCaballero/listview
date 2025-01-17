package com.example.listviewfinal;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listview;

    private ArrayList<Itemf> itemlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listview =findViewById(R.id.listView);
        itemlist= new ArrayList<>();

    itemlist.add(new Itemf("Donut", "Donut de chocolate",R.drawable.donut));
    itemlist.add(new Itemf("Cruasant", "Cruasant artesanal sin relleno",R.drawable.cruasant));
    itemlist.add(new Itemf("Napolitana", "Napolitana de chocolate",R.drawable.napolitana));
    itemlist.add(new Itemf("Brownie", "Brownie de chocolate",R.drawable.brownie));
    itemlist.add(new Itemf("Pepito", "Pepito de chocolate",R.drawable.pepito));
    itemlist.add(new Itemf("Flauta", "Flauta de chocolate",R.drawable.flautachocolate));
    itemlist.add(new Itemf("Fartoon", "bollo valenciano",R.drawable.fartoon));
    itemlist.add(new Itemf("Galletas", "Galletas con pepitas de chocolate",R.drawable.galletas));

    ItemAdapter myadapter = new ItemAdapter(this,R.layout.activity_itemf,itemlist);
    listview.setAdapter(myadapter);

    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Itemf bolloseleccionado = itemlist.get(position);
            Toast.makeText(MainActivity.this, "Has seleccionado: " + bolloseleccionado.getTitulo(), Toast.LENGTH_SHORT).show();
        }
    });
    }
}

