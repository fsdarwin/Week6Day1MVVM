package com.example.week6day1mvvm.view.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.week6day1mvvm.R;
import com.example.week6day1mvvm.databinding.ActivityMainBinding;
import com.example.week6day1mvvm.model.User;
import com.example.week6day1mvvm.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserViewModel viewModel = ViewModelProviders.of(this).get(UserViewModel.class);
        //activityMainBinding.setViewModel(new CarViewModel(this.getApplication()));
        //activityMainBinding.setUser(new User());
        activityMainBinding.executePendingBindings();
        activityMainBinding.setViewModel(viewModel);
    }
}
