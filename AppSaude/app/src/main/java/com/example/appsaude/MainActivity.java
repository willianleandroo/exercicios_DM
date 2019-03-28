package com.example.appsaude;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtPeso, txtBiceps, txtAltura, txtCintura, txtBusto, txtQuadril, txtQuadriceps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        txtCintura = findViewById(R.id.txtCintura);
        txtBusto = findViewById(R.id.txtBusto);
        txtQuadril = findViewById(R.id.txtQuadril);
        txtBiceps = findViewById(R.id.txtBiceps);
        txtQuadriceps = findViewById(R.id.txtQuadriceps);
        this.Carregar();

    }

    public void Salvar(View v){
        SharedPreferences preferences = getSharedPreferences("MinhasMedidas",MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("Peso", txtPeso.getText().toString());
        editor.putString("Altura", txtAltura.getText().toString());
        editor.putString("Cintura", txtCintura.getText().toString());
        editor.putString("Busto", txtBusto.getText().toString());
        editor.putString("Quadril", txtQuadril.getText().toString());
        editor.putString("Biceps", txtBiceps.getText().toString());
        editor.putString("Quadriceps", txtQuadriceps.getText().toString());
        editor.apply();
        Toast.makeText(MainActivity.this, "Salvo!", Toast.LENGTH_SHORT).show();
        }

        public void Carregar(){
            SharedPreferences preferences = getSharedPreferences("MinhasMedidas", MODE_PRIVATE);

            String peso = preferences.getString("Peso", "");
            String altura = preferences.getString("Altura", "");
            String cintura = preferences.getString("Cintura", "");
            String busto = preferences.getString("Busto", "");
            String quadril = preferences.getString("Quadril", "");
            String biceps = preferences.getString("Biceps", "");
            String quadriceps = preferences.getString("Quadriceps", "");

            txtPeso.setText(peso);
            txtAltura.setText(altura);
            txtCintura.setText(cintura);
            txtBusto.setText(busto);
            txtQuadril.setText(quadril);
            txtBiceps.setText(biceps);
            txtQuadriceps.setText(quadriceps);

        }
}
