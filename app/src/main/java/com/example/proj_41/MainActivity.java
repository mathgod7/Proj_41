package com.example.proj_41;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.support.annotation.RequiresApi;
import android.support.design.internal.NavigationMenu;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.SwitchCompat;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import io.github.yavski.fabspeeddial.FabSpeedDial;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SystemClock.sleep(100);
        FabSpeedDial fabSpeedDial = findViewById(R.id.fabSpeedDial);
        fabSpeedDial.setMenuListener(new FabSpeedDial.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                if(menuItem.getTitle().equals("Add Receipt")){
                    openCamera();
                }
                else if(menuItem.getTitle().equals("Info")){
                    openAbout();
                }
                else if(menuItem.getTitle().equals("Settings")){
                    openSettings();
                }
                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });

    }

    private void openAbout(){
        Intent intent1 = new Intent(this, AboutActivity.class);
        startActivity(intent1);
    }

    private void openCamera(){
        Intent intent2 = new Intent(this,CameraActivity.class);
        startActivity(intent2);
    }
    private void openSettings(){

    }
}
