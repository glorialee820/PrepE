package com.example.emergencypreparedness;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

import java.awt.font.TextAttribute;
import android.support.v7.app.AppCompatActivity;


public class Checklist extends AppCompatActivity {
//    private static final Checklist ourInstance = new Checklist();
//
//    public static Checklist getInstance() {
//        return ourInstance;
//    }
//
//    private Checklist() {
//       read();
//    }
//
//    private String[] NAMES = new String[4]; //contains the string names of the items. won't change
//    //can't be final though because has to be declared later
//    private boolean empty = false;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_fragment__checklist1);
//        read();
//    }
//    private void read (){
//        NAMES[0]= "one";
//        NAMES[1] = "two";
//        NAMES[2] = "three";
//        NAMES[3] = "four";
//
//        LinearLayout unchecked = findViewById(R.id.unchecked);
//
//        for (int i = 0; i<NAMES.length; i++){
//            addBox(unchecked, i);
//        }
//    }//adds all the boxes to the unchecked layout from the database
//
//    public void checkOff(View view) {
//        int id = view.getId();
//        CheckBox chk = findViewById(id);
//
//        LinearLayout unchecked = findViewById(R.id.unchecked);
//        LinearLayout done = findViewById(R.id.done);
//
//        if (chk.isChecked()) {
//            //when a task is finished
//            //final StrikethroughSpan STRIKE_THROUGH_SPAN = new StrikethroughSpan();
//            removeBox(unchecked, id);
//            addBox(done,id);
//
//            CheckBox c = findViewById(id);//idk if i need this again cuz it's a diff reference?
//            //c.setText("This is a test to check");//remove this line
//            c.setTextColor(getResources().getColor(R.color.colorChecked));
//            c.setChecked(true);
//
//        } else {
//            //if a tasks isn't actually finished
//            removeBox(done, id);
//            addBox(unchecked,id);
//
//            CheckBox c = findViewById(id);
//            //c.setText("This is a test to uncheck");
//            c.setTextColor(getResources().getColor(R.color.colorUnchecked));
//            c.setChecked(false);
//
//            //make a clause that if it's empty, make empty true.
//        }
//    }//end checkOff
//
//    //makes all checkboxes checked
//    public void clearAll(View view){
//        if (!empty) {
//            LinearLayout done = findViewById(R.id.done);
//            LinearLayout unchecked = findViewById(R.id.unchecked);
//            for (int i = 0; i < NAMES.length; i++) {
//                removeBox(unchecked, i);
//                addBox(done, i);
//                CheckBox c = findViewById(i);
//                c.setTextColor(getResources().getColor(R.color.colorChecked));
//                c.setChecked(true);
//                //c.setText("went into clearAll");
//            }
//        }
//        empty = true;
//    }
//
//    public void unselectAll (View view){
//        if (empty){
//            LinearLayout done = findViewById(R.id.done);
//            LinearLayout unchecked = findViewById(R.id.unchecked);
//            for (int i = 0; i<NAMES.length; i++){
//                removeBox(done,i);
//                addBox(unchecked,i);
//                CheckBox c = findViewById(i);
//                c.setTextColor(getResources().getColor(R.color.colorUnchecked));
//                c.setChecked(false);
//                //c.setText("went into unselect all");
//            }
//        }
//        empty = false;
//    }
//    private void addBox (LinearLayout portion, int id){
//        CheckBox c = new CheckBox(this);
//        c.setId(id);
//        c.setText(NAMES[id]);
//        portion.addView(c);
//        c.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                checkOff(v);
//            }
//        });
//
//    }//generally adds a box to a portion
//
//    private void removeBox (LinearLayout portion, int id){
//        CheckBox c = findViewById(id);
//        ((ViewGroup)c.getParent()).removeView(c);
//    }//generally removes a box from a portion
}
