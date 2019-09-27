package com.example.h1101171015_tugastoastactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 15;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.Hallozella);
    }

    public void CountDown(View view) {
        mCount--;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void CountUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void HalloZellat(View view) {
        Toast toast = Toast.makeText(this, R.string.Hallozella_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
