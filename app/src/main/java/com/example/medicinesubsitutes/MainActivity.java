package com.example.medicinesubsitutes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button nextBtn;
    private Button nextBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextBtn = (Button) findViewById(R.id.startButton);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextpage();
            }
        });

    }

    public void nextpage()
    {
        Intent intent = new Intent(this, context.class);
        startActivity(intent);
    }



    public void next(View v)
    {
        Log.i("click", "you clicked button next");
        Intent intent = new Intent(MainActivity.this, context.class);
        startActivity(intent);
        Toast.makeText(this, "you clicked next!", Toast.LENGTH_LONG).show();
    }




}