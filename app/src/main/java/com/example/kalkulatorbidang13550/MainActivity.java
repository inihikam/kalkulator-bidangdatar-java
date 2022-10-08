package com.example.kalkulatorbidang13550;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText pjgBidang, lbrBidang;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initcomponent();
    }

    private void initcomponent(){
        pjgBidang = findViewById(R.id.pjgBidang);
        lbrBidang = findViewById(R.id.lbrBidang);
        txtHasil = findViewById(R.id.txtHasil);
    }

    public void hitungPersegi(View v){
        double pjgPersegi = Double.parseDouble(pjgBidang.getText().toString());
        double lbrPersegi = Double.parseDouble(lbrBidang.getText().toString());

        double luasPersegi = pjgPersegi * lbrPersegi;
        double kelPersegi = (2*pjgPersegi) + (2*lbrPersegi);
        txtHasil.setText("Luas Persegi : "+luasPersegi+"\nKeliling Persegi : "+kelPersegi);
    }

    public void hitungSegitiga(View v){
        double alasSegitiga = Double.parseDouble(pjgBidang.getText().toString());
        double tinggiSegitiga = Double.parseDouble(lbrBidang.getText().toString());

        double luasSegitiga = alasSegitiga * tinggiSegitiga / 2;
        double kelSegitiga = 3 * alasSegitiga;
        txtHasil.setText("Luas Segitiga : "+luasSegitiga+"\nKeliling Segitiga : "+kelSegitiga);
    }

    public void hitungLingkaran(View v){
        double diameter = Double.parseDouble(pjgBidang.getText().toString());

        double luasLingkaran = Math.PI * Math.pow(diameter, 2) / 4;
        double kelLingkaran = Math.PI * diameter;
        txtHasil.setText("Luas Lingkaran : "+ String.format("%.2f", luasLingkaran)+"\nKeliling Lingkaran : "+ String.format("%.2f", kelLingkaran));
    }
}