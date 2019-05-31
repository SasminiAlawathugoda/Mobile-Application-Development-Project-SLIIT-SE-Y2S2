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

public class level4 extends AppCompatActivity {

    ImageView iv1,iv2;

    ImageButton rb,lb,rr,lr,lg,rg;

    TextView scoretext;

    String cpuchoice,mychoice,cpuchoice2,mychoice2,mychoice3;

    ImageView life1iv,life2iv,life3iv,life4iv,life5iv;



    int  score;

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
                int y = random.nextInt(9);
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
                    cpuchoice="redgreen";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.redgreen);
                }
                else if(y==3)
                {
                    cpuchoice="blueblue";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.blueblue);
                }
                else if(y==4)
                {
                    cpuchoice="bluered";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.bluered);
                }
                else if(y==5)
                {
                    cpuchoice="bluegreen";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.bluegreen);
                }
                else if(y==6)
                {
                    cpuchoice="greengreen";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.greengreen);
                }
                else if(y==7)
                {
                    cpuchoice="greenblue";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.greenblue);
                }
                else if(y==8)
                {
                    cpuchoice="greenred";

                    ImageView imageView=findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.greenred);
                }


                int z=random1.nextInt(9);

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
                    cpuchoice="redgreen";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.redgreen);
                }
                else if(z==3)
                {
                    cpuchoice="blueblue";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.blueblue);
                }
                else if(z==4)
                {
                    cpuchoice="bluered";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.bluered);
                }
                else if(z==5)
                {
                    cpuchoice="bluegreen";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.bluegreen);
                }
                else if(z==6)
                {
                    cpuchoice="greengreen";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.greengreen);
                }
                else if(z==7)
                {
                    cpuchoice="greenblue";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.greenblue);
                }
                else if(z==8)
                {
                    cpuchoice="greenred";

                    ImageView imageView=findViewById(R.id.imageView2);
                    imageView.setImageResource(R.drawable.greenred);
                }


                handler.postDelayed(this, 1800);
            }
        };

        handler.post(runnable);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        life1iv=(ImageView)findViewById(R.id.life1id);
        life2iv=(ImageView)findViewById(R.id.life2id);
        life3iv=(ImageView)findViewById(R.id.life3id);
        life4iv=(ImageView)findViewById(R.id.life4id);
        life5iv=(ImageView)findViewById(R.id.life5id);


        scoretext=(TextView)findViewById(R.id.scoreidh);


        iv1=(ImageView)findViewById(R.id.imageView1);
        iv2=(ImageView)findViewById(R.id.imageView2);

        lb=(ImageButton)findViewById(R.id.imageButton1);
        lr=(ImageButton)findViewById(R.id.imageButton2);

        rb=(ImageButton)findViewById(R.id.imageButton3);
        rr=(ImageButton)findViewById(R.id.imageButton4);

        lg=(ImageButton)findViewById(R.id.imagebtn5);
        rg=(ImageButton)findViewById(R.id.imagebtn6);


        databaseReference= FirebaseDatabase.getInstance().getReference("score4");




        cpuchoice="";
        mychoice="";
        cpuchoice2="";
        mychoice2="";
        mychoice3="";

        score=0;




        //
        lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="blueblue";
                mychoice2="redblue";
                mychoice3="greenblue";

                Calculate();
                scoretext.setText(String.valueOf(score));
            }
        });



        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="greengreen";
                mychoice2="redgreen";
                mychoice3="bluegreen";

                Calculate();
                scoretext.setText(String.valueOf(score));

            }
        });


        lr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="redred";
                mychoice2="bluered";
                mychoice3="greenred";

                Calculate();
                scoretext.setText(String.valueOf(score));

            }
        });

        //// left side finish

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="blueblue";
                mychoice2="redblue";
                mychoice3="greenblue";

                Calculate();
                scoretext.setText(String.valueOf(score));
            }
        });



        rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="greengreen";
                mychoice2="redgreen";
                mychoice3="bluegreen";

                Calculate();
                scoretext.setText(String.valueOf(score));
            }
        });


        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mychoice="redred";
                mychoice2="bluered";
                mychoice3="greenred";

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

        ///////

        else if (mychoice2.equals("redgreen") && cpuchoice.equals("redgreen"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice2.equals("redgreen") && cpuchoice.equals("bluered"))
        {
            score -=1;


            decreasinglifetime();
        }
        else if (mychoice2.equals("redgreen") && cpuchoice.equals("bluegreen"))
        {
            score -=1;
            decreasinglifetime();

        }
        else if (mychoice2.equals("redgreen") && cpuchoice.equals("redred"))
        {
            score -=1;

            decreasinglifetime();
        }

        else if (mychoice2.equals("redgreen") && cpuchoice.equals("redblue"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("redgreen") && cpuchoice.equals("redgreen"))
        {
            score +=1;
            savingdata();

            decreasinglifetime();
        }
        else if (mychoice2.equals("redgreen") && cpuchoice.equals("bluered"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice2.equals("redgreen") && cpuchoice.equals("greengreen"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice2.equals("redgreen") && cpuchoice.equals("greenblue"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice2.equals("redgreen") && cpuchoice.equals("greenred"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redblue") && cpuchoice.equals("greengreen"))
        {
            score +=1;
            savingdata();

        }
        else if (mychoice.equals("redblue") && cpuchoice.equals("greenred"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redblue") && cpuchoice.equals("greenblue"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redblue") && cpuchoice.equals("redred"))
        {
            score -=1;

            decreasinglifetime();
        }
        else if (mychoice.equals("redblue") && cpuchoice.equals("redblue"))
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

        /////////////////

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

    private void showbuil() {

        AlertDialog.Builder builder=new AlertDialog.Builder(level4.this);

        builder.setCancelable(true);
        builder.setTitle("GAME OVER");
        builder.setMessage("Score  is:"+score);


        builder.setIcon(R.drawable.over);


        builder.setNegativeButton("PRACTICE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                Toast.makeText(level4.this, "Score not counted", Toast.LENGTH_SHORT).show();
            }
        });


        builder.setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //  Toast.makeText(level2.this, "Game over", Toast.LENGTH_SHORT).show();
                Intent ip=new Intent(level4.this,MainActivity.class);
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
