package com.example.anniversarygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FirstQuestion extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
        mediaPlayer = MediaPlayer.create(this, R.raw.pehli_mulaqat);
        mediaPlayer.start();
    }

    public void onAudioClick(View view) {
        if (mediaPlayer.isPlaying()) {
           mediaPlayer.pause();
        } else {
            mediaPlayer.start();
        }
    }
    public void onGetOptions(View view) {
        mediaPlayer.stop();
        Intent intent = new Intent(this, FirstQuestionOptions.class);
        startActivity(intent);
    }
}
