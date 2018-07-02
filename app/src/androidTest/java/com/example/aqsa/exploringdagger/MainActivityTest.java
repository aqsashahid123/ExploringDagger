package com.example.aqsa.exploringdagger;

import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
    mainActivity =mainActivityActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }

    @Test
    public void signUpRealtimeAccount() {
        String delta ="FAILURE";
        List<Double> locList = new ArrayList<>();
        locList.add(676.787);
        locList.add(676.787);
        RootUserModel user = new RootUserModel("123",
                "pasta@qwe.com", "demo456",
                "realtime", "fName", "lastName", "displayName",
                "03211942343", " ", "",locList , "+923211942343");

        String outPut = mainActivity.signUpRealtimeAccount(user);
        Log.e("output",outPut);
        assertEquals("sucess",outPut,delta);
    }
}