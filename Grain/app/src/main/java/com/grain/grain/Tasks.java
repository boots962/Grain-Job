package com.grain.grain;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Tasks extends Activity {
    Spinner spinner;

    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks);

        spinner = (Spinner) findViewById(R.id.spinner2);

        String [] tasks = {"CNC", "EdgeBander", "Sanding", "Assembly", "Painting", "Installing"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tasks);
        spinner.setAdapter(adapter);



    }
}
