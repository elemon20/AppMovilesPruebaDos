package com.example.tarea;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.util.Log;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private Button btnBuscar,btnIngresar,btnModificar;
    private TextInputLayout tilTitulo,tilDescripcion;
    private ListView lstTareas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        referenciasWidget();
        eventos();

    }


    private void ingresarDatos() {

        String titulo, descripcion;
        titulo = tilTitulo.getEditText().getText().toString();
        descripcion = tilDescripcion.getEditText().getText().toString();

        Tarea tarea = new Tarea(titulo, descripcion);
        Toast.makeText(MainActivity.this, "Se ingreso la tarea " + titulo, Toast.LENGTH_SHORT).show();

        Intent mostrarInfo = new Intent(this, MainActivity2.class);
        mostrarInfo.putExtra("La_tarea", tarea);
        startActivity(mostrarInfo);




    }



    private void buscarDatos() {


        ///Intent mostrarInfo = new Intent(this, MainActivity2.class);

        //startActivity(mostrarInfo);


    }


// referencias y eventos ////


    private void referenciasWidget() {

        btnBuscar = findViewById(R.id.btnbuscar);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnModificar = findViewById(R.id.btnModificar);
        tilTitulo = findViewById(R.id.tilTitulo);
        tilDescripcion = findViewById(R.id.tilDescripcion);
    }
    private  void eventos() {
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {buscarDatos();}

        });


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ingresarDatos();}

        });

    }

}
