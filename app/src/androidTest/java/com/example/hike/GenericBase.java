package com.example.hike;

import android.view.View;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.hamcrest.Matcher;
import org.junit.runner.RunWith;


import java.util.concurrent.TimeUnit;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

public class GenericBase {

    public void click(Matcher<View> element,String message){

        onView(element).perform(ViewActions.click());
        System.out.println(message);

    }

    public void waitSec(Integer seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }
        catch (Exception ignored){}
    }

    public void ElementIsDisplayed(Matcher<View> element){
        onView(element).check(matches(isDisplayed()));
    }

}
