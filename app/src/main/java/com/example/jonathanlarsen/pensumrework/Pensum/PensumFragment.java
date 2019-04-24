package com.example.jonathanlarsen.pensumrework.Pensum;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.jonathanlarsen.pensumrework.R;

import java.util.ArrayList;
import java.util.List;


public class PensumFragment extends Fragment implements View.OnClickListener {

    public static RecyclerView recyclerView;
    private PensumAdapter pensumAdapter;
    private Toolbar toolbar;
    PensumModel pensumModel;
    private List<PensumModel> pensumModelList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pensum, container, false);

        pensumAdapter = new PensumAdapter(pensumModelList);
        recyclerView = view.findViewById(R.id.pensumRecycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(pensumAdapter);


        Data();
        return view;
    }

    @Override
    public void onClick(View view) {

    }

    private void Data(){
        pensumModel = new PensumModel("title", "teacher", "comment", 1, 2);
        pensumModelList.add(pensumModel);
        pensumModel = new PensumModel("hello", "hej", "ohøj", 1, 2);
        pensumModelList.add(pensumModel);
        pensumModel = new PensumModel("hello", "hej", "ohøj", 1, 2);
        pensumModelList.add(pensumModel);
        pensumModel = new PensumModel("hello", "hej", "ohøj", 1, 2);
        pensumModelList.add(pensumModel);
        pensumModel = new PensumModel("hello", "hej", "ohøj", 1, 2);
        pensumModelList.add(pensumModel);
        pensumModel = new PensumModel("hello", "hej", "ohøj", 1, 2);
        pensumModelList.add(pensumModel);
        pensumModel = new PensumModel("hello", "hej", "ohøj", 1, 2);
        pensumModelList.add(pensumModel);
        pensumModel = new PensumModel("hello", "hej", "ohøj", 1, 2);
        pensumModelList.add(pensumModel);
        pensumModel = new PensumModel("hello", "hej", "ohøj", 1, 2);
        pensumModelList.add(pensumModel);

    }
}
