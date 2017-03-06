package com.example.heather.flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etWidth, etLength;
    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = (EditText) findViewById(R.id.editTextWidth);
        etLength = (EditText) findViewById(R.id.editTextLength);
        btnResult = (Button) findViewById(R.id.buttonResult);


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double width = Double.parseDouble(etWidth.getText().toString());
                Double length = Double.parseDouble(etLength.getText().toString());

                Double total = width * length;

                etWidth.setText("");
                etLength.setText("");

                Intent resultIntent = new Intent(MainActivity.this, SecondActivity.class);
                resultIntent.putExtra("Width", width);
                resultIntent.putExtra("Length", length);
                resultIntent.putExtra("Total", total);
                startActivity(resultIntent);


            }
        });

    }
}
