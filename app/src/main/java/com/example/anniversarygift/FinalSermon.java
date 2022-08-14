package com.example.anniversarygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FinalSermon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_sermon);
    }
    public void onNext(View view) {
        Intent intent = new Intent(this, FinalReveal.class);
        startActivity(intent);
    }
}
