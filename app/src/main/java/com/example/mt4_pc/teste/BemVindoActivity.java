package com.example.mt4_pc.teste;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;

public class BemVindoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(nome + ", seja bem-vindo");

    }

  @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
           Intent homeIntent = new Intent(this, MainActivity.class);
           homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           startActivity(homeIntent);
        }
        return super.onOptionsItemSelected(item);
    }


}
