package com.example.numfn;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button btnIrAPantalla2 = findViewById(R.id.btn2);
        btnIrAPantalla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inicio.this, dos.class);
                startActivity(intent);
            }
        });
        Button btnIrAPantalla1 = findViewById(R.id.btn1);
        btnIrAPantalla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inicio.this, uno.class);
                startActivity(intent);
            }
        });
        Button btnIrAPantalla3 = findViewById(R.id.btn3);
        btnIrAPantalla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inicio.this, tres.class);
                startActivity(intent);
            }
        });
        Button btnIrAPantallasoporte = findViewById(R.id.btnsuport);
        btnIrAPantallasoporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inicio.this, Soporte.class);
                startActivity(intent);
            }
        });
    }
}

