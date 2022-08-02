package com.wtiinfo.training;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TwoFragment extends Fragment {

    private TextView txt;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.two, container, false);

        txt = view.findViewById(R.id.txtInverted);

        return view;
    }

    public void inverter(String str) {
        if(str != null) {
            String inverted = new StringBuilder(str).reverse().toString();
            txt.setText(inverted);
        }
    }

}
