package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;//declare adapterView
    ArrayList<CountriesModelClass> dataModels; // declare dataSource
    private static CustomAdapter adapter; // declare Adapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1- AdapterView: a listView
        listView = findViewById(R.id.listView);
        // 2-Data source
        dataModels = new ArrayList<>();


        //adding data
        dataModels.add(new CountriesModelClass("Brazil","5",R.drawable.brazil));
        dataModels.add(new CountriesModelClass("Germany","4",R.drawable.germany));
        dataModels.add(new CountriesModelClass("France","2",R.drawable.france));
        dataModels.add(new CountriesModelClass("Spain","1",R.drawable.spain));
        dataModels.add(new CountriesModelClass("United Kingdom","1",R.drawable.unitedkingdom));
        dataModels.add(new CountriesModelClass("Saudi Arabia","0",R.drawable.saudiarabia));
        dataModels.add(new CountriesModelClass("United States","0",R.drawable.unitedstates));
        dataModels.add(new CountriesModelClass("India","1",R.drawable.ic_launcher_background));
        // 3- Adapter
        adapter = new CustomAdapter(dataModels,getApplicationContext());
        listView.setAdapter(adapter);
        //4-handling event click listeners
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "Country " + adapter.getItem(position).getCountries_name()+"\n"+
                        "World Cups wins: "+adapter.getItem(position).getCups_win_count(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}