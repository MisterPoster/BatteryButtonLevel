package com.example.batterybuttonlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    int batteryLevel = 4;
    ImageView battery;
    Button use;
    Button charge;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        battery = findViewById (R.id.batteryView);
        use = findViewById (R.id.useButton);
        charge = findViewById (R.id.chargeButton);
    }

    public void chargePhone (View view)
    {
        batteryLevel++;

        if (batteryLevel <= 6 && batteryLevel >= 0)
        {
            battery.setImageLevel (batteryLevel);
        }
        else if (batteryLevel > 6)
        {
            batteryLevel = 6;
        }
    }

    public void usePhone (View view)
    {
        batteryLevel--;

        if (batteryLevel > 0)
        {
            battery.setImageLevel (batteryLevel);
        }
        else if (batteryLevel < 0)
        {
            batteryLevel = 0;
        }
    }

}   //END OF ACTIVITY
