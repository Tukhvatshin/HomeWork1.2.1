package com.example.homework121;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity<success_subscription> extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private EditText editText2;
    private TextView result;

    private void setResult(String string) {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        result = findViewById(R.id.result);



        init();
    }


    private void init() {
        button = findViewById(R.id.button_ok);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                result.setText(getString(R.string.success_subscription, editText2.getText(), editText.getText()));
            }
        });
        textView = findViewById(R.id.textView);
        textView.setText(R.string.success_subscription);
    }
}
