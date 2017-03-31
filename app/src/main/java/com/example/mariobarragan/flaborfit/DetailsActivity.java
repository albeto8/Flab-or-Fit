package com.example.mariobarragan.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseText = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = (ImageView)findViewById(R.id.excerciseIimage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);
        String excerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(excerciseTitle);

        if (excerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_WEIGHTS)) {
            exerciseImage.setImageDrawable(getDrawable(R.drawable.weight));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (excerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_CARDIO)) {
            mainBG.setBackgroundColor(Color.parseColor("#528d56"));
            exerciseImage.setImageDrawable(getDrawable(R.drawable.heart));
        } else {
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
            exerciseImage.setImageDrawable(getDrawable(R.drawable.lotus));
        }
    }
}
