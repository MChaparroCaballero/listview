package com.example.listviewfinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private ItemAdapter adapter;
    private ArrayList<Itemf.Item> itemlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listview =findViewById(R.id.listView);
        itemlist= new ArrayList<>();

    itemlist.add(new Itemf.Item(R.drawable.donut,"Donut", "Donut de chocolate",false));
    itemlist.add(new Itemf.Item(R.drawable.cruasant,"Cruasant", "Cruasant artesanal sin relleno",false));
    itemlist.add(new Itemf.Item(R.drawable.napolitana,"Napolitana", "Napolitana de chocolate",false));
    itemlist.add(new Itemf.Item(R.drawable.brownie,"Brownie", "Brownie de chocolate",false));
    itemlist.add(new Itemf.Item(R.drawable.pepito,"Pepito", "Pepito de chocolate",false));
    itemlist.add(new Itemf.Item(R.drawable.flautachocolate,"Flauta", "Flauta de chocolate",false));
    itemlist.add(new Itemf.Item(R.drawable.fartoon,"Fartoon", "bollo valenciano",false));
    itemlist.add(new Itemf.Item(R.drawable.galletas,"Galletas", "Galletas con pepitas de chocolate",false));

    adapter = new ItemAdapter(itemlist);
    listview.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }



}
public class ItemAdapter extends BaseAdapter {
    private ArrayList<Itemf.Item> itemList;
    private LayoutInflater inflater;

    // Constructor
    public ItemAdapter(ArrayList<Itemf.Item> itemList, MainActivity context) {
        this.itemList = itemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        // Aquí deberías configurar las vistas de tu ítem (como TextView, ImageView, etc.)
        // por ejemplo:
        // ImageView imageView = convertView.findViewById(R.id.imageView);
        // imageView.setImageResource(itemList.get(position).getImagenid());
        // TextView title = convertView.findViewById(R.id.title);
        // title.setText(itemList.get(position).getTitulo());

        return convertView;
    }
}
