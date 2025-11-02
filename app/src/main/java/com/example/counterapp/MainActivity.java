package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.counterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        CounterViewModel viewModel = new ViewModelProvider(this).get(CounterViewModel.class);

        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
    }
}
