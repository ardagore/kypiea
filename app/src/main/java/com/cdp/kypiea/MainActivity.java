package com.cdp.kypiea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView register;
    public EditText login_email, login_password;
    TextView name_view;
    Button Start;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        register = (TextView) findViewById(R.id.registro);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegistroActivity.class));
            }
        });


        login_email = (EditText) findViewById(R.id.login_email);
        login_password = (EditText) findViewById(R.id.login_password);
        name_view = (TextView) findViewById(R.id.prueba);
        Start = (Button) findViewById(R.id.start);

        String name_dato = getIntent().getStringExtra("name_data");
        name_view.setText(name_dato);

    }

    public void validacion(View view){

        Intent starting = new Intent(MainActivity.this, BoardActivity.class);
        starting.putExtra("name_data", name_view.getText().toString());
        Toast.makeText(this, "Ingreso satisfactorio", Toast.LENGTH_SHORT).show();
        startActivity(starting);
    }

}