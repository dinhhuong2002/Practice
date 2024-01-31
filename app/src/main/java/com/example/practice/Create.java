package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Create extends AppCompatActivity implements View.OnClickListener {
    EditText name,number,location;
    ImageView happy_icon,ok_icon,sad_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        location=findViewById(R.id.location);

        happy_icon=findViewById(R.id.happy_icon);
        ok_icon=findViewById(R.id.ok_icon);
        sad_icon=findViewById(R.id.sad_icon);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        happy_icon.setOnClickListener(this);
        ok_icon.setOnClickListener(this);
        sad_icon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(name.getText().toString().isEmpty()||number.getText().toString().isEmpty()||
        location.getText().toString().isEmpty()){
            Toast.makeText(this,"Please enter all fields",Toast.LENGTH_SHORT).show();
        }else{
            Intent intent=new Intent();
            intent.putExtra("name",name.getText().toString().trim());
            intent.putExtra("number",number.getText().toString().trim());
            intent.putExtra("location",location.getText().toString().trim());

        }
    }
}