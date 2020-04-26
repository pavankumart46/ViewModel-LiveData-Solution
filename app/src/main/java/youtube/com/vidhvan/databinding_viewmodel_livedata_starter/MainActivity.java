package youtube.com.vidhvan.databinding_viewmodel_livedata_starter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import youtube.com.vidhvan.databinding_viewmodel_livedata_starter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.score.setText(String.valueOf(mainViewModel.score));

        binding.plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.increment();
                binding.score.setText(String.valueOf(mainViewModel.score));
            }
        });

        binding.minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.decrement();
                binding.score.setText(String.valueOf(mainViewModel.score));
            }
        });
    }
}
