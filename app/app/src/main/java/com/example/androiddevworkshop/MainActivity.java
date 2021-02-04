package com.example.androiddevworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
//        TextView helloTextView = findViewById(R.id.text_hello_world);
//        EditText helloEditText = findViewById(R.id.edit_hello_message);
//        String helloMessageInput = helloEditText.getText().toString();
//        helloTextView.setText(helloMessageInput);
    }

}
