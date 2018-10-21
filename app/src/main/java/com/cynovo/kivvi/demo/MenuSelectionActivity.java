package com.cynovo.kivvi.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cynovo.kivvi.demo.ui.MainActivity;

public class MenuSelectionActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_selection);

        Button readCard = (Button) findViewById(R.id.readCard);
        Button swipeCard = (Button) findViewById(R.id.swipeCard);
        Button enterPin = (Button) findViewById(R.id.enterPin);
        Button print = (Button) findViewById(R.id.print);
        Button qrCode = (Button) findViewById(R.id.qrCode);

        readCard.setOnClickListener(this);
        swipeCard.setOnClickListener(this);
        enterPin.setOnClickListener(this);
        print.setOnClickListener(this);
        qrCode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(
                MenuSelectionActivity.this,
                MainActivity.class);
        switch (v.getId())
        {
            case R.id.readCard :
                i.putExtra("type","readCard");
                break;
            case R.id.swipeCard:
                i.putExtra("type","swipeCard");
                break;
            case R.id.enterPin:
                i.putExtra("type","enterPin");
                break;
            case R.id.print:
                i.putExtra("type","print");
                break;
            case R.id.qrCode:
                i.putExtra("type","qrCode");
                break;
        }
        startActivity(i);
    }
}
