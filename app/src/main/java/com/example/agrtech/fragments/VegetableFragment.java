package com.example.agrtech.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agrtech.Bittergouard;
import com.example.agrtech.Chillipepper;
import com.example.agrtech.Eggplant;
import com.example.agrtech.Ladiesfinger;
import com.example.agrtech.Onion;
import com.example.agrtech.Pechay;
import com.example.agrtech.R;
import com.example.agrtech.Squash;
import com.example.agrtech.Tomato;

public class VegetableFragment extends Fragment {

    CardView tomatoCrd, eggplantCrd, bitterGourdCrd, pechayCrd, squashCrd, chiliPepperCrd, onionCrd, okraCrd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vegetable, container, false);
        tomatoCrd = view.findViewById(R.id.tomatoCard);
        eggplantCrd = view.findViewById(R.id.eggplantCard);
        bitterGourdCrd = view.findViewById(R.id.bitterGourdCard);
        pechayCrd = view.findViewById(R.id.pechayCard);
        squashCrd = view.findViewById(R.id.squashCard);
        chiliPepperCrd = view.findViewById(R.id.chilli_PepperCard);
        onionCrd = view.findViewById(R.id.onionCard);
        okraCrd = view.findViewById(R.id.ladiesFingerCard);


        tomatoCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Tomato.class);
                startActivity(in);
            }
        });
        eggplantCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Eggplant.class);
                startActivity(in);
            }
        });
        bitterGourdCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Bittergouard.class);
                startActivity(in);
            }
        });
        pechayCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Pechay.class);
                startActivity(in);
            }
        });
        squashCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Squash.class);
                startActivity(in);
            }
        });
        chiliPepperCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Chillipepper.class);
                startActivity(in);
            }
        });
        onionCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Onion.class);
                startActivity(in);
            }
        });
        okraCrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Ladiesfinger.class);
                startActivity(in);
            }
        });




























        return view;
    }
}