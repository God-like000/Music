package com.example.music;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class choice extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);
        Button btn_ben = findViewById(R.id.btn_ben);
        Button btn_down = findViewById(R.id.btn_down);
        btn_ben.setOnClickListener(this);
        btn_down.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ben:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_down:
                Uri uri = Uri.parse("https://freemusicarchive.org/genre/Classical/");    //设置跳转的网站
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent1);
                break;

        }
    }
}

