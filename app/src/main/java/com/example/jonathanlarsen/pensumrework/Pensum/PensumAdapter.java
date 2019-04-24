package com.example.jonathanlarsen.pensumrework.Pensum;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonathanlarsen.pensumrework.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;

public class PensumAdapter extends RecyclerView.Adapter<PensumAdapter.ViewHolder> {

    public List<PensumModel> pensumModelList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title, teacher, comment, pages, pagesToGo;

        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            teacher = view.findViewById(R.id.teacher);
            comment = view.findViewById(R.id.comment);
            pages = view.findViewById(R.id.pages);
            pagesToGo = view.findViewById(R.id.pagesToGo);
        }
    }

    public PensumAdapter(List<PensumModel> pensumModelList){
        this.pensumModelList = pensumModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pensum_item, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       PensumModel pensumModel = pensumModelList.get(position);
       holder.title.setText(pensumModel.getTitle());
       holder.teacher.setText(pensumModel.getTeacher());
       holder.comment.setText(pensumModel.getComment());
       holder.pages.setText(String.valueOf(pensumModel.getPages()));
       holder.pagesToGo.setText(String.valueOf(pensumModel.getPagesToGo()));

    }

    @Override
    public int getItemCount() {
        return pensumModelList.size();
    }
}
