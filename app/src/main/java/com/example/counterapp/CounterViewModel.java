package com.example.counterapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    private final MutableLiveData<Integer> _counter = new MutableLiveData<>(0);
    public LiveData<Integer> counter = _counter;

    public void increment() {
        _counter.setValue(_counter.getValue() + 1);
    }

    public void reset() {
        _counter.setValue(0);
    }
}
