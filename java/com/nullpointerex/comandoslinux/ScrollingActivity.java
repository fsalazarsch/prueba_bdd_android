package com.nullpointerex.comandoslinux;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {
    private Toolbar header;
    private TextView manual;


    public void setHeader(Toolbar header, String titulo) {

        this.header = header;
        this.header.setTitle(titulo);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if (b !=null) {
            //Toolbar toolbar = (Toolbar) header;
            String t = (String)b.getStringArray("titulo")[0];
            String man = (String)b.getStringArray("titulo")[1];

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle(t);

            TextView manual = (TextView) findViewById(R.id.textViewManual);
            manual.setText(man);
            setSupportActionBar(toolbar);
        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        catch (NullPointerException npe){}
    }
}
