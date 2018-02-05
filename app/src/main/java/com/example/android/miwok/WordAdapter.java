package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 2/5/2018.
 */

public class WordAdapter extends ArrayAdapter<Words> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Words> words) {
        super(context,0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_numbers, parent, false);
        }
        //get the location of the object in the list
        Words currentWord = getItem(position);
        //find the text view with the id miwak_text id
        TextView miwakText = (TextView) listItemView.findViewById(R.id.miwak_text);
        //set the text on the miwak text view
        miwakText.setText(currentWord.getMiwokTranslation());

        //find the text view with the english_text id
        TextView englishText = (TextView) listItemView.findViewById(R.id.english_text);
        //set the text on the text view
        englishText.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
