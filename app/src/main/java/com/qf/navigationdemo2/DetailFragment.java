package com.qf.navigationdemo2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        String name = getArguments().getString("name");
        String name1 = getArguments().getString("my_name");

        TextView textView = view.findViewById(R.id.textView1);
        textView.setText(name1);

        // Inflate the layout for this fragment
        return view;
    }
}