package com.jamescoughlin.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMoviesButtonClicked(View view) {
        buttonClickedMessage(view, getString(R.string.popularMovies));
    }

    public void stockHawkButtonClicked(View view) {
        buttonClickedMessage(view, getString(R.string.stockHawk));
    }

    public void buildItBiggerButtonClicked(View view) {
        buttonClickedMessage(view, getString(R.string.buildItBigger));
    }

    public void makeYourAppMaterialButtonClicked(View view) {
        buttonClickedMessage(view, getString(R.string.makeYourAppMaterial));
    }

    public void goUbiquitousButtonClicked(View view) {
        buttonClickedMessage(view, getString(R.string.goUbiquitous));
    }

    public void captoneButtonClicked(View view) {
        buttonClickedMessage(view, getString(R.string.capstone));
    }

    private void buttonClickedMessage(View view, CharSequence appName) {
        CharSequence message = TextUtils.expandTemplate("This button will launch my ^1 app!", appName);
        Toast toast = Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
