package com.example.simplecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Author extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        //strzalka powrotu do poprzedniego activity
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        if(id== android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
