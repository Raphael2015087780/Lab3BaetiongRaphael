package com.baetiong.lab3baetiongraphael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2,input3,input4,input5,input6,input7,input8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        input6 = findViewById(R.id.input6);
        input7 = findViewById(R.id.input7);
        input8 = findViewById(R.id.input8);
    }

    public void writeData(View view) {
        String data1 = input1.getText().toString();
        String data2 = input2.getText().toString();
        String data3 = input3.getText().toString();
        String data4 = input4.getText().toString();
        String data5 = input5.getText().toString();
        String data6 = input6.getText().toString();
        String data7 = input7.getText().toString();
        String data8 = input8.getText().toString();

        FileOutputStream writer = null;
        try {
            writer = openFileOutput("Subjects.txt", MODE_PRIVATE);
            try {
                writer.write(data1.getBytes());
                writer.write(data2.getBytes());
                writer.write(data3.getBytes());
                writer.write(data4.getBytes());
                writer.write(data5.getBytes());
                writer.write(data6.getBytes());
                writer.write(data7.getBytes());
                writer.write(data8.getBytes());
            } catch (IOException e) {
                Log.d("Error", "IO Error");
            }

        }catch (FileNotFoundException e) {
            Log.d("Error", "File not found...");
        }
        Toast.makeText(this, "Subjects were saved", Toast.LENGTH_LONG).show();
        }

        public void goNext(View view) {
            Intent i = new Intent(this, Main2Activity.class);
            startActivity(i);
        }



    }

