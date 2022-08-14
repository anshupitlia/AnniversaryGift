package com.example.anniversarygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdQuestion extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
        mediaPlayer = MediaPlayer.create(this, R.raw.pardesi_cut);
        mediaPlayer.start();
    }
    public void onReplay(View view) {
        mediaPlayer.start();
    }

    public void onSubmit(View view) {
        EditText editText=findViewById(R.id.editText);
        String value=editText.getText().toString();
        String expectedString = "kiss";
        if (value.toLowerCase().equals(expectedString)) {
            Toast.makeText(this, "Well Done!", Toast.LENGTH_SHORT).show();
            mediaPlayer.stop();
            Intent intent = new Intent(this, Singapore.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Try again!", Toast.LENGTH_SHORT).show();
        }
    }
}
