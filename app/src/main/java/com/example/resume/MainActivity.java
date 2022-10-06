package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button continue_btn;
    EditText name_edt,add_edt,email_edt,phone_edt,birth_edt,nation_edt;

    RadioGroup Marital_group,gender_group;
    String Gender,Gender1;
    RadioButton male,female,single,Married;
    EditText cource_edt,uni_edt,grade_edt,year_edt;
    EditText campany_edt,job_edt,start_edt,end_edt,deatail_edt;
    EditText skill_edt,Hobby_edt;
    EditText object_edt;
    EditText refee_edt,jobo_edt,company_edt,emal_edt,phonei_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continue_btn = findViewById(R.id.continue_btn);
        name_edt = findViewById(R.id.name_edt);
        add_edt = findViewById(R.id.add_edt);
        email_edt = findViewById(R.id.email_edt);
        phone_edt = findViewById(R.id.phone_edt);
        birth_edt = findViewById(R.id.birth_edt);
        nation_edt = findViewById(R.id.nation_edt);
        campany_edt = findViewById(R.id.campany_edt);
        job_edt = findViewById(R.id.job_edt);
        start_edt = findViewById(R.id.start_edt);
        skill_edt = findViewById(R.id.skill_edt);
        Hobby_edt = findViewById(R.id.Hobby_edt);
        object_edt = findViewById(R.id.object_edt);
        end_edt = findViewById(R.id.end_edt);
        deatail_edt = findViewById(R.id.deatail_edt);
        Marital_group = findViewById(R.id.Marital_group);
        gender_group = findViewById(R.id.gender_group);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        single = findViewById(R.id.single);
        Married = findViewById(R.id.Married);
        cource_edt = findViewById(R.id.cource_edt);
        uni_edt = findViewById(R.id.uni_edt);
        grade_edt = findViewById(R.id.grade_edt);
        year_edt = findViewById(R.id.year_edt);
        refee_edt = findViewById(R.id.refee_edt);
        jobo_edt = findViewById(R.id.jobo_edt);
        company_edt = findViewById(R.id.company_edt);
        emal_edt = findViewById(R.id.emal_edt);
        phonei_edt = findViewById(R.id.phonei_edt);


        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Fname = name_edt.getText().toString();
                String Fname1 = name_edt.getText().toString();
                String natt = nation_edt.getText().toString();
                String Fadd = add_edt.getText().toString();
                String Femail = email_edt.getText().toString();
                String Fphone = phone_edt.getText().toString();
                String Fbirth = birth_edt.getText().toString();
                String Fnation = nation_edt.getText().toString();

                switch (gender_group.getCheckedRadioButtonId()){
                    case R.id.male:
                        Gender = "Male";
                        break;
                    case R.id.female:
                        Gender = "Female";
                        break;
                }
                switch (Marital_group.getCheckedRadioButtonId()){
                    case R.id.single:
                        Gender1 = "Single";
                        break;
                    case R.id.Married:
                        Gender1 = "Married";
                        break;
                }
                String Scource = cource_edt.getText().toString();
                String Suni= uni_edt.getText().toString();
                String Srade = grade_edt.getText().toString();
                String Syear= year_edt.getText().toString();
                String Pcom = campany_edt.getText().toString();
                String Pjob = job_edt.getText().toString();
                String Pstart = start_edt.getText().toString();
                String Pend= end_edt.getText().toString();
                String Pdea = deatail_edt.getText().toString();
                String Rskill = skill_edt.getText().toString();
                String Rhobby = Hobby_edt.getText().toString();
                String Oobj = object_edt.getText().toString();
                String Wrefee= refee_edt.getText().toString();
                String Wjob= jobo_edt.getText().toString();
                String Wcom = company_edt.getText().toString();
                String Wemal = emal_edt.getText().toString();
                String Wphone = phonei_edt.getText().toString();


                Intent intent = new Intent(MainActivity.this, Templete.class);
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