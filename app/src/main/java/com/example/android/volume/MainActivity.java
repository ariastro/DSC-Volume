package com.example.android.volume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputPanjang, inputTinggi, inputLebar;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLebar = (EditText) findViewById(R.id.input_lebar);
        inputPanjang = (EditText) findViewById(R.id.input_panjang);
        inputTinggi = (EditText) findViewById(R.id.input_tinggi);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = inputPanjang.getText().toString().trim();
                String lebar = inputLebar.getText().toString().trim();
                String tinggi = inputTinggi.getText().toString().trim();
                boolean kosong = false;
                if (panjang.equals("")){
                    inputPanjang.setError("Input ini tidak boleh kosong");
                }else if (tinggi.equals("")){
                    inputTinggi.setError("Input ini tidak boleh kosong");
                }else if (lebar.equals("")){
                    inputLebar.setError("Input ini tidak boleh kosong");
                }else {
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double t = Double.parseDouble(tinggi);
                    double volume = p * l * t;
                    hasil.setText(String.valueOf(volume));
                }
            }
        });
    }
}
