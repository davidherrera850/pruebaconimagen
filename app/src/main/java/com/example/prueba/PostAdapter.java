package com.example.prueba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private List<Post> postList;
    private Context context;

    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post personajes = postList.get(position);
        holder.elementos(personajes);

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView id;
        TextView nombre;
        TextView apodo;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.id);
            nombre=itemView.findViewById(R.id.nombre);
            apodo=itemView.findViewById(R.id.apodo);
            imagen=itemView.findViewById(R.id.imageView);
        }
        public void elementos(Post item){
            nombre.setText(item.getNombre());
            id.setText(item.getId());
            apodo.setText(item.getApodo());
            Glide.with(itemView).load(item.getImagen()).into(imagen);

        }
    }

}
