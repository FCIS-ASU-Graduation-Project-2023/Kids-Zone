package com.example.floatingwindow;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
//    Button buttonAddWidget;
    Button freezeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        freezeButton = (Button) findViewById(R.id.freeze_button);
        freezeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFreezeTimerActivity();
            }
        });
//        buttonAddWidget = (Button) findViewById(R.id.button_widget);
//        getPermission();
//
//        buttonAddWidget.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(!Settings.canDrawOverlays(MainActivity.this))
//                {
//                    getPermission();
//                }
//                else
//                {
//                    Intent intent = new Intent(MainActivity.this, WidgetService.class);
//                    startService(intent);
//                    finish();
//                }
//            }
//        });
    }
    public void openFreezeTimerActivity()
    {
        Intent intent = new Intent(this, FreezeTimerActivity.class);
        startActivity(intent);
    }
    public void getPermission()
    {
        //check for alert window permission
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(this))
        {
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:"+getPackageName()));
            startActivityForResult(intent, 1);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1)
        {
            if(!Settings.canDrawOverlays(MainActivity.this))
            {
                Toast.makeText(this, "Permission denied by user.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}