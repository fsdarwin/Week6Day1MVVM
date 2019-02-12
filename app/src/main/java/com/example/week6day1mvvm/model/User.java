package com.example.week6day1mvvm.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    public String userName;
    public String favBook;
    public String favMovie;

    public User() {
    }

    public User(String userName, String favBook, String favMovie) {
        this.userName = userName;
        this.favBook = favBook;
        this.favMovie = favMovie;
    }

    protected User(Parcel in) {
        userName = in.readString();
        favBook = in.readString();
        favMovie = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFavBook() {
        return favBook;
    }

    public void setFavBook(String favBook) {
        this.favBook = favBook;
    }

    public String getFavMovie() {
        return favMovie;
    }

    public void setFavMovie(String favMovie) {
        this.favMovie = favMovie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userName);
        dest.writeString(favBook);
        dest.writeString(favMovie);
    }
}
