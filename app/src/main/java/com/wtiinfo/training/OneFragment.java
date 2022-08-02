package com.wtiinfo.training;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OneFragment extends Fragment {

    private EditText edtTxt;
    private Button button;
    private OnInverterListener listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;

        if(!(activity instanceof OnInverterListener)) {
            throw new RuntimeException("A Activity não implementa a interface OneFragment.OnInverterListener");
        }

        listener = (OnInverterListener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.one, container, false);

        edtTxt = view.findViewById(R.id.edtTxt);
        button = view.findViewById(R.id.btn);

        button.setOnClickListener(e -> {
            String txt = edtTxt.getText().toString();
            listener.invertedText(txt);
        });

        return view;
    }

    public interface OnInverterListener {
        void invertedText(String txt);
    }
}
