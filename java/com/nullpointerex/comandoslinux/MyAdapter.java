package com.nullpointerex.comandoslinux;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;
import static com.nullpointerex.comandoslinux.R.id.textViewManual;

/**
 * Created by felipesalazar on 13-08-17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public static String manu="";

    private List<Comando> listItems;
    private Context applicationContext;

    public MyAdapter(List<Comando> listItems, Context applicationContext) {
        this.listItems = listItems;
        this.applicationContext = applicationContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Comando listItem = listItems.get(position);
        holder.textViewComando.setText(listItem.getComando());
        holder.textViewDescripcion.setText(listItem.getDescripcion());
        holder.textViewCategoria.setText(listItem.getCategoria());
        manu = (String)(listItem.getDetalle());


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewComando;
        public TextView textViewDescripcion;
        public TextView textViewCategoria;
        public TextView manual;

        Comando listitem;
        public Toolbar header;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewComando = (TextView) itemView.findViewById(R.id.textViewComando);
            textViewDescripcion = (TextView) itemView.findViewById(R.id.textViewDescripcion);
            textViewCategoria = (TextView) itemView.findViewById(R.id.textViewCategoria);
            manual = (TextView) itemView.findViewById(R.id.textViewManual);

            header = (Toolbar) itemView.findViewById(R.id.toolbar);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override public void onClick(View itemView){

                    Log.e("INFO", "Card clicked");
                    Intent i = new Intent(applicationContext, ScrollingActivity.class);
//                    i.putExtra("titulo", textViewComando.getText());
                    i.putExtra("titulo", new String[] { (String)textViewComando.getText(), manu });

//                    i.putExtra("manual", manual.getText());

                    itemView.getContext().startActivity(i);




 //                   ScrollingActivity s = new ScrollingActivity();
//                    s.setHeader(header, listitem.getComando() );
                    //launchactivity();
                }
            });

        }
    }

}
