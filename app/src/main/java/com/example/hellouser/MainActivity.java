package com.example.hellouser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEditText;
    TextView MessageTextView;
    public void displayMessage(View view){
        MessageTextView.setText("Hello " + UsernameEditText.getText());}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameEditText = findViewById(R.id.usernameEditText);
        MessageTextView = findViewById(R.id.usernameEditText);
    }
}