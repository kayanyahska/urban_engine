package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myPasswordField = (EditText) findViewById(R.id.myPasswordField);

        Log.i("Username",myTextField.getText().toString());
        Log.i("Password",myPasswordField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
