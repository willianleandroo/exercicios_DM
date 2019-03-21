package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoEmpresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_empresa);
    }

    public void discarClick(View v){

        Intent numero = new Intent(Intent.ACTION_DIAL);


        Uri uri = Uri.parse("tel://03134346510");


        numero.setData(uri);


        startActivity(numero);
    }

    public void internetClick(View v){
        Intent site = new Intent(Intent.ACTION_VIEW);

        Uri uri = Uri.parse("https://www.facebook.com/encantodasdamas/");

        site.setData(uri);

        startActivity(site);

    }

    public void compartilharClick(View v){
        Intent share = new Intent(Intent.ACTION_SEND);

        share.putExtra(Intent.EXTRA_TEXT, "Acesse o app da Encanto das Damas");

        share.setType("text/plain");

        startActivity(share);

    }

}
