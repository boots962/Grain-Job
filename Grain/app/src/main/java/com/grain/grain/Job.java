package com.grain.grain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Job extends Activity {
    Spinner spinner;
    TextView status;
    Button select;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] str = {"Lucente", "Mancini", "Shulgan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
        spinner.setAdapter(adapter);

        status = (TextView) findViewById(R.id.textView);
        if (CI.clockedIn) {
            status.setText("Clocked in");
        } else {
            status.setText("Clocked out");
        }

        select = (Button) findViewById(R.id.button5);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Job.this, Tasks.class);
                startActivity(intent);
            }
        });
    }



}
