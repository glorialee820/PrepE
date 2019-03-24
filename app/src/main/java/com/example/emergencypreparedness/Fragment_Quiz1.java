package com.example.emergencypreparedness;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Quiz1 extends Fragment {

    public boolean[] answers = new boolean[4];
    public String Zipcode;

    public Fragment_Quiz1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment__quiz1, container, false);
    }

    /*public void submitClicked (View view){
        /*RadioGroup q1 = findViewById(R.id.group1);
        int a1 = q1.getCheckedRadioButtonId();
        int radioButtonID = q1.getCheckedRadioButtonId();
        View radioButton = q1.findViewById(radioButtonID);

        // If you want position of Radiobutton
        int position = group.indexOfChild(radioButton);*/
       /* for (int i = 0; i<answers.length;i++){
            answers[i]=false;
        }

    }*/



}
