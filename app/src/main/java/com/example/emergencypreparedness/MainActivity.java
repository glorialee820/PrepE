package com.example.emergencypreparedness;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

//    Checklist fragment_checklist = new Checklist();
    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewpager;
    PagerAdapter pageAdapter;

    RadioGroup radioGroup1;
    RadioButton radioButton1;

    RadioGroup radioGroup2;
    RadioButton radioButton2;


    RadioGroup radioGroup3;
    RadioButton radioButton3;


    RadioGroup radioGroup4;
    RadioButton radioButton4;

    TabItem tabQuiz;
    TabItem checklist;
    TabItem emergencyLocations;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);


        tablayout = findViewById(R.id.tab_layout);
        tabQuiz = findViewById(R.id.quiz);
        checklist = findViewById(R.id.checklist);
        emergencyLocations = findViewById(R.id.emergencyLocatios);
        viewpager = findViewById(R.id.viewpager);


        pageAdapter = new PageAdapter(getSupportFragmentManager(), tablayout.getTabCount());

        viewpager.setAdapter(pageAdapter);

        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));


        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 1) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            R.color.colorPrimary));
                    tablayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            R.color.colorPrimary));

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                R.color.colorPrimary));
                    }

                } else if (tab.getPosition() == 2) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            R.color.colorPrimary));
                    tablayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                R.color.colorPrimary));
                    }

                } else {

                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            R.color.colorPrimary));
                    tablayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                R.color.colorPrimary));
                    }

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

        radioGroup1 = (RadioGroup) findViewById(R.id.group1);
        radioGroup2 = (RadioGroup) findViewById(R.id.group2);
        radioGroup3 = (RadioGroup) findViewById(R.id.group3);
        radioGroup4 = (RadioGroup) findViewById(R.id.group4);
    }


}