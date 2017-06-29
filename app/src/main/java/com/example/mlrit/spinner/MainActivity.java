package com.example.mlrit.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    String[] names={"A","B","C","D","E"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner)findViewById(R.id.sp2);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,names);
        spn.setAdapter(aa);
    }
}
