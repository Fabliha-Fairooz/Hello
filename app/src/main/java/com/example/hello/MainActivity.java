package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button b1,b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button)findViewById(R.id.button);
        b2= (Button)findViewById(R.id.button2);
        t1= (TextView)findViewById(R.id.textView);
    }
    public void showName( View view)
    {
        t1.setText("Fabliha");
    }
    public void showEmail(View view)
    {
        t1.setText("fabliha@anyconnect.com");
    }
    public void showNeutral(View view)
    {
        t1.setText("Hello World!");
    }

}
