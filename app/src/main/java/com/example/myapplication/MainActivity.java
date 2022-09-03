package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textveiw;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textveiw = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Thank you for using app" , Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.20462 * kg;
//                textveiw.setText("The corresponding value in Pounds is " + pound);
//            }
//        });
    }
    public void calculate(View view){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.20462 * kg;
        textveiw.setText("The corresponding value in Pounds is " + pound);
        Toast.makeText(MainActivity.this,"Thank you for using app" , Toast.LENGTH_SHORT).show();

    }
}