package com.cs407.shopnonstoptylersexample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class signupPage extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEmail;
    private Button buttonSignUpFinal;
    private Button buttonSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSignUpFinal = findViewById(R.id.buttonSignUpFinal);
        buttonSignUp = findViewById(R.id.buttonSignUpFinal);



        buttonSignUpFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                Intent intent = new Intent(signupPage.this, settingsPage.class);
                intent.putExtra("text", text);
                intent.putExtra("email", email);
                startActivity(intent);

                Intent thirdIntent = new Intent(signupPage.this, settingsPage.class);
                startActivity(thirdIntent);
            }
        });


    }




}
