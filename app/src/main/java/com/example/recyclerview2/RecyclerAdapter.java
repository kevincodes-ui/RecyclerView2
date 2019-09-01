package com.example.recyclerview2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private ArrayList<MainModel> mainModel;

    // RecyclerView recyclerView;
    RecyclerAdapter(ArrayList<MainModel> mainModel) {
        this.mainModel = mainModel;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.main_rv_item, parent, false);
        MyViewHolder _v = new MyViewHolder(listItem);
        return _v;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {

        holder.avatar.setImageResource(mainModel.get(position).getAvatar());
//        holder.messageState.setImageResource(mainModel.get(position).getMessageState());
        holder.title.setText(mainModel.get(position).getTitle());
        holder.message.setText(mainModel.get(position).getMessage());
        holder.sentAt.setText(mainModel.get(position).getSentAt());
    }

    @Override
    public int getItemCount() {
        return mainModel.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView avatar,messageState;
        public TextView title,message,sentAt;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.avatar = itemView.findViewById(R.id.avatar);
            this.messageState = itemView.findViewById(R.id.messageState);
            this.title = itemView.findViewById(R.id.title);
            this.message= itemView.findViewById(R.id.message);
            this.sentAt = itemView.findViewById(R.id.sentAt);
        }
    }
}
