package com.virnarula.twittergram;

import androidx.appcompat.app.AppCompatActivity;
//import com.parse.Parse;
import android.content.Intent;
import android.os.Bundle;

import com.virnarula.twittergram.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}
