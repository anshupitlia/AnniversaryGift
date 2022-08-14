package com.example.anniversarygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondQuestion extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);
        mediaPlayer = MediaPlayer.create(this, R.raw.breaking_news);
        mediaPlayer.start();
    }
    public void onReplay(View view) {
        mediaPlayer.start();
    }
    public void onSubmit(View view) {
        EditText editText=findViewById(R.id.editText2);
        String value=editText.getText().toString();
        String expectedString = "070419";
        if (value.equals(expectedString)) {
            Toast.makeText(this, "Well Done!", Toast.LENGTH_SHORT).show();
            mediaPlayer.stop();
            Intent intent = new Intent(this, Roka.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Try again!", Toast.LENGTH_SHORT).show();
        }
    }

}
