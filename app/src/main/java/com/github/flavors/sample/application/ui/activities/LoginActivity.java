package com.github.flavors.sample.application.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.flavors.sample.R;
import com.github.flavors.sample.domain.model.Greetings;

import java.io.PrintStream;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.makitoo.MakitooAndroid.init(this,
                "https://dashboard.makitoo.com/rest",
                "MY_APPLICATION_ID",  // Application ID
                "MY_TOKEN");                   // Application TOKEN

        setContentView(R.layout.activity_login);
    }

    public void login(View view) {

        String greetings = new Greetings().raw();

        bug(greetings);

        Toast.makeText(this, greetings, Toast.LENGTH_LONG).show();

    }

    PrintStream out;

    public void bug(String greetings) {
        out.println(greetings);
    }
}
