package com.example.listviewfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Itemf> {
   private Context context;
   private int resourceLayout;

   public ItemAdapter(Context context, int resourceLayout, ArrayList<Itemf> itemlist){
       super(context,resourceLayout,itemlist);
       this.resourceLayout=resourceLayout;
       this.context=context;
   }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View view =convertView;
       if(view ==null){
           LayoutInflater vi;
           vi= LayoutInflater.from(context);
           view= vi.inflate(resourceLayout,null);
       }

       Itemf itemlist= getItem(position);

       if(itemlist != null){
           TextView textView= view.findViewById(R.id.titulo);
           TextView textViewdatos= view.findViewById(R.id.datos);
           ImageView imagen= view.findViewById(R.id.imageView);

           if(textView != null){
               textView.setText(itemlist.getTitulo());
           }

           if(textViewdatos != null){
               textViewdatos.setText(itemlist.getDatos());
           }

           if (imagen != null){
               imagen.setImageResource(itemlist.getImagenid());
           }
       }
        return  view;
    }
}
