package com.example.homework;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size=30;
    public void bigger(View v){
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);
        txv.setTextSize(++size);

        Log.d( "MainActivity", "bigger");
    }

    public void smaller(View v){
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);
        txv.setTextSize(--size);

        Log.d( "MainActivity", "smaller");
    }


    public void display(View v){
        EditText name= (EditText) findViewById(R.id.name);
        TextView text2= (TextView) findViewById(R.id.txv);

        text2.setText(name.getText().toString());
        Log.d( "MainActivity", "display");
    }

}
