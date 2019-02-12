package com.example.week6day1mvvm.view.activities;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.week6day1mvvm.R;
import com.example.week6day1mvvm.databinding.ActivityDisplayBinding;
import com.example.week6day1mvvm.model.User;
import com.example.week6day1mvvm.viewmodel.UserViewModel;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("user");

        ActivityDisplayBinding activityDisplayBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_display);
        activityDisplayBinding.setUser(user);
        UserViewModel viewModel = ViewModelProviders.of(this).get(UserViewModel.class);
        //activityMainBinding.setViewModel(new CarViewModel(this.getApplication()));
        //activityMainBinding.setUser(new User());
        activityDisplayBinding.executePendingBindings();
        activityDisplayBinding.setViewModel(viewModel);

    }
}
