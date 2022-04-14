package com.example.hike;


import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class HomePage extends GenericBase {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    public HomePageOR obj = new HomePageOR();

    @Test
    public void clickButton() {
        System.out.println("clickButton");
        click(obj.buttonShowText,"Clicked on Show Text");
        waitSec(3);
        ElementIsDisplayed(obj.textviewHike);
    }
}