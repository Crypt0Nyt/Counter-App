package com.example.myecom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myecom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private int qty = 0;
    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show();

        setupEventHandlers();
    }

    private void setupEventHandlers() {
        b.decBtn.setOnClickListener(v -> decqty());
        b.incBtn.setOnClickListener(v -> incQty());
    }


    public void decqty() {
        b.qty.setText(" " + --qty);

    }

    public void incQty() {
        b.qty.setText(" " + ++qty);
    }
}