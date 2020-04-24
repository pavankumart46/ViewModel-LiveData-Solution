package youtube.com.vidhvan.databinding_viewmodel_livedata_starter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import youtube.com.vidhvan.databinding_viewmodel_livedata_starter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                binding.score.setText(String.valueOf(score));
            }
        });

        binding.minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score--;
                binding.score.setText(String.valueOf(score));
            }
        });
    }
}
