package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<Tarea> lasTareas;
    private Button btnFiltrar;
    private TextInputLayout tilFiltro;
    private ListView lstTareas;
    private ArrayAdapter<Tarea> adaptadorTareas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        poblarArregloArrayList();

        referencias();
        eventos();

        Tarea tar = (Tarea) getIntent().getExtras().getSerializable("La_tarea");
        String datos = tar.getTitulo() + " -> " + tar.getDescripcion();



    }

    //// EVENTOS Y REFERECIAS

    private void eventos()
    {
        lstTareas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                return true;
            }
        });
    }

    private void referencias(){
        lstTareas=findViewById(R.id.lstTareas);
        btnFiltrar=findViewById(R.id.btnFiltrar);
        tilFiltro=findViewById(R.id.tilTitulo);
        adaptadorTareas = new ArrayAdapter<Tarea>(this, android.R.layout.simple_list_item_1, lasTareas);
        lstTareas.setAdapter(adaptadorTareas);

    }

    private void poblarArregloArrayList() {

        lasTareas = new ArrayList<Tarea>();
        Tarea c = new Tarea();
        lasTareas.add(c);





    }
}
