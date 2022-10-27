package com.example.medicinesubsitutes;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class context extends AppCompatActivity {

    private Button nextBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nextBtn2 = (Button) findViewById(R.id.button2);
        nextBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextpage2();
            }
        });

    }
    public void nextpage2()
    {
        Intent intent = new Intent(this, solutions.class);
        startActivity(intent);
    }
}
