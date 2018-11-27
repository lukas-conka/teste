package com.example.mt4_pc.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(onClickLogin());
    }

        //metodo onCLickLogin() retorna uma implmentacao de View.onClickListener
        private View.OnClickListener onClickLogin(){
            return new Button.OnClickListener(){
                public void onClick(View view){

                }
            };
        }
}
