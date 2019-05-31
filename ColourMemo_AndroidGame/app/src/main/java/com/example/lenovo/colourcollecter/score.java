package com.example.lenovo.colourcollecter;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class score extends AppCompatActivity {


private TextView t1,t2,t3,t4;
private  DatabaseReference databaseReference1;
private  DatabaseReference databaseReference2;
private  DatabaseReference databaseReference3;
private  DatabaseReference databaseReference4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

       t1=(TextView)findViewById(R.id.level1scoreID);
       t2=(TextView)findViewById(R.id.level2scoreID);
       t3=(TextView)findViewById(R.id.level3scoreID);
       t4=(TextView)findViewById(R.id.level4scoreID);

       databaseReference1=FirebaseDatabase.getInstance().getReference().child("score1");
       databaseReference2=FirebaseDatabase.getInstance().getReference().child("score2");
       databaseReference3=FirebaseDatabase.getInstance().getReference().child("score3");
       databaseReference4=FirebaseDatabase.getInstance().getReference().child("score4");


       databaseReference1.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
                String name=dataSnapshot.getValue().toString();
                t1.setText(name);
           }

           @Override
           public void onCancelled(DatabaseError databaseError) {
               Toast.makeText(score.this, "Connect the internet", Toast.LENGTH_SHORT).show();
           }
       });


       databaseReference2.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
               String name2=dataSnapshot.getValue().toString();
               t2.setText(name2);
           }

           @Override
           public void onCancelled(DatabaseError databaseError) {

           }
       });

       databaseReference3.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
               String name3=dataSnapshot.getValue().toString();
               t3.setText(name3);
           }

           @Override
           public void onCancelled(DatabaseError databaseError) {

           }
       });

       databaseReference4.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
               String name4=dataSnapshot.getValue().toString();
               t4.setText(name4);
           }

           @Override
           public void onCancelled(DatabaseError databaseError) {

           }
       });

    }
}
