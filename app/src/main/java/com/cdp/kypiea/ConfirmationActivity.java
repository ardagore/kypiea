package com.cdp.kypiea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationActivity extends AppCompatActivity {

    public TextView name_view, email_view, password_view, again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        getSupportActionBar().hide();


        name_view = (TextView) findViewById(R.id.name_confirm);
        email_view = (TextView) findViewById(R.id.email_confirm);
        password_view = (TextView) findViewById(R.id.password_confirm);
        again = (Button) findViewById(R.id.volver);


        String name_dato = getIntent().getStringExtra("name_data");
        String email_dato = getIntent().getStringExtra("email_data");
        String password_dato = getIntent().getStringExtra("password_data");
        name_view.setText(name_dato);
        email_view.setText(email_dato);
        password_view.setText(password_dato);

    }

    public void Board(View view){
        Intent again = new Intent(ConfirmationActivity.this, MainActivity.class);
        again.putExtra("name_data", name_view.getText().toString());
        startActivity(again);
    }


}