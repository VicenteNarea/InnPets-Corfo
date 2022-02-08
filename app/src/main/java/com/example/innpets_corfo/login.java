package com.example.innpets_corfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText email;
    EditText pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        button = findViewById(R.id.btnIniciarSesion);
        pass = findViewById(R.id.pass);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String correo = "";
                String passw = "";

                if (validarCredenciales(email)){

                    correo = email.getText ().toString ();
                    passw = pass.getText ().toString ();
                    if (correo.equals("asd@gmail.com") && passw.equals ("12345")){
                        Intent intent = new Intent (getApplicationContext (), principal.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(getApplicationContext(),"correo o contraseña incorrecta",Toast.LENGTH_SHORT).show();
                    }
                }



            }
        });
    }
    private boolean validarCredenciales(EditText email){

        String mailInput = email.getText().toString();
        if(!mailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(mailInput).matches()){
            //Toast.makeText(this, "credenciales validas",Toast.LENGTH_SHORT).show();
            return true;
        }else{
            Toast.makeText(this, "credenciales invalidas",Toast.LENGTH_SHORT).show();
            return false;
        }


    }

    public void registro(View v ){
        Intent i = new Intent(this, registro.class);
        startActivity(i);
    }

}