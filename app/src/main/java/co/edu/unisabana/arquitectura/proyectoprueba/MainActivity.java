package co.edu.unisabana.arquitectura.proyectoprueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText correo = (EditText) findViewById(R.id.correo);
        final EditText contrasena = (EditText) findViewById(R.id.contrasena);
        final TextView registrolink= (TextView) findViewById(R.id.registro);
        final CardView login = (CardView) findViewById(R.id.login);

        registrolink.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, Register.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    }
}
