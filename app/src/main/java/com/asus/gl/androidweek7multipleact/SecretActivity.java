package com.asus.gl.androidweek7multipleact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecretActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);
    }

    public void secretClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = findViewById(R.id.txtSecret);
        intent.putExtra("SECRET", editText.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
