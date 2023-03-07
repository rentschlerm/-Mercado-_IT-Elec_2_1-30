package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class myList extends AppCompatActivity {

    String listItem [] ;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);
        listView = (ListView) findViewById(R.id.listView);
        listItem = getResources().getStringArray(R.array.List_Item);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView, listItem);
        listView.setAdapter(arrayAdapter);
    }
}