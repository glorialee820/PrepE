package com.example.emergencypreparedness;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Checklist1 extends Fragment {


//    private static final Checklist ourInstance = new Checklist();

//    public static Checklist getInstance() {
//        return ourInstance;
//    }
//
//    public void Checklist() {
////        read();
//    }

    private String[] NAMES = new String[4]; //contains the string names of the items. won't change
    //can't be final though because has to be declared later
    private boolean empty = false;


    public Fragment_Checklist1() {

    }

private View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        Fragment_Checklist1 f = new Fragment_Checklist1();

        super.onCreate(savedInstanceState);
        rootView = inflater.inflate(R.layout.fragment_fragment__checklist1, container, false);

        read();



        // Inflate the layout for this fragment
        return  rootView;

    }

    private void read (){
        NAMES[0]= "one";
        NAMES[1] = "two";
        NAMES[2] = "three";
        NAMES[3] = "four";

        LinearLayout unchecked = rootView.findViewById(R.id.unchecked);

        for (int i = 0; i<NAMES.length; i++){
            addBox(unchecked, i);
        }
    }//adds all the boxes to the unchecked layout from the database

    public void checkOff(View view) {
        int id = view.getId();
        CheckBox chk = rootView.findViewById(id);

        LinearLayout unchecked = rootView.findViewById(R.id.unchecked);
        LinearLayout done = rootView.findViewById(R.id.done);

        if (chk.isChecked()) {
            //when a task is finished
            //final StrikethroughSpan STRIKE_THROUGH_SPAN = new StrikethroughSpan();
            removeBox(unchecked, id);
            addBox(done,id);

            CheckBox c = rootView.findViewById(id);//idk if i need this again cuz it's a diff reference?
            //c.setText("This is a test to check");//remove this line
            c.setTextColor(getResources().getColor(R.color.colorAccent));
            c.setChecked(true);

        } else {
            //if a tasks isn't actually finished
            removeBox(done, id);
            addBox(unchecked,id);

            CheckBox c = rootView.findViewById(id);
            //c.setText("This is a test to uncheck");
            c.setTextColor(getResources().getColor(R.color.colorPrimary));
            c.setChecked(false);

            //make a clause that if it's empty, make empty true.
        }
    }//end checkOff

    //makes all checkboxes checked
    public void clearAll(View view){
        //if (!empty) {
        LinearLayout done = rootView.findViewById(R.id.done);
        LinearLayout unchecked = rootView.findViewById(R.id.unchecked);
        for (int i = 0; i < NAMES.length; i++) {
            removeBox(unchecked, i);
            addBox(done, i);
            CheckBox c = rootView.findViewById(i);
            c.setTextColor(getResources().getColor(R.color.colorAccent));
            c.setChecked(true);
            //c.setText("went into clearAll");
        }
        //}
        //empty = true;
    }

    public void unselectAll (View view){
        //if (empty){
        LinearLayout done = rootView.findViewById(R.id.done);
        LinearLayout unchecked = rootView.findViewById(R.id.unchecked);
        for (int i = 0; i<NAMES.length; i++){
            removeBox(done,i);
            addBox(unchecked,i);
            CheckBox c = rootView.findViewById(i);
            c.setTextColor(getResources().getColor(R.color.colorPrimary));
            c.setChecked(false);
            //c.setText("went into unselect all");
        }
        //}
        //empty = false;
    }
    private void addBox (LinearLayout portion, int id){
        CheckBox c = new CheckBox(getActivity());
        c.setId(id);
        c.setText(NAMES[id]);
        portion.addView(c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkOff(v);
            }
        });

    }//generally adds a box to a portion

    private void removeBox (LinearLayout portion, int id){
        CheckBox c = rootView.findViewById(id);
        ((ViewGroup)c.getParent()).removeView(c);
    }//generally removes a box from a portion

}//end class

