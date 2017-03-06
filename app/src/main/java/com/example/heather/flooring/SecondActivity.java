package com.example.heather.flooring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Heather on 3/6/2017.
 */

public class SecondActivity extends AppCompatActivity{
    TextView tvResult;
    Double width;
    Double length;
    Double total;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult = (TextView) findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();
        width = extras.getDouble("Width");
        length = extras.getDouble("Length");
        total = extras.getDouble("Total");

        tvResult.setText("Width is " + width + " and Length is " + length + " and so the flooring needed is " + total);
    }
}
