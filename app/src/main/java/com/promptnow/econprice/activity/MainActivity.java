package com.promptnow.econprice.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.promptnow.econprice.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
/*
    public void btnClick(View v){
        showMessage("Hell");
    }

    public void showMessage(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
    */

    public void btnClick(View view){
        Button btnClick = (Button)findViewById(R.id.button);
        Intent intent = new Intent(MainActivity.this,GuideOilPriceActivity.class);
        startActivity(intent);
    }


    public void btnClickSKIP(View view){
        Button btnClickSKIP = (Button)findViewById(R.id.skip);
        Intent intent = new Intent(MainActivity.this,StartActivity.class);
        startActivity(intent);
}
}
