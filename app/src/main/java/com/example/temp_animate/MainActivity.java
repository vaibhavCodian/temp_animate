
package com.example.temp_animate;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean rot = false;
    boolean zoom = false;
    boolean fade = false;

    int scale = 2;
    int de_scale = 1;

    ObjectAnimator fadeOut;
    ObjectAnimator fadeIn;

    final AnimatorSet mAnimationSet = new AnimatorSet();

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView);
        img.setAlpha(0f);
        img.animate().alpha(1f).setDuration(1000);

    }
    public void rotate(View v){
        if (rot) {
            img.setRotation(0);
            rot = false;
        } else {
            img.setRotation(90);
            rot = true;
        }
    }
    public void zoom(View v){
        if (zoom) {
            img.setScaleX(de_scale);
            img.setScaleY(de_scale);
            zoom = false;
        } else {
            img.setScaleX(scale);
            img.setScaleY(scale);
            zoom = true;
        }
    }

    public void fade(View v){
        if (fade) {
            img.animate().alpha(1f).setDuration(100);
            fade = false;
        } else {
            img.animate().alpha(0f).setDuration(100);
            fade = true;
        }
    }
}
