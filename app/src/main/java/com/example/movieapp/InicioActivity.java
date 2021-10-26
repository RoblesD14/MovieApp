package com.example.movieapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InicioActivity extends RecyclerView.Adapter<InicioActivity.ViewHolder> {

    private List<Pelicula> misDatos;
    private LayoutInflater layoutInflater;
    private Context context;

    public InicioActivity(List<Pelicula> misDatos, Context context) {
        this.misDatos = misDatos;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.activity_inicio, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.juntarData(misDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return misDatos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, descripcion;
        ImageView poster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            descripcion = itemView.findViewById(R.id.descripcion);
            poster = itemView.findViewById(R.id.poster);
        }

        public void juntarData(Pelicula item){
            String new_titulo = item.getTitulo()+" ("+item.getAnho()+")";
            titulo.setText(new_titulo);
            descripcion.setText(item.getDescripcion());
            poster.setImageResource(item.getPoster());
        }
    }
}

