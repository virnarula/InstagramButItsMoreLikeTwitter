package com.virnarula.twittergram;

import androidx.appcompat.app.AppCompatActivity;
import com.parse.Parse;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseUser;
import com.virnarula.twittergram.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("APPLICATION_ID")
                .server("http://10.0.2.2:1337/parse/")
                .build()
        );

        ParseUser user = new ParseUser();
        user.setUsername("virsvirus");
        user.setPassword("hello");
        user.signUpInBackground();
*/
        Intent intent = new Intent(this, home.class);
        startActivity(intent);

    }
}
