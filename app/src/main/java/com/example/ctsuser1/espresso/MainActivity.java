package com.example.ctsuser1.espresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_hello);
        editText = findViewById(R.id.et_type);
    }

    public void changeText(View view) {
        textView.setText(getString(R.string.tv_welcome));
    }

    public void save(View view) {
        if (!editText.getText().toString().isEmpty()) {
            textView.setText(editText.getText().toString());
        }
    }
}
