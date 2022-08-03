package com.wtiinfo.training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft;

    OneFragment oneFragment = new OneFragment();
    TwoFragment twoFragment = new TwoFragment();
    ThreeFragment threeFragment = new ThreeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ft = fm.beginTransaction();
        ft.add(R.id.topfrag,oneFragment, "TOPO");
        ft.addToBackStack(null);
        ft.commit();

        ft = fm.beginTransaction();
        ft.add(R.id.centerfrag, twoFragment, "CENTRO");
        ft.addToBackStack(null);
        ft.commit();

        ft = fm.beginTransaction();
        ft.add(R.id.bottomfrag, threeFragment, "BASE");
        ft.addToBackStack(null);
        ft.commit();
    }
}