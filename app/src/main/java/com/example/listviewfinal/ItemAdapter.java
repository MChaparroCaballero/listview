package com.example.listviewfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

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
        return itemList.get(position).getImagenid();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            convertView = inflater.inflate(R.layout.activity_itemf, parent, false);
        }
        Itemf.Item itemc =itemList.get(position);

        ImageView imageView = convertView.findViewById(R.id.imageView);
        CheckBox checkBox = convertView.findViewById(R.id.checkBox);
        TextView tituloTextview= convertView.findViewById(R.id.titulo);
        TextView descripcionTextview = convertView.findViewById(R.id.datos);

        /****falta poner los valores de la itemlist***/
        imageView.setImageResource(itemc.getImagenid());
        checkBox.setChecked(itemc.isSelecionado());
        tituloTextview.setText(itemc.getTitulo());
        descripcionTextview.setText(itemc.getDatos());


        return convertView;
    }
}
