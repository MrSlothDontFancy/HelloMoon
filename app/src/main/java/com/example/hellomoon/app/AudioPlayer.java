package com.example.hellomoon.app;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Donkey on 4/20/2015.
 */
public class AudioPlayer {

    private MediaPlayer mPlayer;

    public void stop()
    {
        if(mPlayer != null)
        {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c )
    {
        stop(); // prevents the creation of multiple instances

        mPlayer = MediaPlayer.create(c, R.raw.drake);

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
            public void onCompletion(MediaPlayer mp)
            {
                stop();
            }

        });

        mPlayer.start();


    }
}
