package com.example.gestorcasilleroapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestorcasilleroapp.R;

public class AuthenticationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        EditText emailEditText = findViewById(R.id.etEmail);
        EditText passwordEditText = findViewById(R.id.etPassword);
        Button loginButton = findViewById(R.id.btnLogin);
        Button registerButton = findViewById(R.id.btnRegister);

        // Acción del botón de Iniciar Sesión
        loginButton.setOnClickListener(view -> {
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

//            if (!email.isEmpty() && !password.isEmpty()) {
//                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(AuthenticationActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            } else {
//                Toast.makeText(this, "Por favor, completa los campos", Toast.LENGTH_SHORT).show();
//            }
        });
        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(AuthenticationActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        // Acción del botón de Registro
        registerButton.setOnClickListener(view -> {
            Intent intent = new Intent(AuthenticationActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}
