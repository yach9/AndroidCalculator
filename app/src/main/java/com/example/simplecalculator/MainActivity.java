package com.example.simplecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button but1, but2, but3, but4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1= (Button) findViewById(R.id.but1);
        but2= (Button) findViewById(R.id.but2);
        but3= (Button) findViewById(R.id.but3);
        but4= (Button) findViewById(R.id.but4);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_Simple();
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_Advanced();
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_Author();
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickexit();
            }
        });

    }
    public void openactivity_Simple(){
        Intent intent = new Intent(this, Simple.class);
        startActivity(intent);
    }
    public void openactivity_Advanced(){
        Intent intent = new Intent(this, Advanced.class);
        startActivity(intent);
    }
    public void openactivity_Author(){
        Intent intent = new Intent(this, Author.class);
        startActivity(intent);
    }
    private void clickexit() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);

    }
}
