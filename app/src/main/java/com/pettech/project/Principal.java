package com.pettech.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    //definicion de botones para pulsar
    public Button boti;
    public Button enciclo;
    public Button map;
    public Button vacun;

    //metodo para hacer que el boton funcione
    public void init(){
        boti = (Button)findViewById(R.id.boti);//identifica el boton
        boti.setOnClickListener(new View.OnClickListener() {//crea el listener de la accion
            @Override
            public void onClick(View v) {
                Intent but1 = new Intent (Principal.this, Botiquin.class);//hace la actividad

                startActivity(but1);//comienza la actividad


            }
        });
        //fin del metodo
    }
    //inicio del metodo
    public void libro(){
        enciclo = (Button)findViewById(R.id.enciclo);
        enciclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent but2 = new Intent(Principal.this, Enciclopedia.class);

                startActivity(but2);
            }
        });
    }//fin del metodo








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        init();
        libro();






    }
}
