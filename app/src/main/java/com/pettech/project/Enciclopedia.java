package com.pettech.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enciclopedia extends AppCompatActivity {
    Button buscar;

    public void busqueda(){
        buscar = (Button) findViewById(R.id.buscar);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bus = new Intent(Enciclopedia.this, Enciclopedia2.class);

                startActivity(bus);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enciclopedia);
        busqueda();
    }
}
