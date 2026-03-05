package com.example.rishu.fragactivitycommunication;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener{

    Button b ;
    OnFragmentInteractionListener onFragmentInteractionListener;
    int i=0;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        b = v.findViewById(R.id.button);
        b.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        if (onFragmentInteractionListener!=null) {
            onFragmentInteractionListener.onFragmentInteraction(i++);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            onFragmentInteractionListener = (OnFragmentInteractionListener) context;
        }
    }
}
