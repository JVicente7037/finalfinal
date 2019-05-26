package co.edu.unisabana.arquitectura.proyectoprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class Register extends AppCompatActivity {

    Spinner opciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        opciones=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);

        opciones.setAdapter(adapter);
    }
}




