package com.example.hike;

import android.view.View;
import org.hamcrest.Matcher;

import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class HomePageOR {

    public Matcher<View> buttonShowText = withText("Show Text");
    public Matcher<View> textviewHike = withText("HIKE");

}
