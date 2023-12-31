package com.cs407.shopnonstoptylersexample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class settingsPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingspage);

        TextView textViewSettings = findViewById(R.id.textViewSettings);
        TextView textViewSubtitle = findViewById(R.id.textViewSubtitle);
        ImageView imageViewUserImage = findViewById(R.id.imageViewUserImage);
        TextView textViewUserName = findViewById(R.id.textViewUserName);
        TextView textViewUserEmail = findViewById(R.id.textViewUserEmail);
        Button buttonSetLocation = findViewById(R.id.buttonSetLocation);
        Button buttonSetDistance = findViewById(R.id.buttonSetDistance);
        Button buttonLogout = findViewById(R.id.buttonLogout);



        String userName = getIntent().getStringExtra("text");
        String userEmail = getIntent().getStringExtra("email");

        if (userName != null && userEmail != null) {
            textViewUserName.setText(userName);
            textViewUserEmail.setText(userEmail);
        }

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(settingsPage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
