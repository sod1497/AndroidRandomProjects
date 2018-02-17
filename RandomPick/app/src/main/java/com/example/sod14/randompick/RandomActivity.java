package com.example.sod14.randompick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sod14.randompick.Logic.ElementList;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {

    private ElementList<String> elementList;
    private Random random;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        textView = findViewById(R.id.tvRandom);
        newRandom();
    }

    public RandomActivity(ElementList<String> elementList) {
        this.elementList = elementList;
        random = new Random();
    }

    public void RandomClick(View v)
    {
        newRandom();
    }

    private void newRandom()
    {
        textView.setText((String) elementList.getElements().get(random.nextInt(elementList.getElements().size())));
    }
}
