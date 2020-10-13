package com.example.mybasicapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG Ciclo de Vida", "onCreate()");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    protected void onStart() {
        super.onStart();
        Log.i("TAG Ciclo de Vida", "onStart()");
    }
    protected void onPause() {
        super.onPause();
        Log.i("TAG Ciclo de Vida", "onPause()");
    }
    protected void onResume() {
        super.onResume();
        Log.i("TAG Ciclo de Vida", "onResume()");
    }
    protected void onStop() {
        super.onStop();
        Log.i("TAG Ciclo de Vida", "onStop()");
    }
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG Ciclo de Vida", "onRestart()");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG Ciclo de Vida", "onDestroy()");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        int user = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_setting) {
            return true;
        }
        if (user == R.id.action_user) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}