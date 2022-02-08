package com.example.innpets_corfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class registroMascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_mascota);

        //recuperar los view
        EditText etNombreMascota =( EditText) findViewById(R.id.etNombreMascota);
        //recuperar el valor del view
        String nombreMascota = etNombreMascota.getText().toString();

        //recuperar los view
        EditText etTipoMascota =( EditText) findViewById(R.id.etTipoMascota);
        //recuperar el valor del view
        String tipoMascota = etNombreMascota.getText().toString();

        //recuperar los view
        EditText etRazaMascota =( EditText) findViewById(R.id.etRazaMascota);
        //recuperar el valor del view
        String razaMascota = etRazaMascota.getText().toString();

        //recuperar el valor del view
        RadioGroup rgTamanio =(RadioGroup) findViewById(R.id.rgTamanio);
        //recuperar los view
        int id = rgTamanio.getCheckedRadioButtonId();
        String tamanio = "";
        switch (id){
            case R.id.rbPequenio:
                tamanio = "pequeño";
                break;
            case R.id.rbMediano:
                tamanio = "Mediano";
                break;
            case R.id.rbGrande:
                tamanio = "Grande";
                break;
            default:
                //Toast.makeText(this,"Seleccione un genero por favor",Toast.LENGTH_SHORT).show();
        }

        //recuperar los view
        EditText etDescripcion =( EditText) findViewById(R.id.etDescripcion);
        //recuperar el valor del view
        String descripcion = etDescripcion.getText().toString();

        //fotoooo



        //recuperar los view
        EditText etComportamiento =( EditText) findViewById(R.id.etComportamiento);
        //recuperar el valor del view
        String comportamiento = etComportamiento.getText().toString();
    }

    public void goPrincipal(View v ){
        Intent i = new Intent(this, principal.class);
        startActivity(i);
    }
}