package com.asus.gl.androidweek7multipleact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public static String UNAME = "USERNAME";

    private EditText userName, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName =findViewById(R.id.username);
        pass = findViewById(R.id.userpass);
    }

    public void loginClick(View view) {
        String uname= userName.getText().toString();
        String p = pass.getText().toString();

        if(uname.equals("admin") && p.equals("admin")){
            Intent intent = new Intent(this, MainActivity.class);
            //fill extra info
            intent.putExtra(UNAME, uname);

            startActivity(intent);
        }else{
            Toast.makeText(this,"Login not successful!!!",Toast.LENGTH_LONG).show();
        }

    }
}
