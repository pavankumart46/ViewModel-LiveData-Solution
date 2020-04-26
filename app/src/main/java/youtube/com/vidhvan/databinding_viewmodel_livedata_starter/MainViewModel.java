package youtube.com.vidhvan.databinding_viewmodel_livedata_starter;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel
{

    int score = 0;

    public MainViewModel()
    {
        Log.i("MainViewModel","ViewModel Created!");
    }

    public void increment(){
        score++;
    }

    public void decrement(){
        score--;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("MainViewModel","ViewModel is Destroyed!");
    }

}
