package com.example.dialogfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

public class DialogFragment extends androidx.fragment.app.DialogFragment{

    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState){
        super.onCreateView(inflater,container,savedInstanceState);
        return inflater.inflate(R.layout.fragment_dialog,container,false);
    }

}
