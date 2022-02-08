package com.example.innpets_corfo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class registro extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        //recuperar los view
        EditText etNombre =( EditText) findViewById(R.id.etNombre);
        //recuperar el valor del view
        String nombre = etNombre.getText().toString();


        //recuperar los view
        EditText etApellido =(EditText) findViewById(R.id.etApellido);
        //recuperar el valor del view
        String apellido = etApellido.getText().toString();


        //recuperar los view
        EditText etRut= (EditText) findViewById(R.id.etRUT);
        //recuperar el valor del view
        String rut = etRut.getText().toString();


        //recuperar los view
        EditText etCorreo = (EditText) findViewById(R.id.etCorreo);
        //recuperar el valor del view
        String correo = etCorreo.getText().toString();


        // calendario
        tv = findViewById(R.id.textView5);
        //recuperar los view
        EditText etFechaNacimiento =( EditText) findViewById(R.id.etFechaNacimiento);

        //recuperar el valor del view
        RadioGroup rgSexo =(RadioGroup) findViewById(R.id.rgGenero);
        //recuperar los view
        int id = rgSexo.getCheckedRadioButtonId();
        String sexo = "";
        switch (id){
            case R.id.rbMasculino:
                sexo = "Masculino";
                break;
            case R.id.rbFemenino:
                sexo = "Femenino";
                break;
            default:
                //Toast.makeText(this,"Seleccione un genero por favor",Toast.LENGTH_SHORT).show();
        }


        //recuperar los view
        Spinner spRegion = (Spinner) findViewById(R.id.spRegiones);
        //recuperar el valor del view
        String region = spRegion.getSelectedItem().toString();

        //recuperar los view
        Spinner spComuna = (Spinner) findViewById(R.id.spComunas);
        //recuperar el valor del view
        String comuna = spComuna.getSelectedItem().toString();

        //recuperar los view
        Spinner spCiudad = (Spinner) findViewById(R.id.spCiudad);
        //recuperar el valor del view
        String ciudad = spCiudad.getSelectedItem().toString();

        //Recuperar el valor del view
        EditText etPass = (EditText) findViewById(R.id.etPass);
        //recuperar el valor del view
        String pass = etPass.getText().toString();

        //Recuperar el valor del view
        EditText etPass2 = (EditText) findViewById(R.id.etPass2);
        //recuperar el valor del view
        String pass2 = etPass.getText().toString();

        if (pass.equals(pass2)){
            Toast.makeText(this, "¡Registro exitoso!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "¡Registro fallido!", Toast.LENGTH_SHORT).show();

        }



    }
    public void abrirCalendario(View view) {

        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpb  = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String fecha = dayOfMonth +"/"+ month +"/"+ year;
                tv.setText(fecha);

            }
        },anio,mes,dia);
        dpb.show();
    }
    public void goTransicion(View v ){
        Intent i = new Intent(this, opcionRegistro.class);
        startActivity(i);
    }

}