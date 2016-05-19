package com.example.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        button = (Button) view;
        String name = "This button will launch my "+ button.getText().toString() + " app!";
        Toast toast = Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG);
        toast.show();
    }
}
