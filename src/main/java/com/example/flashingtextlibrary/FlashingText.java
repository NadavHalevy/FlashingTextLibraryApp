package com.example.flashingtextlibrary;


import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.animation.Animation;
import android.widget.TextView;

import com.captaindroid.tvg.Tvg;

public class FlashingText {

    public void TextFlashes(TextView txt, String ColorOnCapitalLetter, String fastOrSlow, boolean infinite){
        int speed;
        if (fastOrSlow == "slow")
            speed = 400;
        else
            speed = 800;
       switch (ColorOnCapitalLetter.toUpperCase()){
           case "BLACK":
               TextFlashesBlack(txt, ColorOnCapitalLetter, speed, infinite);
               break;
           case "BLUE":
               TextFlashesBlue(txt, speed, infinite);
               break;
           case "YELLOW":
               TextFlashesYellow(txt, speed, infinite);
               break;
           case "GREEN":
               TextFlashesGreen(txt, speed, infinite);
               break;
           case "RED":
               TextFlashesRed(txt, speed, infinite);
               break;
           default:
               Tvg  tvg = new Tvg();

               Tvg.change(txt, new int[]{
                       Color.parseColor("#F97C3C"),
                       Color.parseColor("#FDB54E"),
                       Color.parseColor("#64B678"),
                       Color.parseColor("#478AEA"),
                       Color.parseColor("#8446CC"),
               });
               break;
}



    }

    @SuppressLint("WrongConstant")
    private void TextFlashesBlack(TextView txt, String ColorOnCapitalLetter, int speed, boolean infinite){
        ObjectAnimator ani = ObjectAnimator.ofInt(txt,
                "backgroundColor",
                Color.WHITE,
                Color.BLACK,
                Color.WHITE);
        ani.setDuration(speed);
        ani.setEvaluator(new ArgbEvaluator());
        ani.setRepeatMode(Animation.REVERSE);
        if(infinite)
            ani.setRepeatCount(Animation.INFINITE);
        else
            ani.setRepeatCount(10);
        ani.start();
    }

    @SuppressLint("WrongConstant")
    private void TextFlashesBlue(TextView txt,int speed, boolean infinite){
        ObjectAnimator ani = ObjectAnimator.ofInt(txt,
                "backgroundColor",
                Color.WHITE,
                Color.BLUE,
                Color.WHITE);
        ani.setDuration(speed);
        ani.setEvaluator(new ArgbEvaluator());
        ani.setRepeatMode(Animation.REVERSE);
        if(infinite)
            ani.setRepeatCount(Animation.INFINITE);
        else
            ani.setRepeatCount(10);
        ani.start();
    }

    @SuppressLint("WrongConstant")
    private void TextFlashesYellow(TextView txt,int speed, boolean infinite){
        ObjectAnimator ani = ObjectAnimator.ofInt(txt,
                "backgroundColor",
                Color.WHITE,
                Color.YELLOW,
                Color.WHITE);
        ani.setDuration(speed);
        ani.setEvaluator(new ArgbEvaluator());
        ani.setRepeatMode(Animation.REVERSE);
        if(infinite)
            ani.setRepeatCount(Animation.INFINITE);
        else
            ani.setRepeatCount(10);
        ani.start();
    }

    @SuppressLint("WrongConstant")
    private void TextFlashesGreen(TextView txt,int speed, boolean infinite){
        ObjectAnimator ani = ObjectAnimator.ofInt(txt,
                "backgroundColor",
                Color.WHITE,
                Color.GREEN,
                Color.WHITE);
        ani.setDuration(speed);
        ani.setEvaluator(new ArgbEvaluator());
        ani.setRepeatMode(Animation.REVERSE);
        if(infinite)
            ani.setRepeatCount(Animation.INFINITE);
        else
            ani.setRepeatCount(9);
        ani.start();
    }

    @SuppressLint("WrongConstant")
    private void TextFlashesRed(TextView txt,int speed, boolean infinite){
        ObjectAnimator ani = ObjectAnimator.ofInt(txt,
                "backgroundColor",
                Color.WHITE,
                Color.RED,
                Color.WHITE);
        ani.setDuration(speed);
        ani.setEvaluator(new ArgbEvaluator());
        ani.setRepeatMode(Animation.REVERSE);
        if(infinite)
            ani.setRepeatCount(Animation.INFINITE);
        else
            ani.setRepeatCount(9);
        ani.start();
    }
}
