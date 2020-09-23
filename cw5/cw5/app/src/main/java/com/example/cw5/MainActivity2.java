package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button m = findViewById(R.id.button);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent x = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(x);

                TextView sun = findViewById(R.id.textView2);
                TextView moon = findViewById(R.id.textView3);

            }
        });

        TextView sun = findViewById(R.id.textView2);
        TextView moon = findViewById(R.id.textView3);


        Bundle airport = getIntent().getExtras();
        String k = airport.getString("ahmed");
        String o = airport.getString("alturkait");

        sun.setText(k);
        moon.setText(o);

    }
}