package com.example.volley_100posts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.volley_100posts.DataModel;
import com.example.volley_100posts.MainActivity;
import com.example.volley_100posts.R;

import java.util.ArrayList;

public class Recyclerview_Adapter extends RecyclerView.Adapter<Recyclerview_Adapter.RecyclerviewHolder> {
    MainActivity mainActivity;
    ArrayList<DataModel> list;

    public Recyclerview_Adapter(MainActivity mainActivity, ArrayList<DataModel> list) {
        this.mainActivity = mainActivity;
        this.list = list;
    }

    @NonNull
    @Override
    public Recyclerview_Adapter.RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_item,parent,false);
        RecyclerviewHolder holder = new RecyclerviewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerview_Adapter.RecyclerviewHolder holder, int position) {
        holder.id.setText(""+list.get(position).getId());
        holder.title.setText(list.get(position).getTitel());
        holder.userId.setText(""+list.get(position).getUserId());
        holder.body.setText(list.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerviewHolder extends RecyclerView.ViewHolder {
        TextView id,title,userId,body;
        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.recyclerview_id);
            title = itemView.findViewById(R.id.recyclerview_title);
            userId = itemView.findViewById(R.id.recyclerview_userId);
            body = itemView.findViewById(R.id.recyclerview_body);
        }
    }
}
