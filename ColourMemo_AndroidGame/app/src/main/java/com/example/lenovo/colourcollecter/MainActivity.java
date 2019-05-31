package com.example.lenovo.colourcollecter;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton playimagebtn,settingsbtn,scorebtn,infobtn,gamemode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        playimagebtn=(ImageButton)findViewById(R.id.startgamebtnid);
        settingsbtn=(ImageButton)findViewById(R.id.imageButton);
        scorebtn=(ImageButton)findViewById(R.id.scoreid);
        infobtn=(ImageButton)findViewById(R.id.infoid);
        gamemode=(ImageButton)findViewById(R.id.gamemodeid);

        gamemode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,gameguide.class);
                startActivity(in);
            }
        });


        /////

        playimagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,level2.class);
                startActivity(in);

            }
        });

        ///
        settingsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,settingsActivity.class);
                startActivity(in);
            }
        });

        ////

        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,infoactivity.class);
                startActivity(in);
            }
        });

        ////
        scorebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,score.class);
                startActivity(in);
            }
        });

    }
}
