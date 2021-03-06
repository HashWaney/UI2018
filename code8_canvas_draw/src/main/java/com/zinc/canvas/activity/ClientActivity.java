package com.zinc.canvas.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zinc.canvas.R;

/**
 * author       : Jiang zinc
 * time         : 2018/10/29
 * email        : 56002982@qq.com
 * desc         :
 * version      : 1.0.0
 */

public class ClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas_client);
    }

    public void onHeart(View view) {
        startActivity(new Intent(this, HeartActivity.class));
    }

    public void onClock(View view) {
        startActivity(new Intent(this, ClockActivity.class));
    }

    public void onCommon(View view) {
        startActivity(new Intent(this, CommonListActivity.class));
    }

}
