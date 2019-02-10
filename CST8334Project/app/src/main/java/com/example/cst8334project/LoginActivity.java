package com.example.cst8334project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    protected static final String ACTIVITY_NAME = "LoginActivity";

    String username;
    String password;
    EditText edit_username;
    EditText edit_pass;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i(ACTIVITY_NAME,"In OnCreate()");

       edit_username = findViewById(R.id.edit_username) ;
       edit_pass = findViewById(R.id.edit_pass);
       button = findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View View){

                username=edit_username.getText().toString();
                password=edit_pass.getText().toString();
                Intent intent = new Intent(LoginActivity.this, VolunteerInfoActivity.class);
                startActivity(intent);

            }
        } );
    }

    protected void onStart() {
        super.onStart();
        Log.i(ACTIVITY_NAME,"In onStart()");
    }

    protected void onResume(){
        super.onResume();
        Log.i(ACTIVITY_NAME,"In onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.i(ACTIVITY_NAME,"In onPause()");
    }

    protected void onStop(){
        super.onStop();
        Log.i(ACTIVITY_NAME,"In onStop()");
    }

    protected void 	onDestroy(){
        super.onDestroy();
        Log.i(ACTIVITY_NAME,"In onDestroy()");
    }

}




