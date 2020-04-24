package youtube.com.vidhvan.databinding_viewmodel_livedata_starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mPlusBtn,mMinusBtn;
    private TextView mScoreTv;

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connecting the objects to Views using findViewById()
        mPlusBtn = findViewById(R.id.plus_btn);
        mMinusBtn = findViewById(R.id.minus_btn);
        mScoreTv = findViewById(R.id.score);

        // Handling Button Clicks
        //Plus Button Click
        mPlusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Incrementing the score by 1 & Updating it on the TextView
                score++;
                mScoreTv.setText(String.valueOf(score));
            }
        });

        //Minus Button Click
        mMinusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Decrementing the score by 1 & Updating it on the TextView
                score--;
                mScoreTv.setText(String.valueOf(score));
            }
        });
    }
}
