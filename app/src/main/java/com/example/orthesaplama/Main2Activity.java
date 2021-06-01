package com.example.orthesaplama;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main2Activity {

    EditText y1,y2,y3,y4,y5,y6,y7,y8,y9,y10;
    Button btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ikincisayfa);

       y1= findViewById(R.id.st1);
       y2= findViewById(R.id.st2);
       y3= findViewById(R.id.st3);
       y4= findViewById(R.id.st4);
       y5= findViewById(R.id.st5);
       y6= findViewById(R.id.st6);
       y7= findViewById(R.id.st7);
       y8= findViewById(R.id.st8);

        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear2();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markscal2();

            }
        });
    }

    private void setContentView(int ikincisayfa) {
    }

    public void markscal2() {
        int m1, m2, m3,m4,m5,m6,m7,m8;
        int total;
        double avg;

        m1 = Integer.parseInt(y1.getText().toString());
        m2 = Integer.parseInt(y2.getText().toString());
        m3 = Integer.parseInt(y3.getText().toString());
        m4 = Integer.parseInt(y4.getText().toString());
        m5 = Integer.parseInt(y5.getText().toString());
        m6 = Integer.parseInt(y6.getText().toString());
        m7 = Integer.parseInt(y7.getText().toString());
        m8 = Integer.parseInt(y8.getText().toString());


        total = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8;

        y9.setText(String.valueOf(total));

        avg = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 / 8;

        y10.setText(String.valueOf(avg));

    }

    public void clear2()
    {
        y1.setText("");
        y2.setText("");
        y3.setText("");
        y4.setText("");
        y5.setText("");
        y6.setText("");
        y7.setText("");
        y8.setText("");
        y1.requestFocus();
    }


}