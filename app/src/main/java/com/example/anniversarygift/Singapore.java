package com.example.anniversarygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Singapore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singapore);
    }
    public void onNext(View view) {
        Intent intent = new Intent(this, FourthQuestion.class);
        startActivity(intent);
    }
}
