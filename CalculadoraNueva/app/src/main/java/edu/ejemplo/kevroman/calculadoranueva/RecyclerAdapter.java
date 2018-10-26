package edu.ejemplo.kevroman.calculadoranueva;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kevin roman on 18/02/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<String> listado;
    private metodoclick listener;

    public RecyclerAdapter(List<String> listado,metodoclick listener){
        this.listado = listado;
        this.listener =listener;
    }
    public  void setListado(List<String> listado){
        this.listado = listado;
        notifyDataSetChanged();
    }
    public void addListado(String text){
        listado.add(text);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        String text = listado.get(position);
        holder.text.setText(text);

    }

    @Override
    public int getItemCount() { return this.listado.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public ViewHolder(View itemView) {
            super(itemView);

            text = (TextView)itemView.findViewById(R.id.list_item);
        }

        public void onclick(final String valor, final metodoclick listener) {
            this.text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.click(valor);
                }
            });
        }
    }
}