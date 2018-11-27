package com.example.mt4_pc.teste;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends DebugActivity {

    //final Context context = this;

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

                    TextView tLogin = (TextView) findViewById(R.id.tLogin);
                    TextView tSenha = (TextView) findViewById(R.id.tSenha);
                    String login = tLogin.getText().toString();
                    String senha = tSenha.getText().toString();
                    if("lucas".equals(login) && "123".equals(senha)){
                        Intent intent = new Intent(getContext(), BemVindoActivity.class);
                        Bundle params = new Bundle();
                        params.putString("nome", "Lucas Amaral");
                        //intent.putExtra("nome", "Lucas amaral"); usado tbm para passar parametros para Intent
                        intent.putExtras(params);
                        startActivity(intent);
                    }else{
                        alert("Login e senha incorretos");
                    }

                }
            };
        }

        private Context getContext(){
            return this;
        }

        private void alert(String s){
            Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        }
}
