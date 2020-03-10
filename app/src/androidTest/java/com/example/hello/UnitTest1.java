package com.example.hello;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class UnitTest1 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule= new ActivityTestRule <MainActivity>(MainActivity.class);
    private MainActivity mActivity= null;
    @Before
    public void setUp() throws Exception {
        mActivity= mActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch()
    {
        assertNotNull(mActivity.findViewById(R.id.button));
        assertNotNull(mActivity.findViewById(R.id.button2));
        assertNotNull(mActivity.findViewById(R.id.button4));
        onView(withId(R.id.button)).perform(click());



    }



    @After
    public void tearDown() throws Exception {
        mActivity= null;
    }

}