package com.example.week6day1mvvm;

import com.example.week6day1mvvm.model.User;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void getSetCorrect(){
        User user = new User("Bob", "It", "fame");
        assertEquals("Bob", user.getUserName());
        assertEquals("It", user.getFavBook());
        assertEquals("Fame", user.getFavMovie());
    }
}