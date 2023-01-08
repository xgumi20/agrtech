package com.example.agrtech.fragments;

import android.content.Intent;
import android.os.Bundle;


import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agrtech.R;


import com.example.agrtech.cucumber;
import com.example.agrtech.melon;
import com.example.agrtech.nepheliumlappaceum;
import com.example.agrtech.papaya;
import com.example.agrtech.pineapple;
import com.example.agrtech.watermelon;

public class FruitFragment extends Fragment{

    CardView melonCrd, cucumberCrd, papayaCrd, watermelonCrd, pineappleCrd, rambutanCrd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fruit, container, false);


        melonCrd = view.findViewById(R.id.melonCard);
        cucumberCrd = view.findViewById(R.id.cucumberCard);
        papayaCrd = view.findViewById(R.id.papayaCard);
        watermelonCrd = view.findViewById(R.id.watermelonCard);
        pineappleCrd = view.findViewById(R.id.pineappleCard);
        rambutanCrd = view.findViewById(R.id.rambutanCard);

        melonCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), melon.class);
                startActivity(in);
            }
        });

        cucumberCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), cucumber.class);
                startActivity(in);
            }
        });

        papayaCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), papaya.class);
                startActivity(in);
            }
        });

        watermelonCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), watermelon.class);
                startActivity(in);
            }
        });
        pineappleCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), pineapple.class);
                startActivity(in);
            }
        });
        rambutanCrd .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), nepheliumlappaceum.class);
                startActivity(in);
            }
        });

        return view;
    }



}