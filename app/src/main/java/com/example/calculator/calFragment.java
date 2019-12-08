package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
public class calFragment extends Fragment  {
    Button num_1;
    Button num_2;
    Button num_3;
    Button num_4;
    Button num_5;
    Button num_6;
    Button num_7;
    Button num_8;
    Button num_9;
    Button jia;
    Button jian;
    Button cheng;
    Button chu;
    Button quyu;
    Button sin;
    Button cos;
    Button num_0;
    Button point;
    Button daoshu;
    Button cancel;
    Button e;
    Button deng;
    Button left;
    Button right;
    Button AC;
    TextView result;
    int heigth=0;
    int width=0;
    LinearLayout row1;
    LinearLayout row2;
    LinearLayout row3;
    LinearLayout row4;
    LinearLayout row5;
    public calFragment(){

    }
    public calFragment(int heigth,int width){
        this.heigth = heigth;
        this.width = width;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view;
        if(heigth>width){
            view = inflater.inflate(R.layout.cal_fragment,container,false);
        }else {
            view = inflater.inflate(R.layout.cal_land,container,false);
        }



//        row1 = view.findViewById(R.id.row1);
//        row2 = view.findViewById(R.id.row2);
//        row3 = view.findViewById(R.id.row3);
//        row4 = view.findViewById(R.id.row4);
//        row5 = view.findViewById(R.id.row5);
//        row1.setMinimumWidth(width);
//        row1.setMinimumHeight(heigth/10);
//        row2.setMinimumWidth(width);
//        row2.setMinimumHeight(heigth/10);
//        row3.setMinimumWidth(width);
//        row3.setMinimumHeight(heigth/10);
//        row4.setMinimumWidth(width);
//        row4.setMinimumHeight(heigth/10);
//        row5.setMinimumWidth(width);
//        row5.setMinimumHeight(heigth/10);

        result = view.findViewById(R.id.result);
//        result.setHeight(heigth/5);
//        result.setWidth(width);

        num_0=view.findViewById(R.id.num_0);
//        num_0.setHeight(perHeight);
//        num_0.setWidth(perWidth);
        num_1=view.findViewById(R.id.num_1);
//        num_1.setHeight(perHeight);
//        num_1.setWidth(perWidth);

        num_2=view.findViewById(R.id.num_2);
//        num_2.setHeight(perHeight);
//        num_2.setWidth(perWidth);
        num_3=view.findViewById(R.id.num_3);
//        num_3.setHeight(perHeight);
//        num_3.setWidth(perWidth);
        num_4=view.findViewById(R.id.num_4);
//        num_4.setHeight(perHeight);
//        num_4.setWidth(perWidth);
        num_5=view.findViewById(R.id.num_5);
//        num_5.setHeight(perHeight);
//        num_5.setWidth(perWidth);
        num_6=view.findViewById(R.id.num_6);
//        num_6.setHeight(perHeight);
//        num_6.setWidth(perWidth);
        num_7=view.findViewById(R.id.num_7);
//        num_7.setHeight(perHeight);
//        num_7.setWidth(perWidth);
        num_8=view.findViewById(R.id.num_8);
//        num_8.setHeight(perHeight);
//        num_8.setWidth(perWidth);
        num_9=view.findViewById(R.id.num_9);
//        num_9.setHeight(perHeight);
//        num_9.setWidth(perWidth);

        jia=view.findViewById(R.id.jia);
//        jia.setHeight(perHeight);
//        jia.setWidth(perWidth);
        jian=view.findViewById(R.id.jian);
//        jian.setHeight(perHeight);
//        jian.setWidth(perWidth);
        cheng=view.findViewById(R.id.cheng);
//        cheng.setHeight(perHeight);
//        cheng.setWidth(perWidth);
        chu=view.findViewById(R.id.chu);
//        chu.setHeight(perHeight);
//        chu.setWidth(perWidth);
        deng=view.findViewById(R.id.deng);
//        deng.setHeight(perHeight);
//        deng.setWidth(perWidth);
        left=view.findViewById(R.id.left);
//        left.setHeight(perHeight);
//        left.setWidth(perWidth);
        right=view.findViewById(R.id.right);
//        right.setHeight(perHeight);
//        right.setWidth(perWidth);
        cancel=view.findViewById(R.id.cancel);
//        cancel.setHeight(perHeight);
//        cancel.setWidth(perWidth);

        AC=view.findViewById(R.id.AC);
//        AC.setHeight(perHeight);
//        AC.setWidth(perWidth);

        point=view.findViewById(R.id.point);
//        point.setHeight(perHeight);
//        point.setWidth(perWidth);
        sin=view.findViewById(R.id.sin);
//        sin.setHeight(perHeight);
//        sin.setWidth(perWidth);
        cos=view.findViewById(R.id.cos);
//        cos.setHeight(perHeight);
//        cos.setWidth(perWidth);
        e=view.findViewById(R.id.e);
//        e.setHeight(perHeight);
//        e.setWidth(perWidth);
        quyu=view.findViewById(R.id.quyu);
//        quyu.setHeight(perHeight);
//        quyu.setWidth(perWidth);

        daoshu=view.findViewById(R.id.daoshu);
//        daoshu.setHeight(perHeight);
//        daoshu.setWidth(perWidth);
        result.setText("");

        return  view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        row1 = getActivity().findViewById(R.id.row1);
        row2 = getActivity().findViewById(R.id.row2);
        row3 = getActivity().findViewById(R.id.row3);
        row4 = getActivity().findViewById(R.id.row4);
        row5 = getActivity().findViewById(R.id.row5);

        result = getActivity().findViewById(R.id.result);


        num_0=getActivity().findViewById(R.id.num_0);



        num_1=getActivity().findViewById(R.id.num_1);


        num_2=getActivity().findViewById(R.id.num_2);

        num_3=getActivity().findViewById(R.id.num_3);

        num_4=getActivity().findViewById(R.id.num_4);

        num_5=getActivity().findViewById(R.id.num_5);

        num_6=getActivity().findViewById(R.id.num_6);

        num_7=getActivity().findViewById(R.id.num_7);

        num_8=getActivity().findViewById(R.id.num_8);

        num_9=getActivity().findViewById(R.id.num_9);


        jia=getActivity().findViewById(R.id.jia);

        jian=getActivity().findViewById(R.id.jian);

        cheng=getActivity().findViewById(R.id.cheng);

        chu=getActivity().findViewById(R.id.chu);

        deng=getActivity().findViewById(R.id.deng);

        left=getActivity().findViewById(R.id.left);

        right=getActivity().findViewById(R.id.right);

        cancel=getActivity().findViewById(R.id.cancel);


        AC=getActivity().findViewById(R.id.AC);

        point=getActivity().findViewById(R.id.point);

        sin=getActivity().findViewById(R.id.sin);

        cos=getActivity().findViewById(R.id.cos);

//        cos.setHeight(perHeight);
//        cos.setWidth(perWidth);
        e=getActivity().findViewById(R.id.e);

        quyu=getActivity().findViewById(R.id.quyu);


        daoshu=getActivity().findViewById(R.id.daoshu);



        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText().toString()+"0");
            }
        });
        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"1");
            }
        });
        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"2");
            }
        });
        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"3");
            }
        });
        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"4");
            }
        });
        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"5");
            }
        });
        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"6");
            }
        });
        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"7");
            }
        });
        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"8");
            }
        });
        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"9");
            }
        });
        jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!double_fuhao(result.getText().toString())){
                    result.setText(result.getText().toString()+"+");
                }

            }
        });
        jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!double_fuhao(result.getText().toString())){
                    result.setText(result.getText().toString()+"-");
                }

            }
        });
        cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!double_fuhao(result.getText().toString())){
                    result.setText(result.getText().toString()+"*");
                }

            }
        });
        chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!double_fuhao(result.getText().toString())){
                    result.setText(result.getText().toString()+"/");
                }

            }
        });
        deng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = result.getText().toString().indexOf('计');
                if(i==-1){
                    cal cal = new cal(result.getText().toString());
                    result.setText(cal.getResult());
                }else{
                    result.setText("计算错误");
                }

            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"(");
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+")");
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().length()>1){

                    if(result.getText().toString().length()>=3){
                        int i=result.getText().toString().length();
                        String s=result.getText().toString().substring(i-3,i);
                        Log.i("judge",s);
                        if(s.equals("sin")||s.equals("cos")){
                            result.setText(result.getText().toString().substring(0,result.getText().toString().length()-3));
                        } else {
                            result.setText(result.getText().toString().substring(0,result.getText().toString().length()-1));
                        }
                    } else {
                        result.setText(result.getText().toString().substring(0,result.getText().toString().length()-1));
                    }

                } else {
                    result.setText("");
                }
            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"e");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!double_fuhao(result.getText().toString())){
                    result.setText(result.getText().toString()+".");
                }

            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!double_fuhao(result.getText().toString())){
                    result.setText(result.getText().toString()+"sin");
                }

            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!double_fuhao(result.getText().toString())){
                    result.setText(result.getText().toString()+"cos");
                }

            }
        });
        quyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!double_fuhao(result.getText().toString())){
                    result.setText(result.getText().toString()+"%");
                }

            }
        });
        daoshu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("dao");
            }
        });

    }
    public boolean double_fuhao(String s){
        if(s.length()>0){
            String a=s.substring(s.length()-1,s.length());
            if(s.length()>=3){
                String b = s.substring(s.length()-3,s.length());
                if(a.equals("%")||a.equals(".")||a.equals("+")||a.equals("-")||a.equals("*")||a.equals("/")||b.equals("sin")||b.equals("cos")){
                    return true;
                }
            } else {
                if(a.equals("%")||a.equals(".")||a.equals("+")||a.equals("-")||a.equals("*")||a.equals("/")){
                    return true;
                }
            }
        }
        return false;

    }

}
