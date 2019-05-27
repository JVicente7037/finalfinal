package co.edu.unisabana.arquitectura.proyectoprueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    Spinner opciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        opciones=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);

        opciones.setAdapter(adapter);



        final EditText correo = (EditText) findViewById(R.id.correo);
        final EditText contrasena = (EditText) findViewById(R.id.contrasena);
        final Spinner tipo = (Spinner) findViewById(R.id.spinner);
        final TextView iniciolink= (TextView) findViewById(R.id.inicio);
        final CardView registro = (CardView) findViewById(R.id.registro);

        iniciolink.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent registerIntent = new Intent(Register.this, MainActivity.class);
                Register.this.startActivity(registerIntent);
            }
        });
    }
}




