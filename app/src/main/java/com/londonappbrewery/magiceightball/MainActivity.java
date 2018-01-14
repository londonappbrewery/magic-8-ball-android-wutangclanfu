package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        Button askButton =findViewById(R.id.askButton) ;
        final ImageView ballDisplay = findViewById(R.id.image_eightBall) ;

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("askMore"  , "It's work") ;
                Random numberGenerator = new Random() ;
                int number = numberGenerator.nextInt(5) ;
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
