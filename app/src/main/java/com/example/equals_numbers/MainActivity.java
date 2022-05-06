package com.example.equals_numbers;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer arg_1;
    private Integer arg_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final EditText editText_1 = findViewById(R.id.editText_1);
        final EditText editText_2 = findViewById(R.id.editText_2);
        final TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg_1 = Integer.valueOf(editText_1.getText().toString());
                arg_2 = Integer.valueOf(editText_2.getText().toString());

                if (arg_1.equals(arg_2)){
                    textView.setText("Равно!");
                }else {
                    textView.setText("Не равно!");
                }
            }
        });

    }
}