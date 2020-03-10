package com.nitish.paymatrixandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PayRentActivity extends AppCompatActivity {

    private ImageView image;
    private TextView text;
    private Button addproperty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_rent);

        image = findViewById(R.id.imageView);;
        addproperty = findViewById(R.id.button);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PayRentActivity.this,PayRentArchiveActivity.class));
            }
        });

        addproperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PayRentActivity.this, AddPropertyActivity.class));
            }
        });
    }

    public void openArchiveList(View v){
        Intent i=new Intent(this,PayRentArchiveActivity.class);
        startActivity(i);
    }
    public void goBack(View v){
        finish();
    }
}
