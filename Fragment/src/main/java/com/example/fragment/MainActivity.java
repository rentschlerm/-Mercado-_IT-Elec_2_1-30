package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button FragA, FragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragA = (Button) findViewById(R.id.button4);
        FragmentB = (Button) findViewById(R.id.button5);

        FragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        FragmentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void loadFragment(Fragment fragment){
        FragmentManager fs = getFragmentManager();
        FragmentTransaction fragmentTransaction = fs.beginTransaction();
       // fragmentTransaction.replace(R.id.framelayout)
        fragmentTransaction.commit();

    }
}