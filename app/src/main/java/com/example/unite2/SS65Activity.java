package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SS65Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss65);
    }

    public void tamam(View view) {
        Toast.makeText(this, "onayla", Toast.LENGTH_LONG).show();
    }
}