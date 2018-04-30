package com.example.android.quakereport;

import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * Created by Abhinav on 4/25/18.
 */
public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    String primaryLocation;
    String locationOffset;

    //String originalLocation = currentEarthquake.getLocation();

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    public double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){

        return mLocation;
    }
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }


    long timeInMilliseconds = 1454124312220L;
    Date dateObject = new Date(timeInMilliseconds);

    SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
    String dateToDisplay = dateFormatter.format(dateObject);

}

