package com.example.lenovo.colourcollecter;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public  class main2 extends AppCompatActivity {

    ImageView life1iv,life2iv,life3iv,life4iv,life5iv;
    TextView tvscore;

    ImageView iv;

    ImageButton redbtn,greenbtn,bluebtn;

    DatabaseReference databaseReference;

    String cpuchoice="";
    String mychoice="";

    int score=0;

    @Override
    protected void onStart() {
        super.onStart();

        final Handler handler=new Handler();
        final Random random=new Random();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                int y = random.nextInt(9);

                if(y==0)
                {
                    cpuchoice="red";
                    iv.setImageResource(R.drawable.redred);

                }
                else if(y==1)
                {
                    cpuchoice="blue";
                    iv.setImageResource(R.drawable.redblue);

                }
                else if(y==2)
                {
                    cpuchoice="green";
                    iv.setImageResource(R.drawable.redgreen);

                }
                else if(y==3)
                {
                    cpuchoice="blue";
                    iv.setImageResource(R.drawable.blueblue);

                }
                else if(y==4)
                {
                    cpuchoice="green";
                    iv.setImageResource(R.drawable.bluegreen);

                }
                else if(y==5)
                {
                    cpuchoice="red";
                    iv.setImageResource(R.drawable.bluered);

                }else if(y==6)
                {
                    cpuchoice="green";
                    iv.setImageResource(R.drawable.greengreen);

                }
                else if(y==7)
                {
                    cpuchoice="blue";
                    iv.setImageResource(R.drawable.greenblue);

                }else if(y==8)
                {
                    cpuchoice="red";
                    iv.setImageResource(R.drawable.greenred);

                }

                handler.postDelayed(this, 2000);
            }
        };
        handler.post(runnable);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        iv=(ImageView)findViewById(R.id.imageview);

        tvscore=(TextView)findViewById(R.id.scoreid2);

        life1iv=(ImageView)findViewById(R.id.life1id);
        life2iv=(ImageView)findViewById(R.id.life2id);
        life3iv=(ImageView)findViewById(R.id.life3id);
        life4iv=(ImageView)findViewById(R.id.life4id);
        life5iv=(ImageView)findViewById(R.id.life5id);

        redbtn=(ImageButton)findViewById(R.id.button);
        bluebtn=(ImageButton)findViewById(R.id.imageButton5);
        greenbtn=(ImageButton)findViewById(R.id.button2);

        databaseReference=FirebaseDatabase.getInstance().getReference("score2");


        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="red";
                calculationmethoda();
                tvscore.setText(String.valueOf(score));
            }
        });
        ///
        greenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="green";
                calculationmethoda();
                tvscore.setText(String.valueOf(score));
            }
        });
        ///
        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="blue";
                calculationmethoda();
                tvscore.setText(String.valueOf(score));
            }
        });







    }

    private void calculationmethoda() {
        if(mychoice.equals("red")&&cpuchoice.equals("red"))
        {
            score++;
            savingdata();
        }
        else if(mychoice.equals("red")&&cpuchoice.equals("blue"))
        {
            score--;
            decreasinglifetime();
        }
        else if(mychoice.equals("red")&&cpuchoice.equals("green"))
        {
            score--;
            decreasinglifetime();
        }
        else if(mychoice.equals("blue")&&cpuchoice.equals("blue"))
        {
            score++;
            savingdata();
        }
        else if(mychoice.equals("blue")&&cpuchoice.equals("red"))
        {
            score--;
            decreasinglifetime();
        }
        else if(mychoice.equals("blue")&&cpuchoice.equals("green"))
        {
            score--;
            decreasinglifetime();
        }
        else if(mychoice.equals("green")&&cpuchoice.equals("green"))
        {

            score++;
            savingdata();
        }
        else if(mychoice.equals("green")&&cpuchoice.equals("red"))
        {
            score--;
            decreasinglifetime();
        }
        else if(mychoice.equals("green")&&cpuchoice.equals("blue"))
        {
            score--;
            decreasinglifetime();
        }


    }

    private void savingdata() {
        if(score==1)
        {
            savescore();
        }
        else if(score==2)
        {
            savescore();
        }
        else if(score==3)
        {
            savescore();
        }
        else if(score==4)
        {
            savescore();
        }
        else if(score==5)
        {
            savescore();
        }
        else if(score==6)
        {
            savescore();
        }
        else if(score==7)
        {
            savescore();
        }
        else if(score==8)
        {
            savescore();
        }
        else if(score==9)
        {
            savescore();
        }
        else if(score==10)
        {
            savescore();
        }
    }

    private void decreasinglifetime() {


        if(score==-1)
        {
            life5iv.setImageResource(R.drawable.ripicon);
        }
        else if(score==-2)
        {
            life4iv.setImageResource(R.drawable.ripicon);
        }
        else if (score == -3)
        {
            life3iv.setImageResource(R.drawable.ripicon);
        }
        else if (score == -4)
        {
            life2iv.setImageResource(R.drawable.ripicon);
        }
        else if (score == -5)
        {
            life1iv.setImageResource(R.drawable.ripicon);
            showbuil();


            savescore();
        }
        else if(score>=25)
        {
            savescore();
        }

    }

    private void savescore() {

        databaseReference.setValue(score);
        Toast.makeText(this, "datasaved", Toast.LENGTH_SHORT).show();

    }

    private void showbuil() {

        AlertDialog.Builder builder=new AlertDialog.Builder(main2.this);

        builder.setCancelable(true);
        builder.setTitle("GAME OVER");
        builder.setMessage("Score  is:"+score);


        builder.setIcon(R.drawable.over);


        builder.setNegativeButton("PRACTICE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                Toast.makeText(main2.this, "Score not counted", Toast.LENGTH_SHORT).show();
            }
        });


        builder.setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //  Toast.makeText(level2.this, "Game over", Toast.LENGTH_SHORT).show();
                Intent ip=new Intent(main2.this,MainActivity.class);
                startActivity(ip);
            }
        });

        builder.show();
    }
}
