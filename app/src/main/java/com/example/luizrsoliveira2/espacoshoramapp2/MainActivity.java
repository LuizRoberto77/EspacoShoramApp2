package com.example.luizrsoliveira2.espacoshoramapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void area(View view) {
        Intent intent = new Intent(MainActivity.this,Area_Usuario_Activity.class);
        startActivity(intent);
    }

    public void agendamento(View view) {
        Intent intent = new Intent(MainActivity.this,Agendamento_Activity.class);
        startActivity(intent);
    }

    public void contato(View view) {
        Intent intent = new Intent(MainActivity.this,Contato_Activity.class);
        startActivity(intent);
    }

    public void tecnicas(View view) {
        Intent intent = new Intent(MainActivity.this, Tecnicas_Activity.class);
        startActivity(intent);
    }
}



