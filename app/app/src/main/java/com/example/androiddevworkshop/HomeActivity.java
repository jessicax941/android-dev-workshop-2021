package com.example.androiddevworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class HomeActivity extends AppCompatActivity {

    private ListView foodListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        foodListView = findViewById(R.id.list_view);

        ArrayList<String> foods = new ArrayList<>();
        // Add dummy data
        String[] stringArray = {"Cheese Burger", "Truffle Fries", "Vegan Burger", "Vanilla Ice Cream",
                "Chocolate Sundae"};
        Collections.addAll(foods, stringArray);
        System.out.println("foodsList: " + foods.toString());

        // Adapter for filling ListView with data
        ArrayAdapter<String> foodsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, // Built-in layout for a list item
                foods
        );

        foodListView.setAdapter(foodsAdapter);
    }
}