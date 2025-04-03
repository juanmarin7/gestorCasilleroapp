package com.example.gestorcasilleroapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gestorcasilleroapp.R;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText etFullName = findViewById(R.id.etFullName);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPhone = findViewById(R.id.etPhone);
        EditText etPassword = findViewById(R.id.etPassword);
        EditText etConfirmPassword = findViewById(R.id.etConfirmPassword);
        Button btnRegister = findViewById(R.id.btnRegister);
        TextView tvLogin = findViewById(R.id.tvLogin);
        Spinner spDocumentType = findViewById(R.id.spDocumentType);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.document_types,
                android.R.layout.simple_spinner_item
        );

        // Estilo del Spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDocumentType.setAdapter(adapter);
        // Acción del botón de registro
        btnRegister.setOnClickListener(view -> {
            String fullName = etFullName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String phone = etPhone.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
            String confirmPassword = etConfirmPassword.getText().toString().trim();

//            if (fullName.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
//                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
//                return;
//            }

//            if (!password.equals(confirmPassword)) {
//                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
//                return;
//            }

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();

            // Redirigir a HomeActivity después del registro exitoso
            Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
            startActivity(intent);
            finish(); // Cierra esta actividad para evitar que el usuario regrese con "atrás"
        });

        // Acción para volver a la pantalla de inicio de sesión
        tvLogin.setOnClickListener(view -> {
            startActivity(new Intent(RegisterActivity.this, AuthenticationActivity.class));
            finish();
        });
    }
}
