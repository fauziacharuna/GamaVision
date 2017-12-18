package com.example.fauziachmadharuna.gamavision;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

/**
 * Created by fauziachmadharuna on 05/12/17.
 */

public class OnBoarding extends TutorialActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Collaboration")
                .setContent("")
                .setBackgroundColor(Color.parseColor("#4A90E2")) // int background color
                .setDrawable(R.drawable.collaboration_slider) // int top drawable
                .setSummary("")
                .build());
        addFragment(new Step.Builder().setTitle("Event")
                .setContent("")
                .setBackgroundColor(Color.parseColor("#F5A623")) // int background color
                .setDrawable(R.drawable.event_slider) // int top drawable
                .setSummary("")
                .build());
        addFragment(new Step.Builder().setTitle("Sale")
                .setContent("")
                .setBackgroundColor(Color.parseColor("#40AF19")) // int background color
                .setDrawable(R.drawable.sale_slider) // int top drawable
                .setSummary("")
                .build());
        intentMenu();

    }
    public void intentMenu(){
        Intent intent = new Intent(OnBoarding.this,BottomMenu.class);
        startActivity(intent);
    }
}
