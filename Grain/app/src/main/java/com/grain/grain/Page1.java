package com.grain.grain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page1 extends Activity {
    Button Clockin;
    Button Clockout;
    Button StartTask;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        Clockin = (Button) findViewById(R.id.button2);
        Clockout = (Button) findViewById(R.id.button3);
        StartTask = (Button) findViewById(R.id.button4);

        status = (TextView) findViewById(R.id.textView3);


        Clockin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CI.clockedIn = true;
                status.setText("Clocked In");
            }
        });
        Clockout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CI.clockedIn = false;
                status.setText("Clocked Out");
            }
        });

        StartTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page1.this, Job.class);
                startActivity(intent);

            }

        });
    }

}
