package com.yezhik_ya.toy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yezhik_ya.model.Toy;
import com.yezhik_ya.model.Toys;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rvToys;
    private Toys toys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        CreateToy();
    }

    private void CreateToy() {
        toys.add(new Toy("azov oti", 1.436));
        toys.add(new Toy("azov oti", 2.26));
        toys.add(new Toy("azov oti", 100.0));
    }

    private void initializeViews() {
        rvToys = findViewById(R.id.rvToy);
        toys = new Toys();
    }


}