package com.example.ejemplo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView act_main_et_numero;
    private int numtoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act_main_et_numero = findViewById(R.id.act_main_tv_numero);

        Button act_main_bt_pulsame = findViewById(R.id.act_main_bt_pulsame);

        act_main_bt_pulsame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                act_main_et_numero.setText(String.valueOf(++numtoc));

            }
        });
    }
}
