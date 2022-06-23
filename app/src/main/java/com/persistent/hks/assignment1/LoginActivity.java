package com.persistent.hks.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText editTextUsername;
    private EditText editTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = (Button)findViewById(R.id.button_login);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        if(editTextUsername.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usernameText = editTextUsername.getText().toString();
                String passwordText = editTextPassword.getText().toString();
                if(usernameText == "" || passwordText == "") {
                    Toast.makeText(getApplicationContext(),"Field can not be blank",Toast.LENGTH_LONG).show();
                }
                else if(usernameText.length() < 5) {
                    //Toast.makeText(getApplicationContext(), "Username too short", Toast.LENGTH_LONG).show();
                    editTextUsername.setError("Username too short");
                }
                else if(passwordText.length() < 5) {
                    //Toast.makeText(getApplicationContext(), "Password too short", Toast.LENGTH_LONG).show();
                    editTextPassword.setError("Password too short");
                }
                else
                {
                    Intent newIntent = new Intent(getApplicationContext(),MainActivity.class);
                    newIntent.putExtra("username",usernameText);
                    startActivity(newIntent);
                }

            }
        });
    }


}