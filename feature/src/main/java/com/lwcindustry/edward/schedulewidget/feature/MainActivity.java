package com.lwcindustry.edward.schedulewidget.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateLayout();
    }

    private void generateLayout(){
        CustomIdFinder finder = new CustomIdFinder();
        for (int i = 1; i<=3;i++){
            TextView text = findViewById(finder.getTimeId(i));
            text.setText("this loop works! ID = " + i);
            text = findViewById(finder.getSubId(i));
            text.setText("We have subject " + i);
            text = findViewById(finder.getCabId(i));
            text.setText("In cabinet" + i);
        }
    }
}