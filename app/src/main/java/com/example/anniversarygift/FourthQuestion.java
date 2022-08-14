package com.example.anniversarygift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class FourthQuestion extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);
        mediaPlayer = MediaPlayer.create(this, R.raw.sunoji_dulhan_cut);
        mediaPlayer.start();
    }

    public void onReplay(View view) {
        mediaPlayer.start();
    }

    public void onSubmit(View view) {
        RadioButton first = findViewById(R.id.radioButton6);
        RadioButton second = findViewById(R.id.radioButton7);
        RadioButton third = findViewById(R.id.radioButton8);
        RadioButton fourth = findViewById(R.id.radioButton9);
        RadioButton fifth = findViewById(R.id.radioButton10);
        if (first.isChecked() && second.isChecked() && third.isChecked() && !fourth.isChecked() && fifth.isChecked()) {
            Toast.makeText(this, "Bravo!", Toast.LENGTH_SHORT).show();
            mediaPlayer.stop();
            Intent intent = new Intent(this, PariwarMilan.class);
            startActivity(intent);
        }
        else {
            first.setChecked(false);
            second.setChecked(false);
            third.setChecked(false);
            fourth.setChecked(false);
            fifth.setChecked(false);
        }
    }
}
