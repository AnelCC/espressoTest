package com.example.ctsuser1.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by Anel on 3/23/18.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void onCreate() throws Exception {
    }


    @Test
    public void shouldCheckIsEquals() throws Exception{
        assertEquals(2,1+1);
    }
    @Test
    public void shouldCheckIsNotEquals() throws Exception{
        assertNotEquals(1,2);
    }

    @Test
    public void shouldHaveATextvieWithTextHelloWord() throws Exception{
        onView(withId(R.id.tv_hello)).check(matches(withText("Hello World!")));
    }
    @Test
    public void shouldChangeTextHelloWordToWelcome() throws Exception{
        onView(withId(R.id.btn_change)).perform(click());
        onView(withId(R.id.tv_hello)).check(matches(withText("Welcome")));
    }

    @Test
    public void shouldDisplayNewTextTyped() throws Exception{
        onView(withId(R.id.et_type)).perform(typeText("Hello Anel"));
        onView(withId(R.id.btn_save)).perform(click());
        onView(withId(R.id.tv_hello)).check(matches(withText("Hello Anel")));
    }
    @Test
    public void shouldDisplayHelloWorldTextIfTypedEmpty() throws Exception{
        onView(withId(R.id.et_type)).perform(typeText(""));
        onView(withId(R.id.btn_save)).perform(click());
        onView(withId(R.id.tv_hello)).check(matches(withText("Hello World!")));
    }
}