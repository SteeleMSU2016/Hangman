package edu.msu.steele41.hangman;

/**
 * Created by Jason Steele on 11/18/2015.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int n = 0;
    Words guessWord;
    int hangImages[] = {R.drawable.hm0,R.drawable.hm1,R.drawable.hm2,R.drawable.hm3,R.drawable.hm4,R.drawable.hm5,R.drawable.hm6};
    Button btnNewGame;
    String[] setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewGame = (Button) findViewById(R.id.StartButton);
        btnNewGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.StartButton:
                TextView textElement = (TextView) findViewById(R.id.GuessText);
                textElement.setText(guessWord.word());

                ImageView img = (ImageView) findViewById(R.id.image);
                img.setImageResource(hangImages[0]);

                break;
        }


    }

}
