package com.example.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText f,s;
    private Button sum,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add();
    }
    public void add()
    {
        f=(EditText)findViewById(R.id.first);
        s=(EditText)findViewById(R.id.second);
        sum=(Button) findViewById(R.id.btn);
        sub=(Button)findViewById(R.id.btn2);
        mul=(Button)findViewById(R.id.btn3);
        div=(Button)findViewById(R.id.btn4);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=f.getText().toString();
                String value2=s.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=f.getText().toString();
                String value2=s.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sub=a-b;
                Toast.makeText(getApplicationContext(),String.valueOf(sub), Toast.LENGTH_LONG).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=f.getText().toString();
                String value2=s.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int mul=a*b;
                Toast.makeText(getApplicationContext(),String.valueOf(mul), Toast.LENGTH_LONG).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=f.getText().toString();
                String value2=s.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int div=a/b;
                Toast.makeText(getApplicationContext(),String.valueOf(div), Toast.LENGTH_LONG).show();
            }
        });
    }

}