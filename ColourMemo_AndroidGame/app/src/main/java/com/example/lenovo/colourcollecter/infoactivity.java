package com.example.lenovo.colourcollecter;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class infoactivity extends AppCompatActivity {

    ImageButton level1,level2,level3,level4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoactivity);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        level1 = (ImageButton)findViewById(R.id.imageButton7);
        level2 = (ImageButton)findViewById(R.id.imageButton8);
        level3 = (ImageButton)findViewById(R.id.imageButton9);
        level4 = (ImageButton)findViewById(R.id.imageButton);


        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l1=new Intent(infoactivity.this,level2.class);
                startActivity(l1);
            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l2=new Intent(infoactivity.this,main2.class);
                startActivity(l2);
            }
        });

        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l3=new Intent(infoactivity.this,level3.class);
                startActivity(l3);
            }
        });

        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l4=new Intent(infoactivity.this,level4.class);
                startActivity(l4);
            }
        });

    }
}
