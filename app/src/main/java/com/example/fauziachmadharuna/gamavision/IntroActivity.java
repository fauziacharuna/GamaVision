package com.example.fauziachmadharuna.gamavision;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by fauziachmadharuna on 15/01/18.
 */

public class IntroActivity extends AppIntro2 {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("Event"," ",R.drawable.event_slider, Color.parseColor("#F5A623")));
        addSlide(AppIntroFragment.newInstance("Collaboration"," ",R.drawable.collaboration_slider, Color.parseColor("#4A90E2")));
        addSlide(AppIntroFragment.newInstance("Sale"," ",R.drawable.sale_slider, Color.parseColor("#40AF19")));
        showStatusBar(false);

//        Intent menuActivity = new Intent(IntroActivity.this,BottomMenu.class);
//        startActivity(menuActivity);

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent menuActivity = new Intent(IntroActivity.this,BottomMenu.class);
        startActivity(menuActivity);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent menuActivity = new Intent(IntroActivity.this,BottomMenu.class);
        startActivity(menuActivity);

    }
}
