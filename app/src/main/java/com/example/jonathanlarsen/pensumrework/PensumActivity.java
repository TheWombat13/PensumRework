package com.example.jonathanlarsen.pensumrework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.jonathanlarsen.pensumrework.Pensum.PensumFragment;

import java.util.Objects;

public class PensumActivity extends AppCompatActivity {

    public Toolbar toolbar;
    private Fragment fragment_pensum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pensum);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).show();

        fragment_pensum = new PensumFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment_pensum);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
