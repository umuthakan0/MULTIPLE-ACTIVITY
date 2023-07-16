package com.demirgroup.multpleactvtty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class calculatefrm extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatefrm);
        editText1=findViewById(R.id.txtnumber1);
        editText2=findViewById(R.id.txtnumber2);
    }
    public void calculate(View view)
    {
        Intent intent=new Intent(calculatefrm.this, MainActivity.class);
        intent.putExtra("number1",editText1.getText().toString());
        intent.putExtra("number2",editText2.getText().toString());
        startActivity(intent);
    }
}