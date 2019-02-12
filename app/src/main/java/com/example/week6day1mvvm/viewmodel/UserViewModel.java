package com.example.week6day1mvvm.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

import com.example.week6day1mvvm.model.User;
import com.example.week6day1mvvm.view.activities.DisplayActivity;

public class UserViewModel extends AndroidViewModel {
    public static final String TAG = "FRANK: ";
    User user = new User();

    public void setUser(User user){
        this.user = user;
    }

    public UserViewModel(@NonNull Application application) {
        super(application);
    }

    public void afterNameTextChanged(CharSequence name) {
        user.setUserName(name.toString());
    }

    public void afterBookTextChanged(CharSequence book) {
        user.setFavBook(book.toString());
    }

    public void afterMovieTextChanged(CharSequence movie) {
        user.setFavMovie(movie.toString());
    }

    public void onUserClick(View view) {

        Intent intent = new Intent(view.getContext(), DisplayActivity.class);
        Log.d(TAG, "onUserClick: " + user.getUserName() + ", " + user.getFavBook() + ", " + user.getFavMovie());
        intent.putExtra("user", user);
        view.getContext().startActivity(intent);
    }
}
