package com.example.mt4_pc.teste;

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

public class BemVindoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        /*Intent intent = getIntent();
        Bundle args = intent.getExtras();
        String nome = args.getString("nome");*/

        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(nome + ", seja bem-vindo");
        //add o bottao "up navigation"
        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }

  /* @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            //o metodo finish() vai encerrar essa activity
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/

}
