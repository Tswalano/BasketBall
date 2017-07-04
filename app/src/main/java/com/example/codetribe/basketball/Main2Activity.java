package com.example.codetribe.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    MainActivity x = new MainActivity();
    static TextView scoreA;
    static  TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        scoreA = (TextView)findViewById(R.id.scoreHistoryA);
        scoreB = (TextView)findViewById(R.id.scoreHistoryB);

        scoreA.setText(Integer.toString(x.countH));
        scoreB.setText(Integer.toString(x.countA));
    }
}
