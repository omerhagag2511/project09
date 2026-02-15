package com.example.project07;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int num = 0;
    EditText et1;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        text = (TextView) findViewById(R.id.button);
    }
    public void go(View view) {
        num = Integer.parseInt(et1.getText().toString());
        if (num <= 6) {
            text.setText("number "+num);
        }
        else {
            if (num % 7 == 0) {
                text.setText("BOOM!");
            } else if (num % 10 == 7) {
                text.setText("BOOM!");
            } else if ((num > 69) && (num < 80)) {
                text.setText("BOOM!");
            } else {
                text.setText("number " + num);
            }
        }
    }
}
