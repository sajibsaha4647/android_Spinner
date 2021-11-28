package com.example.android_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;
    private TextView textView;
    String [] Countrynames;
    private  int [] Flags = {R.drawable.img1,R.drawable.img2,
            R.drawable.img14,R.drawable.img3,
            R.drawable.img13,R.drawable.img4,
            R.drawable.img12,R.drawable.img5,
            R.drawable.img11,R.drawable.img6,
            R.drawable.img10,R.drawable.img7,
            R.drawable.img9,R.drawable.img8,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.printbtn);
        textView = findViewById(R.id.textitems);
        Countrynames = getResources().getStringArray(R.array.countryname);

        customAdapter adapter = new customAdapter(MainActivity.this,Countrynames,Flags);

        spinner.setAdapter(adapter);




    }
}