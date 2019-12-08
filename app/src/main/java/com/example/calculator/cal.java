package com.example.calculator;
import android.util.Log;

import java.util.Stack;

public class cal{
    private String res;
    private String result;
//构造方法
    public cal(String s){
        this.res = s;
        try {
        int i = s.indexOf('%');
        Log.i("%",String.valueOf(i));
        StringBuffer ss = new StringBuffer(s);
        if(i>0)
        {
            while (ss.charAt(i-1)<='9'&&ss.charAt(i-1)>='0'||ss.charAt(i-1)=='.'){
                i--;
                if(i-1<0){
                    break;
                }
            }
            String temp="(",record="";
            for(int j=i;ss.charAt(j)!='%';j++)
            {
                record+=ss.charAt(j);;
                temp+=ss.charAt(j);
            }
            record+="%";
            temp+="*0.01)";
            s = s.replace(record,temp);
        }
        boolean can = true;
        //sin
            i=s.indexOf('n');
            i++;
            if(i!=0){
                can=false;
                String sin_temp = s.substring(i);
                double sin = toValue(new StringBuffer(toPostfix(sin_temp)));
                double rad = Math.toRadians(sin);
                double finally_res = Math.sin(rad);
                this.result=String.valueOf(finally_res);
            }

            //cos
            i=s.indexOf('o');
            i+=2;
            if(i!=1)
            {
                can=false;
                String cos_temp = s.substring(i);
                double cos = toValue(new StringBuffer(toPostfix(cos_temp)));
                double rad = Math.toRadians(cos);
                double finally_res_cos = Math.cos(rad);
                this.result=String.valueOf(finally_res_cos);
            }


            if(can)
            {
                StringBuffer postfix = toPostfix(s);
                this.result = String.valueOf(toValue(postfix));
            }

        }catch (Exception e)
        {
            this.result="计算出错";
        }


    }
    public String getResult()
    {
        return this.result;
    }

    public static StringBuffer toPostfix(String infix){
        Stack<String> stack = new Stack<String>();
        StringBuffer postfix = new StringBuffer(infix.length()*2);
        int i = 0;
        while(i<infix.length()){
            char ch = infix.charAt(i);
            switch(ch){
                case'+':case'-':
                    while(!stack.isEmpty()&&!stack.peek().equals("("))
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++; break;
                case'*':case'/':
                    while(!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/")))
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++; break;
                case'(':
                    stack.push(ch+"");
                    i++; break;
                case')':
                    String out = stack.pop();
                    while(out!=null&&!out.equals("(")){
                        postfix.append(out);
                        out = stack.pop();
                    }
                    i++; break;
                default:
                    Log.i("out",String.valueOf(ch));

                    while(i<infix.length()&&ch>='0'&&ch<='9'||ch=='.'&&i<infix.length()){
                        postfix.append(ch);
                        i++;
                        Log.i("in",String.valueOf(ch));
                        if(i<infix.length())
                            ch = infix.charAt(i);
                    }
                    postfix.append(" ");
            }
        }
        while(!stack.isEmpty())
            postfix.append(stack.pop());
        return postfix;
    }
    public static double toValue(StringBuffer postfix){
        Stack<Double> stack = new Stack<Double>();
        double value = 0;
        for(int i =0;i<postfix.length();i++){
            char ch = postfix.charAt(i);
            if(ch>='0'&&ch<='9'||ch=='.'){
                value = 0;
                String s="";
                while(ch!=' '){
                    s+=ch;
                    ch = postfix.charAt(++i);
                }
                stack.push(Double.valueOf(s));
            }
            else
            if(ch!=' '){
                double y = stack.pop(),x=stack.pop();
                switch(ch){
                    case'+':value = x+y; break;
                    case'-':value = x-y; break;
                    case'*':value = x*y; break;
                    case'/':value = x/y; break;
                }
                System.out.print(x+(ch+"")+y+"="+value+", ");
                stack.push(value);
            }
        }
        return stack.pop();
    }

}
