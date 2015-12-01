package com.portfolio.course.esguti.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void run_spotifyStreamer(View view) {
        System.out.println("This button will launch Spotify Streamer app!");
        CharSequence text = "This button will launch Spotify Streamer app!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void run_scoresApp(View view) {
        System.out.println("This button will launch Football Scores app!");
        CharSequence text = "This button will launch Football Scores app!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void run_libraryApp(View view) {
        System.out.println("This button will launch Library app!");
        CharSequence text = "This button will launch Library app!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void run_buildItBigger(View view) {
        System.out.println("This button will launch Build It Bigger app!");
        CharSequence text = "This button will launch Build It Bigger app!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void run_xyzReader(View view) {
        System.out.println("This button will launch XYZ Reader app!");
        CharSequence text = "This button will launch XYZ Reader app!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void run_capstone(View view) {
        System.out.println("This button will launch my capstone app!");
        CharSequence text = "This button will launch my capstone app!";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
