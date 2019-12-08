package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class changeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.change,container,false);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final TextView len_res = (TextView)getActivity().findViewById(R.id.length_output);
        final EditText len_in = (EditText)getActivity().findViewById(R.id.length_input);
        final TextView V_res = (TextView)getActivity().findViewById(R.id.V_output);
        final EditText V_in = (EditText)getActivity().findViewById(R.id.V_input);
        final TextView jinzhi_res = (TextView)getActivity().findViewById(R.id.jinzhi_output);
        final EditText jinzhi_in = (EditText)getActivity().findViewById(R.id.jinzhi_input);
        final Spinner len_in_danwei = (Spinner)getActivity().findViewById(R.id.len_danwei_in);
        final Spinner len_out_danwei = (Spinner)getActivity().findViewById(R.id.len_danwei_out);
        final Spinner V_in_danwei = (Spinner)getActivity().findViewById(R.id.V_out);
        final Spinner V_out_danwei = (Spinner)getActivity().findViewById(R.id.V_in);
        final Spinner jinzhi_in_danwei = (Spinner)getActivity().findViewById(R.id.jinzhi_in);
        final Spinner jinzhi_out_danwei = (Spinner)getActivity().findViewById(R.id.jinzhi_out);
        Button start_len = (Button)getActivity().findViewById(R.id.start_len);
        Button start_V = (Button)getActivity().findViewById(R.id.start_V);
        Button start_jinzhi = (Button)getActivity().findViewById(R.id.start_jinzhi);

        start_len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double input = Double.valueOf(len_in.getText().toString());
                    String in_danwei  = len_in_danwei.getSelectedItem().toString();
                    //以米为单位
                    double in_bei = 0;
                    if(in_danwei.equals("厘米"))
                    {
                        in_bei=0.01;
                    }else if(in_danwei.equals("米")){
                        in_bei=1;
                    }else {
                        in_bei=1000;
                    }
                    double in = in_bei*input;
                    double out = 0;
                    String out_danwei = len_out_danwei.getSelectedItem().toString();
                    if (out_danwei.equals("厘米")){
                        out = 0.01;
                    }else  if(out_danwei.equals("米")){
                        out = 1;
                    }else {
                        out = 1000;
                    }
                    double res = in/out;
                    len_res.setText(String.valueOf(res));

                }catch (Exception e)
                {
                    len_res.setText("转换出错");
                }
            }
        });
        start_V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double input = Double.valueOf(V_in.getText().toString());
                    String in_danwei  = V_in_danwei.getSelectedItem().toString();
                    //以dm为单位
                    double in_bei = 0;
                    if(in_danwei.equals("cm^3"))
                    {
                        in_bei=0.001;
                    }else if(in_danwei.equals("dm^3")){
                        in_bei=1;
                    }else {
                        in_bei=1000;
                    }
                    double in = in_bei*input;
                    Log.i("in ||in_bei",String.valueOf(in)+" || "+String.valueOf(in_bei));
                    double out = 0;
                    String out_danwei = V_out_danwei.getSelectedItem().toString();
                    if (out_danwei.equals("cm^3")){
                        out = 0.001;
                    }else  if(out_danwei.equals("dm^3")){
                        out = 1;
                    }else {
                        out = 1000;
                    }
                    Log.i("out",String.valueOf(out));
                    double res = in/out;
                    V_res.setText(String.valueOf(res));
                }catch (Exception e)
                {
                    V_res.setText("转换出错");
                }
            }
        });
        start_jinzhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
                    int input = Integer.valueOf(jinzhi_in.getText().toString());
                    String in_danwei  = jinzhi_in_danwei.getSelectedItem().toString();

                    int in = 0;
                    if(in_danwei.equals("十"))
                    {
                        in = input;
                    }else if(in_danwei.equals("八")){
                       in = (int) Integer.parseInt(String.valueOf(input),8);
                    }else {
                        in = (int) Integer.parseInt(String.valueOf(input),2);
                    }

                    String out_danwei = jinzhi_out_danwei.getSelectedItem().toString();
                    if (out_danwei.equals("十")){
                        jinzhi_res.setText(String.valueOf(in));
                    }else  if(out_danwei.equals("八")){
                        jinzhi_res.setText(Integer.toOctalString(in));
                    }else {
                        jinzhi_res.setText(Integer.toBinaryString(in));

                    }


//                }catch (Exception e)
//                {
//                    jinzhi_res.setText("转换出错");
//                }
            }
        });
    }

}
