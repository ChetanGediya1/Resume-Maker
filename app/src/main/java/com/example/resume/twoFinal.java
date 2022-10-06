package com.example.resume;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class twoFinal extends AppCompatActivity {
    TextView name_ttxt, nation_ttxt,name1_ttxt,add_ttxt,email_ttxt,phone_ttxt,birth_ttxt,nati_ttxt,marital_ttxt,gender_ttxt,cource_ttxt,
            uni_ttxt,grade_ttxt,year_ttxt,com_ttxt,job_ttxt,start_ttxt,end_ttxt,deatail_ttxt,skill_ttxt,
            hobby_ttxt,obj_ttxt,refee_ttxt,jobi_ttxt,compi_ttxt,emill_ttxt,phonee_ttxt;
    CircleImageView users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_final);
        name_ttxt = findViewById(R.id.name_ttxt);
        nation_ttxt = findViewById(R.id.nation_ttxt);
        name1_ttxt = findViewById(R.id.name1_ttxt);
        add_ttxt = findViewById(R.id.add_ttxt);
        email_ttxt = findViewById(R.id.email_ttxt);
        phone_ttxt = findViewById(R.id.phone_ttxt);
        birth_ttxt = findViewById(R.id.birth_ttxt);
        nati_ttxt = findViewById(R.id.nati_ttxt);
        marital_ttxt = findViewById(R.id.marital_ttxt);
        gender_ttxt = findViewById(R.id.gender_ttxt);
        cource_ttxt = findViewById(R.id.cource_ttxt);
        uni_ttxt = findViewById(R.id.uni_ttxt);
        grade_ttxt = findViewById(R.id.grade_ttxt);
        year_ttxt = findViewById(R.id.year_ttxt);
        com_ttxt = findViewById(R.id.com_ttxt);
        job_ttxt = findViewById(R.id.job_ttxt);
        start_ttxt = findViewById(R.id.start_ttxt);
        end_ttxt = findViewById(R.id.end_ttxt);
        deatail_ttxt = findViewById(R.id.deatail_ttxt);
        skill_ttxt = findViewById(R.id.skill_ttxt);
        hobby_ttxt = findViewById(R.id.hobby_ttxt);
        obj_ttxt = findViewById(R.id.obj_ttxt);
        refee_ttxt = findViewById(R.id.refee_ttxt);
        jobi_ttxt = findViewById(R.id.jobi_ttxt);
        compi_ttxt = findViewById(R.id.compi_ttxt);
        emill_ttxt = findViewById(R.id.emill_ttxt);
        phonee_ttxt = findViewById(R.id.phonee_ttxt);
        users = findViewById(R.id.users);

        String Fname1 = getIntent().getStringExtra("A1");
        String natt = getIntent().getStringExtra("A2");
        String Fname = getIntent().getStringExtra("F1");
        String Fadd = getIntent().getStringExtra("F2");
        String Femail = getIntent().getStringExtra("F3");
        String Fphone = getIntent().getStringExtra("F4");
        String Fbirth = getIntent().getStringExtra("F5");
        String Fnation = getIntent().getStringExtra("F6");
        String Gender = getIntent().getStringExtra("F7");
        String Gender1 = getIntent().getStringExtra("F8");
        String Scource = getIntent().getStringExtra("T1");
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

        name_ttxt.setText(Fname1);
        nation_ttxt.setText(natt);
        name1_ttxt.setText("Name:- " + Fname);
        add_ttxt.setText("Address:-" + Fadd);
        email_ttxt.setText("Email:- " + Femail);
        phone_ttxt.setText("Phone:- " + Fphone);
        birth_ttxt.setText("Date of Birth:- " + Fbirth);
        nati_ttxt.setText("Country:- " + Fnation);
        marital_ttxt.setText("Marital Status:- " + Gender);
        gender_ttxt.setText("Gender:- " + Gender1);
        cource_ttxt.setText("Degree Name:- " + Scource);
        uni_ttxt.setText("University:- " + Suni);
        grade_ttxt.setText("Grade:-" + Srade);
        year_ttxt.setText("Year:- " + Syear);
        com_ttxt.setText("Company Name:- " + Pcom);
        job_ttxt.setText("Job Title:- " + Pjob);
        start_ttxt.setText("Start Da.:- " + Pstart);
        end_ttxt.setText("End Da. :-" + Pend);
        deatail_ttxt.setText("Deatail:- " + Pdea);
        skill_ttxt.setText("Skill:- " + Rskill);
        hobby_ttxt.setText("Hobby:- " + Rhobby);
        obj_ttxt.setText("Object: -" + Oobj);
        refee_ttxt.setText("Referee Name:- " + Wrefee);
        jobi_ttxt.setText("Job Ti. :-" + Wjob);
        compi_ttxt.setText("Company Name:- " + Wcom);
        emill_ttxt.setText("Email:- " + Wemal);
        phonee_ttxt.setText("Phone:-" + Wphone);

        users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 100);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (100 == requestCode)
        {
            Uri uri = data.getData();
            users.setImageURI(uri);
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}