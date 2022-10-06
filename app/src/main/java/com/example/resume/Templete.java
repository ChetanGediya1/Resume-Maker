package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Templete extends AppCompatActivity {
    ImageView image1,image2,image3,image4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templete);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        String Fname1 = getIntent().getStringExtra("A1");
        String natt = getIntent().getStringExtra("A2");
        String Fname = getIntent().getStringExtra("F1");
        String Fadd = getIntent().getStringExtra("F2");
        String Femail = getIntent().getStringExtra("F3");
        String Fphone = getIntent().getStringExtra("F4");
        String Fbirth = getIntent().getStringExtra("F5");
        String Fnation = getIntent().getStringExtra("F6");
        String Gender = getIntent().getStringExtra("F7");
        String Gender1= getIntent().getStringExtra("F8");
        String Scource= getIntent().getStringExtra("T1");
        String Suni = getIntent().getStringExtra("T2");
        String Srade = getIntent().getStringExtra("T3");
        String Syear = getIntent().getStringExtra("T4");
        String Pcom = getIntent().getStringExtra("P1");
        String Pjob = getIntent().getStringExtra("P2");
        String Pstart = getIntent().getStringExtra("P3");
        String Pend = getIntent().getStringExtra("P4");
        String Pdea = getIntent().getStringExtra("P5");
        String Rskill = getIntent().getStringExtra("R1");
        String Rhobby = getIntent().getStringExtra("R1");
        String Oobj = getIntent().getStringExtra("O1");
        String Wrefee = getIntent().getStringExtra("W1");
        String Wjob = getIntent().getStringExtra("W2");
        String Wcom = getIntent().getStringExtra("W3");
        String Wemal = getIntent().getStringExtra("W4");
        String Wphone = getIntent().getStringExtra("W5");





        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Templete.this, oneFinal.class);
                intent.putExtra("A1",Fname1);
                intent.putExtra("A2",natt);
                intent.putExtra("F1",Fname);
                intent.putExtra("F2",Fadd);
                intent.putExtra("F3",Femail);
                intent.putExtra("F4",Fphone);
                intent.putExtra("F5",Fbirth);
                intent.putExtra("F6",Fnation);
                intent.putExtra("F7",Gender);
                intent.putExtra("F8",Gender1);
                intent.putExtra("T1",Scource);
                intent.putExtra("T2",Suni);
                intent.putExtra("T3",Srade);
                intent.putExtra("T4",Syear);
                intent.putExtra("P1",Pcom);
                intent.putExtra("P2",Pjob);
                intent.putExtra("P3",Pstart);
                intent.putExtra("P4",Pend);
                intent.putExtra("P5",Pdea);
                intent.putExtra("R1",Rskill);
                intent.putExtra("R2",Rhobby);
                intent.putExtra("O1",Oobj);
                intent.putExtra("W1",Wrefee);
                intent.putExtra("W2",Wjob);
                intent.putExtra("W3",Wcom);
                intent.putExtra("W4",Wemal);
                intent.putExtra("W5",Wphone);
                startActivity(intent);


            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Templete.this, twoFinal.class);
                intent.putExtra("A1",Fname1);
                intent.putExtra("A2",natt);
                intent.putExtra("F1",Fname);
                intent.putExtra("F2",Fadd);
                intent.putExtra("F3",Femail);
                intent.putExtra("F4",Fphone);
                intent.putExtra("F5",Fbirth);
                intent.putExtra("F6",Fnation);
                intent.putExtra("F7",Gender);
                intent.putExtra("F8",Gender1);
                intent.putExtra("T1",Scource);
                intent.putExtra("T2",Suni);
                intent.putExtra("T3",Srade);
                intent.putExtra("T4",Syear);
                intent.putExtra("P1",Pcom);
                intent.putExtra("P2",Pjob);
                intent.putExtra("P3",Pstart);
                intent.putExtra("P4",Pend);
                intent.putExtra("P5",Pdea);
                intent.putExtra("R1",Rskill);
                intent.putExtra("R2",Rhobby);
                intent.putExtra("O1",Oobj);
                intent.putExtra("W1",Wrefee);
                intent.putExtra("W2",Wjob);
                intent.putExtra("W3",Wcom);
                intent.putExtra("W4",Wemal);
                intent.putExtra("W5",Wphone);
                startActivity(intent);


            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Templete.this, threeFinal.class);

                intent.putExtra("F1",Fname);
                intent.putExtra("F2",Fadd);
                intent.putExtra("F3",Femail);
                intent.putExtra("F4",Fphone);
                intent.putExtra("F5",Fbirth);
                intent.putExtra("F6",Fnation);
                intent.putExtra("F7",Gender);
                intent.putExtra("F8",Gender1);
                intent.putExtra("T1",Scource);
                intent.putExtra("T2",Suni);
                intent.putExtra("T3",Srade);
                intent.putExtra("T4",Syear);
                intent.putExtra("P1",Pcom);
                intent.putExtra("P2",Pjob);
                intent.putExtra("P3",Pstart);
                intent.putExtra("P4",Pend);
                intent.putExtra("P5",Pdea);
                intent.putExtra("R1",Rskill);
                intent.putExtra("R2",Rhobby);
                intent.putExtra("O1",Oobj);
                intent.putExtra("W1",Wrefee);
                intent.putExtra("W2",Wjob);
                intent.putExtra("W3",Wcom);
                intent.putExtra("W4",Wemal);
                intent.putExtra("W5",Wphone);
                startActivity(intent);


            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Templete.this, fourFinal.class);
                intent.putExtra("A1",Fname1);
                intent.putExtra("A2",natt);
                intent.putExtra("F1",Fname);
                intent.putExtra("F2",Fadd);
                intent.putExtra("F3",Femail);
                intent.putExtra("F4",Fphone);
                intent.putExtra("F5",Fbirth);
                intent.putExtra("F6",Fnation);
                intent.putExtra("F7",Gender);
                intent.putExtra("F8",Gender1);
                intent.putExtra("T1",Scource);
                intent.putExtra("T2",Suni);
                intent.putExtra("T3",Srade);
                intent.putExtra("T4",Syear);
                intent.putExtra("P1",Pcom);
                intent.putExtra("P2",Pjob);
                intent.putExtra("P3",Pstart);
                intent.putExtra("P4",Pend);
                intent.putExtra("P5",Pdea);
                intent.putExtra("R1",Rskill);
                intent.putExtra("R2",Rhobby);
                intent.putExtra("O1",Oobj);
                intent.putExtra("W1",Wrefee);
                intent.putExtra("W2",Wjob);
                intent.putExtra("W3",Wcom);
                intent.putExtra("W4",Wemal);
                intent.putExtra("W5",Wphone);
                startActivity(intent);


            }
        });
    }
}