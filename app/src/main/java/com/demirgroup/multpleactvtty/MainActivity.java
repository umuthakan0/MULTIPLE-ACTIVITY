package com.demirgroup.multpleactvtty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblsum;
    TextView lblmultiplay;
    TextView lbldifferance;
    TextView lbldevicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblsum=findViewById(R.id.lblsum);
        lbldevicion=findViewById(R.id.lbldevicion);
        lbldifferance=findViewById(R.id.lbldiffereance);
        lblmultiplay=findViewById(R.id.lblmultiplay);
    }
    int a=0;
    public void openactivity1(View view)
    {
        Intent intent = new Intent(MainActivity.this, calculatefrm.class);
        startActivity(intent);
    }
    public void openactivity(View view)
    {
        int sum,multiplay,differance;
        double devicion;
        Intent intent=getIntent();
        sum=Integer.parseInt(intent.getStringExtra("number1")+intent.getStringExtra("number2"));
        lblsum.setText("sum: "+sum);
        devicion=Integer.parseInt(intent.getStringExtra("number1")) / Integer.parseInt(intent.getStringExtra("number2"));
        differance=Integer.parseInt(intent.getStringExtra("number1"))-Integer.parseInt(intent.getStringExtra("number2"));
        multiplay=Integer.parseInt(intent.getStringExtra("number1"))*Integer.parseInt(intent.getStringExtra("number2"));
        lbldifferance.setText("Differance: "+differance);
        lblmultiplay.setText("multiplay: "+multiplay);
        lbldevicion.setText("devicion: "+devicion);
    }
}