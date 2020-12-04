package com.example.shoeflipv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonHandler.getInstance();
        System.out.println("HEYYYYYY");
        System.out.println("NANA");
        String hey = "fdsfsdf";
        System.out.printf("%s hello", hey);
    }
}