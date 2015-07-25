package com.valeryprayd.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Launches Spotify Streamer.
     * @param view that initiated this call
     */
    public void launchSpotifyStreamer(View view) {
        Toast.makeText(this, "This button will launch Spotify Streamer!", Toast.LENGTH_SHORT).show();
    }

    /**
     * Launches Scores App.
     * @param view that initiated this call
     */
    public void launchScoresApp(View view) {
        Toast.makeText(this, "This button will launch Scores App!", Toast.LENGTH_SHORT).show();
    }

    /**
     * Launches Library App.
     * @param view that initiated this call
     */
    public void launchLibraryApp(View view) {
        Toast.makeText(this, "This button will launch Library App!", Toast.LENGTH_SHORT).show();
    }

    /**
     * Launches Build It Bigger.
     * @param view that initiated this call
     */
    public void launchBuildItBigger(View view) {
        Toast.makeText(this, "This button will launch Build It Bigger!", Toast.LENGTH_SHORT).show();
    }

    /**
     * Launches XYZ Reader.
     * @param view that initiated this call
     */
    public void launchXyzReader(View view) {
        Toast.makeText(this, "This button will launch XYZ Reader!", Toast.LENGTH_SHORT).show();
    }

    /**
     * Launches capstone project app.
     * @param view that initiated this call
     */
    public void launchCapstone(View view) {
        Toast.makeText(this, "This button will launch Capstone Project!", Toast.LENGTH_SHORT).show();
    }
}
