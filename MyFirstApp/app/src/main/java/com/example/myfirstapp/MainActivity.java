package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        EditText editText = findViewById(R.Id.editText);

        System.out.println("Ejecutando sendMessage editText.getText().tostring()=
                + editText.getText().toString();
        String message = editText.getText().toString();
        Intent intent = new Intent(packageContext this, DisplayMessageActivity.class);
        intent.putExtra(name = "clave1", message);
        startActivity(intent);

    }

    }
}
