package com.wtiinfo.training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OneFragment.OnInverterListener {

    private OneFragment input;
    private TwoFragment result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input  = new OneFragment();
        result = new TwoFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.framelayout_one, input, "INPUT");
        ft.add(R.id.framelayout_two, result, "RESULT");
        ft.commit();

    }

    @Override
    public void invertedText(String txt) {
        result.inverter(txt);
    }
}