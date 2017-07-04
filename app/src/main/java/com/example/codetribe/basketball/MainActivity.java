package com.example.codetribe.basketball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static int countH = 0;
    static int countA = 0;
    
    Button btnH1, btnH2, btnH3;
    Button btnA1, btnA2, btnA3, btnEnd;
    
    TextView score, scoreH, scoreA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnH1 = (Button)findViewById(R.id.btnH1);
        btnH2 = (Button)findViewById(R.id.btnH2);
        btnH3 = (Button)findViewById(R.id.btnH3);
        btnA1 = (Button)findViewById(R.id.btnA1);
        btnA2 = (Button)findViewById(R.id.btnA2);
        btnA3 = (Button)findViewById(R.id.btnA3);
        btnEnd = (Button)findViewById(R.id.btnEnd);

        score = (TextView) findViewById(R.id.score);
        scoreH = (TextView)findViewById(R.id.countH);
        scoreA = (TextView)findViewById(R.id.countA);

        btnH1.setOnClickListener(this);
        btnH2.setOnClickListener(this);
        btnH3.setOnClickListener(this);
        btnA1.setOnClickListener(this);
        btnA2.setOnClickListener(this);
        btnA3.setOnClickListener(this);
        btnEnd.setOnClickListener(this);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnH1:
                countH = countH+1;
                scoreH.setText(String.valueOf(countH));
                break;
            case R.id.btnH2:
                countH = countH+2;
                scoreH.setText(String.valueOf(countH));
                break;
            case R.id.btnH3:
                countH = countH+3;
                scoreH.setText(String.valueOf(countH));
                break;
            case R.id.btnA1:
                countA = countA+1;
                scoreA.setText(String.valueOf(countA));
                break;
            case R.id.btnA2:
                countA = countA+2;
                scoreA.setText(String.valueOf(countA));
                break;
            case R.id.btnA3:
                countA = countA+3;
                scoreA.setText(String.valueOf(countA));
                break;
            case R.id.btnEnd:
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
                break;
        }
    }
}
