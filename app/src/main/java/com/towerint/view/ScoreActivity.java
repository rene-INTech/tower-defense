package com.towerint.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.towerint.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


public class ScoreActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


        Intent parentIntent=getIntent();
;

        /*Déclaration des boutons*/
        final Button returnButton=findViewById(R.id.returnButton);

        final Button resetButton=findViewById(R.id.resetScoreButton);

        final TextView text=findViewById(R.id.scoresTextView);

        /*Connecte le bouton de retour*/
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore(text);
            }
        });

        File saves=new File(getCacheDir(), "scores.csv");
        if(saves.exists()){
            try {
                FileInputStream reader = new FileInputStream(saves);
                while (reader.available()>0){
                    int rd=reader.read();
                    text.append(Character.toString((char)rd));
                }
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else {
            text.setText(R.string.no_save_found);
        }
    }

    private void resetScore(TextView text){
        new File(getCacheDir(), "scores.csv").delete();
        text.setText(R.string.no_save_found);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}