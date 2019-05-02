package com.towerint.View;


import android.media.MediaPlayer;
import android.content.Context;

import com.towerint.R;

public class Music extends OptionsActivity{
    private MediaPlayer backgroundMusic;
    private boolean listen = true;
    private MediaPlayer touchMusic;

    //Begin music
    protected void startBackground(Context context){
        backgroundMusic = MediaPlayer.create(context, R.raw.airship_thunderchild_by_otto_halmn);
        backgroundMusic.start();
        backgroundMusic.setLooping(true);
    }
    protected void touchMusic(Context context){
        touchMusic = MediaPlayer.create(context, R.raw.bipp);
        touchMusic.start();
    }
    protected void stopTouch(){
        touchMusic.stop();
    }
    //Play or Stop
    protected void musicState() {
        if(listen) {
            backgroundMusic.pause();
            listen = false;
        }
        else{
            backgroundMusic.start();
            listen = true;
        }
    }

    public void stopBackground(){
        backgroundMusic.stop();
    }
}