package com.example.basketballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mAPointsTV, mBPointsTV;
    Button mA3PointsBtn, mA2PointsBtn, mAFTBtn, mB3PointsBtn, mB2PointsBtn, mBFTBtn, mResetBtn;

    int APoints = 0;
    int BPoints = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mA3PointsBtn = findViewById(R.id.A3PointsBtn);
        mA2PointsBtn = findViewById(R.id.A2PointsBtn);
        mAFTBtn = findViewById(R.id.AFTBtn);
        mB3PointsBtn = findViewById(R.id.B3PointsBtn);
        mB2PointsBtn = findViewById(R.id.B2PointsBtn);
        mBFTBtn = findViewById(R.id.BFTBtn);
        mAPointsTV = findViewById(R.id.APointsTV);
        mBPointsTV = findViewById(R.id.BPointsTV);
        mResetBtn = findViewById(R.id.resetBtn);

        mA3PointsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APoints += 3;
                mAPointsTV.setText(String.valueOf(APoints));

            }
        });

        mA2PointsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APoints += 2;
                mAPointsTV.setText(String.valueOf(APoints));
            }
        });

        mAFTBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APoints += 1;
                mAPointsTV.setText(String.valueOf(APoints));
            }
        });

        mB3PointsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BPoints += 3;
                mBPointsTV.setText(String.valueOf(BPoints));
            }
        });

        mB2PointsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BPoints += 2;
                mBPointsTV.setText(String.valueOf(BPoints));
            }
        });

        mBFTBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BPoints += 1;
                mBPointsTV.setText(String.valueOf(BPoints));
            }
        });

        mResetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APoints = 0;
                BPoints = 0;
                mAPointsTV.setText(String.valueOf(APoints));
                mBPointsTV.setText(String.valueOf(BPoints));
            }
        });

    }

}
