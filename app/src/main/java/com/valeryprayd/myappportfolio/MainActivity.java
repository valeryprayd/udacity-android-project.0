package com.valeryprayd.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Toast lastToast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        // Cancel previous toast if it exists.
        if (lastToast != null) {
            lastToast.cancel();
        }
        super.onDestroy();
    }

    private void showToast(String message) {
        // Cancel previous toast if it exists.
        if (lastToast != null) {
            lastToast.cancel();
        }
        // Create a new one and show it, then save as the last one.
        lastToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        lastToast.show();
    }

    /**
     * Launches Spotify Streamer.
     * @param view that initiated this call
     */
    public void launchSpotifyStreamer(View view) {
        showToast(getString(R.string.toast_spotify_streamer));
    }

    /**
     * Launches Scores App.
     * @param view that initiated this call
     */
    public void launchScoresApp(View view) {
        showToast(getString(R.string.toast_scores_app));
    }

    /**
     * Launches Library App.
     * @param view that initiated this call
     */
    public void launchLibraryApp(View view) {
        showToast(getString(R.string.toast_library_app));
    }

    /**
     * Launches Build It Bigger.
     * @param view that initiated this call
     */
    public void launchBuildItBigger(View view) {
        showToast(getString(R.string.toast_build_it_bigger));
    }

    /**
     * Launches XYZ Reader.
     * @param view that initiated this call
     */
    public void launchXyzReader(View view) {
        showToast(getString(R.string.toast_xyz_reader));
    }

    /**
     * Launches capstone project app.
     * @param view that initiated this call
     */
    public void launchCapstone(View view) {
        showToast(getString(R.string.toast_capstone_project));
    }
}
