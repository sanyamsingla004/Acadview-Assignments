package com.example.hp7.operations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"Inside Create",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"This is Start",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"This is Stop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"This is Destroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"This is Pause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"This is Resume",Toast.LENGTH_SHORT).show();
    }
}
