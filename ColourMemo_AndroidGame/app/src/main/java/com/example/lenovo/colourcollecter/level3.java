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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class level3 extends AppCompatActivity {

    ImageView iv1,iv2;

    ImageButton b1,b2,r1,r2;
    ImageView life1iv,life2iv,life3iv,life4iv,life5iv;

    TextView scoretext;

    String cpuchoice,mychoice,cpuchoice2,mychoice2;
    int  score=0;


    private DatabaseReference databaseReference;


    @Override
    protected void onStart() {
        super.onStart();
        final Handler handler = new Handler();
        final Random random = new Random();
        final Random random1=new Random();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int y = random.nextInt(4);

                if(y==0)
                {
                    cpuchoice="redred";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.redred);


                }
                else if(y==1)
                {
                    cpuchoice="redblue";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.redblue);
                }
                else if(y==2)
                {
                    cpuchoice="blueblue";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.blueblue);
                }
                else if(y==3)
                {
                    cpuchoice="bluered";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.bluered);
                }

                int z=random1.nextInt(4);

                if(z==0)
                {
                    cpuchoice="redred";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.redred);


                }
                else if(z==1)
                {
                    cpuchoice="redblue";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.redblue);
                }
                else if(z==2)
                {
                    cpuchoice="blueblue";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.blueblue);
                }
                else if(z==3)
                {
                    cpuchoice="bluered";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.bluered);
                }

                handler.postDelayed(this, 1800);
            }
        };

        handler.post(runnable);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);



        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        databaseReference= FirebaseDatabase.getInstance().getReference("score3");


        iv1=(ImageView)findViewById(R.id.imageView1);
        iv2=(ImageView)findViewById(R.id.imageView2);

        b1=(ImageButton)findViewById(R.id.imageButton1);
        r1=(ImageButton)findViewById(R.id.imageButton2);

        b2=(ImageButton)findViewById(R.id.imageButton3);
        r2=(ImageButton)findViewById(R.id.imageButton4);


        scoretext=(TextView)findViewById(R.id.textView2);



        life1iv=(ImageView)findViewById(R.id.life1id);
        life2iv=(ImageView)findViewById(R.id.life2id);
        life3iv=(ImageView)findViewById(R.id.life3id);
        life4iv=(ImageView)findViewById(R.id.life4id);
        life5iv=(ImageView)findViewById(R.id.life5id);

        cpuchoice="";
        mychoice="";

        cpuchoice2="";
        mychoice2="";



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="blueblue";
                mychoice2="redblue";

                Calculate();
                scoretext.setText(String.valueOf(score));

            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="redred";
                mychoice2="bluered";

                Calculate();
                scoretext.setText(String.valueOf(score));

            }
        });

        ///// for for 1st choice


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="blueblue";
                mychoice2="redblue";

                Calculate();
                scoretext.setText(String.valueOf(score));
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="redred";
                mychoice2="bluered";

                Calculate();
                scoretext.setText(String.valueOf(score));
            }
        });




    }

    private void Calculate() {


        if (mychoice.equals("blueblue") && cpuchoice.equals("blueblue"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("blueblue") && cpuchoice.equals("bluered"))
        {
            score -=1;


            decreasinglifetime();
        }
        else if (mychoice.equals("blueblue") && cpuchoice.equals("bluegreen"))
        {
            score -=1;
            decreasinglifetime();

        }
        else if (mychoice.equals("blueblue") && cpuchoice.equals("redred"))
        {
            score -=1;

            decreasinglifetime();
        }

        else if (mychoice.equals("blueblue") && cpuchoice.equals("redblue"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("blueblue") && cpuchoice.equals("redgreen"))
        {
            score -=1;


            decreasinglifetime();
        }
        else if (mychoice.equals("blueblue") && cpuchoice.equals("bluered"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("blueblue") && cpuchoice.equals("greengreen"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("blueblue") && cpuchoice.equals("greenblue"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("blueblue") && cpuchoice.equals("greenred"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("greengreen"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("greenred"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("greenblue"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("redred"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("redblue"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("redgreen"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("blueblue"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("bluered"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("greengreen") && cpuchoice.equals("bluegreen"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("redred") && cpuchoice.equals("redred"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("redred") && cpuchoice.equals("redblue"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redred") && cpuchoice.equals("redgreen"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redred") && cpuchoice.equals("bluered"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("redred") && cpuchoice.equals("blueblue"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redred") && cpuchoice.equals("bluegreen"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redred") && cpuchoice.equals("greenred"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("redred") && cpuchoice.equals("greenblue"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redred") && cpuchoice.equals("greengreen"))
        {
            score -=1;

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

    private void decreasinglifetime()
    {
        //   int max=5;

        if(score==-1)
        {
            life5iv.setImageResource(R.drawable.ripicon);

        }
        else if(score==-2)
        {
            life4iv.setImageResource(R.drawable.ripicon);
        }
        else if(score==-3)
        {
            life3iv.setImageResource(R.drawable.ripicon);
        }
        else if(score==-4)
        {
            life2iv.setImageResource(R.drawable.ripicon);
        }
        else if(score==-5)
        {
            life1iv.setImageResource(R.drawable.ripicon);
            savescore();
            showbuil();
        }
        else if(score>=25)
        {
            savescore();
        }





    }

    private void showbuil() {



        AlertDialog.Builder builder=new AlertDialog.Builder(level3.this);

        builder.setCancelable(true);
        builder.setTitle("GAME OVER");
        builder.setMessage("Score  is:"+score);


        builder.setIcon(R.drawable.over);


        builder.setNegativeButton("PRACTICE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                Toast.makeText(level3.this, "Score not counted", Toast.LENGTH_SHORT).show();
            }
        });


        builder.setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //  Toast.makeText(level2.this, "Game over", Toast.LENGTH_SHORT).show();
                Intent ip=new Intent(level3.this,MainActivity.class);
                startActivity(ip);
            }
        });

        builder.show();
    }

    private void savescore() {
        databaseReference.setValue(score);
        Toast.makeText(this, "datasaved", Toast.LENGTH_SHORT).show();


    }


}
