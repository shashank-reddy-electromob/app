package com.nitish.paymatrixandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TransactionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

    }

    public void showDetails(View v){
        Intent i=new Intent(this,TranscationDetailsActivity.class);
        startActivity(i);
    }

    public void goBack(View v){
        finish();
    }
}
