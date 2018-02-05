package com.example.android.miwok;

/**
 * Created by hp on 2/4/2018.
 */

public class Words {

    //Create a variable for the miwak translation
    private  String mMiwokTranslation;
    //Create a variable for the default translation
    private  String mDefaultTranslation;

    //default constructor
    public Words (String defaultTranslation, String miwokTranslation){
        mMiwokTranslation = miwokTranslation;

        mDefaultTranslation = defaultTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;

    }

    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }
}
