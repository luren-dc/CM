package com.luren.music.ui.main;

import android.os.Bundle;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;

import com.luren.music.databinding.ActivityMainBinding;
import com.luren.music.ui.main.MainViewModel;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    private AppCompatEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel =
                new ViewModelProvider(this, new SavedStateViewModelFactory(getApplication(), this))
                        .get(MainViewModel.class);
        init();
    }

    protected void init() {
        setSupportActionBar(binding.activityMainToolbar);
        editText = binding.activityMainSearchEdittext;
        editText.setText(viewModel.getSearchText().getValue());
       
    }

    @Override
    protected void onStart() {
        super.onStart();
        initializeController();
    }

    private void initializeController() {
       
    }

    private void setController() {
       
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveState();
    }

    private void releaseController() {
       
    }

    private void saveState() {
        viewModel.updateSearchText(editText.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
        viewModel = null;
        releaseController();
    }
}
