package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display display = getWindowManager().getDefaultDisplay();
        Log.i("wid and height",String.valueOf(display.getHeight())+" "+String.valueOf(display.getWidth()));



        replaceFragment(new calFragment(display.getHeight(),display.getWidth()));
        final TextView cal = (TextView)findViewById(R.id.cal);
        final TextView change = (TextView)findViewById(R.id.change);
        final TextView huilv = (TextView)findViewById(R.id.huilv);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display display1 = getWindowManager().getDefaultDisplay();
                cal.setTextColor(getResources().getColor(R.color.check));
                huilv.setTextColor(getResources().getColor(R.color.uncheck));
                change.setTextColor(getResources().getColor(R.color.uncheck));
                replaceFragment(new calFragment(display1.getHeight(),display1.getWidth()));
            }
        });
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.setTextColor(getResources().getColor(R.color.uncheck));
                huilv.setTextColor(getResources().getColor(R.color.uncheck));
                change.setTextColor(getResources().getColor(R.color.check));
                replaceFragment(new changeFragment());
            }
        });
        huilv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.setTextColor(getResources().getColor(R.color.uncheck));
                huilv.setTextColor(getResources().getColor(R.color.check));
                change.setTextColor(getResources().getColor(R.color.uncheck));
                replaceFragment(new huiLvFragment());
            }
        });
    }
    public void  replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_fragment,fragment);
        transaction.commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mm,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menu) {
        switch (menu.getItemId()){
            case R.id.help:
                Toast.makeText(this,"你点击了帮助",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }


}
