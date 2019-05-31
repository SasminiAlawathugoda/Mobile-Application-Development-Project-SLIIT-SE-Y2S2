package com.example.lenovo.colourcollecter;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class settingsActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId) {
                    case R.id.radioButton:
                      //  RadioButton value = Integer.parseInt(((RadioButton) findViewById(R.id.radioButton).getText()) * 3);

                        break;
                    case R.id.radioButton2:
                      //  RadioButton value = Integer.parseInt(((RadioButton) findViewById(R.id.radioButton2).getText()) * 3);
                        break;
                    case R.id.radioButton3:
                     //   RadioButton value = Integer.parseInt(((RadioButton) findViewById(R.id.radioButton3).getText()) * 3);
                        break;
                }
            }
        });
    }
}
