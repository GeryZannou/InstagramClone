package com.example.instagramclone;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseUser;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    private EditText etUsername;
    private EditText etPassword;
    private Button btnLoging;

    public String  TAG = "LogingActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etusername);
        etPassword = findViewById(R.id.etpassword);
        btnLoging = findViewById(R.id.btnlogin);

        btnLoging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"onClick loging btnCaptureImage");

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                logingUser(username,password);
            }
        });
    }

    private void logingUser(String username, String password) {
        Log.i(TAG,"Attempting to loging user " + username);

        // TODO navigate to the main activity if the user has signed in properly

        ParseUser.logInInBackground(username, password, (user, e) -> {
            if(e != null){

                //Better Error handling
                Log.e(TAG, "Issue with loging", e);
                Toast.makeText(LoginActivity.this, "Issue with loging", Toast.LENGTH_SHORT).show();
                return;
            }

            // TODO: navigate to the main activity if the user has signed in properly
            goMainActivity();
            Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_SHORT).show();

        });

    }

    private void goMainActivity() {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}