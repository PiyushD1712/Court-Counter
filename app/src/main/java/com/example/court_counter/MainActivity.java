package com.example.court_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    TextView scoreOfA;
    TextView scoreOfB;
    Button resetAll;
    Button points3A;
    Button points2A;
    Button points1A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         scoreOfA = (TextView) findViewById(R.id.Ascore);
         scoreOfB = (TextView) findViewById(R.id.Bscore);
         resetAll = (Button) findViewById(R.id.reset);

         points3A = (Button) findViewById(R.id.A3points);
         points2A = (Button) findViewById(R.id.A2points);
         points1A = (Button) findViewById(R.id.A1points);


        points3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA=scoreA+3;
                scoreOfA.setText(String.valueOf(scoreA));
            }
        });
        points2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA=scoreA+2;
                scoreOfA.setText(String.valueOf(scoreA));
            }
        });
        points1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA=scoreA+1;
                scoreOfA.setText(String.valueOf(scoreA));
            }
        });

        Button points3B = (Button) findViewById(R.id.B3points);
        Button points2B = (Button) findViewById(R.id.B2points);
        Button points1B = (Button) findViewById(R.id.B1points);

        points3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB=scoreB+3;
                scoreOfB.setText(String.valueOf(scoreB));
            }
        });
        points2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB=scoreB+2;
                scoreOfB.setText(String.valueOf(scoreB));
            }
        });
        points1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB=scoreB+1;
                scoreOfB.setText(String.valueOf(scoreB));
            }
        });

        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA=0;
                scoreB=0;
                scoreOfA.setText(String.valueOf(scoreA));
                scoreOfB.setText(String.valueOf(scoreB));
            }
        });
    }

}