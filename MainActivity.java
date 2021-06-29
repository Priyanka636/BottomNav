package com.example.bottomnav;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    //style code
   // <style name="AppTheme" parent="Theme.MaterialComponents">

    //dependency for battom navigation
    //implementation 'com.google.android.material:material:1.3.0'

    //dependency for cammera scanner
   // implementation 'me.dm7.barcodescanner:zxing:1.9.13'
   // implementation 'com.karumi:dexter:6.2.2'

    BottomNavigationView bottomNavigationView;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)


    FloatingActionButton floatingActionButton;
    public static TextView scanText;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton=(FloatingActionButton) findViewById(R.id.fab);

        scanText=(TextView) findViewById(R.id.scanTextId);

        bottomNavigationView=findViewById(R.id.bottom_nav);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);

    }

    public void ScanText(View view) {

        startActivity(new Intent(getApplicationContext(),scannerView.class));

    }
}
