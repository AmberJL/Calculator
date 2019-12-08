package com.example.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class huiLvFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.huilv_fragment,container,false);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final EditText input = getActivity().findViewById(R.id.input);
        final TextView output = getActivity().findViewById(R.id.output);
        final Spinner in =  getActivity().findViewById(R.id.in);
        final Spinner out = getActivity().findViewById(R.id.out);
        Button button = getActivity().findViewById(R.id.start_hui);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(in.getSelectedItem().toString().equals("人民币")&&out.getSelectedItem().toString().equals("美元")){
                        output.setText(String.valueOf(Double.valueOf(input.getText().toString())/7.0754));
                    }else if(in.getSelectedItem().toString().equals("美元")&&out.getSelectedItem().toString().equals("人民币")){
                        output.setText(String.valueOf(Double.valueOf(input.getText().toString())*7.0754));
                    }else {
                        output.setText(input.getText().toString());
                    }
                }catch (Exception e)
                {
                    output.setText("转换出错");
                }

            }
        });

    }
}
