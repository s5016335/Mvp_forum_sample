package com.example.jiancheng.mvpmodel.Discuss;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jiancheng.mvpmodel.Model.Content;
import com.example.jiancheng.mvpmodel.R;

import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder>  {

    List<Content> contents;

    public ContentAdapter(List<Content> contents) {
        this.contents = contents;
    }

    @NonNull
    @Override
    public ContentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.conversation,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContentAdapter.ViewHolder holder, int position) {
        holder.contentname.setText(contents.get(position).Name);
        holder.content.setText(contents.get(position).Conversation);
        holder.contentdate.setText(contents.get(position).Date);
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView contentname,content,contentdate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contentname=  (TextView)itemView. findViewById(R.id.contentname);
            content=  (TextView)itemView. findViewById(R.id.content);
            contentdate=  (TextView)itemView. findViewById(R.id.contentdate);

        }
    }
}
