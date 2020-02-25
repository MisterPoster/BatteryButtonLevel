package com.example.batterybuttonlevel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    int batteryLevel = 7;
    ImageView battery = findViewById (R.id.batteryView);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chargePhone (View view)
    {
        if (batteryLevel == 7)
        {
            batteryLevel = 7;
        }
        else
        {
            batteryLevel++;
        }

        showCharge ();
    }

    public void usePhone (View view)
    {
        if (batteryLevel == 1)
        {
            batteryLevel = 1;
        }
        else
        {
            batteryLevel--;
        }

        showCharge ();
    }

    public void showCharge ()
    {
        switch (batteryLevel)
        {
            case 1:
                battery.setImageResource (R.drawable.ic_battery_20);
            case 2:
                battery.setImageResource (R.drawable.ic_battery_30);
            case 3:
                battery.setImageResource (R.drawable.ic_battery_50);
            case 4:
                battery.setImageResource (R.drawable.ic_battery_60);
            case 5:
                battery.setImageResource (R.drawable.ic_battery_80);
            case 6:
                battery.setImageResource (R.drawable.ic_battery_90);
            case 7:
                battery.setImageResource (R.drawable.ic_battery_100);
        }
    }
}   //END OF ACTIVITY
