package com.example.orthesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button btn1,btn2,button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1= findViewById(R.id.stname);
        ed2= findViewById(R.id.stmarks1);
        ed3= findViewById(R.id.stmarks2);
        ed4= findViewById(R.id.stmarks3);
        ed5= findViewById(R.id.sttotal);
        ed6= findViewById(R.id.stavg);
        ed7= findViewById(R.id.stgrade);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markscal();

            }
        });
    }

    public void markscal() {
        int m1, m2, m3, tot;
        double avg;
        String grade;

        m1 = Integer.parseInt(ed2.getText().toString());
        m2 = Integer.parseInt(ed3.getText().toString());
        m3 = Integer.parseInt(ed4.getText().toString());

        tot = m1 + m2 + m3;

        ed5.setText(String.valueOf(tot));

        avg = m1*20/100+m2*60/100+m3*20/100;

        ed6.setText(String.valueOf(avg));

        if (avg > 91) {
            ed7.setText("AA-->MÜKEMMEL");
        } else if (avg > 81) {
            ed7.setText("BA-->ÇOK İYİ");
        } else if (avg > 71) {
            ed7.setText("BB-->İYİ");
        } else if (avg > 61) {
            ed7.setText("CB-->ORTA");
        } else if (avg > 51) {
            ed7.setText("CC-->ORTA");
        } else if (avg > 41) {
            ed7.setText("CD-->GEÇER");
        } else if (avg > 36) {
            ed7.setText("DD-->ŞARTLI BAŞARILI");
        }else if (avg > 31) {
            ed7.setText("DF-->ŞARTLI BAŞARILI");
        }else if (avg >= 30) {
            ed7.setText("FF");
        }
        else {
            ed7.setText("FAIL");
        }

    }

        public void clear()
        {
            ed1.setText("");
            ed2.setText("");
            ed3.setText("");
            ed4.setText("");
            ed5.setText("");
            ed6.setText("");
            ed7.setText("");
            ed1.requestFocus();
        }

    public void ikinciyegit(View view) {

        Intent intent = new Intent(getApplicationContext(),IntentActivity.class);
        startActivity(intent);


    }
}