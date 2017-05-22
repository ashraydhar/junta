package com.skeleton.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.skeleton.R;

/**
 * Get Ready for your perfect match  :p  :D  ...
 */
public class HomeActivty extends AppCompatActivity {
    private ImageView ivToolbarbtn, ivMenu;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activty);
        ivMenu = (ImageView) findViewById(R.id.ivMenu);
        ivToolbarbtn = (ImageView) findViewById(R.id.ivToolbarBtn);
        ivMenu.setVisibility(View.VISIBLE);
        ivToolbarbtn.setVisibility(View.GONE);
    }
}