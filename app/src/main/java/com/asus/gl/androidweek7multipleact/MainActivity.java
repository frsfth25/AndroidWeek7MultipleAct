package com.asus.gl.androidweek7multipleact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int REQ_CODE = 1234;
    private TextView userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.txtName);
        Intent intent = getIntent();

        String extra = intent.getStringExtra(LoginActivity.UNAME);

        userName.setText("Welcome " + extra);


    }


    public void secret(View view) {
        Intent intent = new Intent(this,SecretActivity.class);
        startActivityForResult(intent, REQ_CODE);
    }

    protected void onActivityResult(int req_Code, int result_code, Intent intent){
        if(req_Code == REQ_CODE && result_code == RESULT_OK){
            String secretWord = intent.getStringExtra("SECRET");
            //Toast.makeText(this,"Cong. " + secretWord,Toast.LENGTH_SHORT).show();

            Uri uri = Uri.parse("tel:+905551234567");
            Intent intentForSecret = new Intent(Intent.ACTION_CALL, uri);
            startActivity(intentForSecret); // you can force user to give permission
        }
    }
}
