package com.example.mt4_pc.teste;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.GenericArrayType;

class DebugActivity extends Activity {
    protected static final String TAG = "livro";

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Log.i(TAG, getClassName() + ".onCreate() chamado: " + icicle);
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, getClassName() + ".onStart() chamado.");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, getClassName() + ".onRestart() chamado");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, getClassName() + ".onResume() chamado");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG, getClassName() + "onPause() chamado");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG, getClassName() + "OnSaveInstanceState() chamado.");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG, getClassName() + "onStop() chamado");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, getClassName() + "onDestroy");
    }

    private String getClassName(){
        //Retorna o nome da classe sem o pacote
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }
}