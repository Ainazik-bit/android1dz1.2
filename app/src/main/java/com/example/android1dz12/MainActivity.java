package com.example.android1dz12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout textInputLayout;
    private TextInputLayout textInputLayout2;
    private TextInputLayout textInputLayout3;
    private ImageView imageView;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textInputLayout = findViewById(R.id.FIO);
        textInputLayout2 = findViewById(R.id.email);
        textInputLayout3 = findViewById(R.id.password);
        imageView = findViewById(R.id.iconn);
        button = findViewById(R.id.voitii);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textInputLayout2 != null && textInputLayout3.getEditText().length() > 5) {
                    Log.d("TAG", "onClick: "+textInputLayout3.getEditText().length());
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильный логин или пароль", Toast.LENGTH_SHORT).show();
                }
                if(textInputLayout2 != null && textInputLayout3.getEditText().length() > 5) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                } else {
                    ;
                }
            }
        });

    }
}