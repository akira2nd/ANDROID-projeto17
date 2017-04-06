package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private List<Integer> numeros1 = new ArrayList<Integer>();
    private List<Integer> numeros2 = new ArrayList<Integer>();
    private Integer numeroI;
    private Integer numeroF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (Integer x = 1; x <= 10; x++){
            numeros1.add(x);
        }

        spinner1 = (Spinner) findViewById(R.id.spinnerDe);
        spinner2 = (Spinner) findViewById(R.id.spinnerAte);

        ArrayAdapter<Integer> arrayAdapter1 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, numeros1);
        ArrayAdapter<Integer> spinnerArrayAdapter1 = arrayAdapter1;
        spinnerArrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(spinnerArrayAdapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                numeroI = i;
                for(Integer numero = i; numero <= 10; numero++) {
                    numeros2.add(numero);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<Integer> arrayAdapter2 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, numeros2);
        ArrayAdapter<Integer> spinnerArrayAdapter2 = arrayAdapter2;
        spinnerArrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner2.setAdapter(spinnerArrayAdapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                numeroF = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
