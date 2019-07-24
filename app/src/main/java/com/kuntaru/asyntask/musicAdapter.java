package com.kuntaru.asyntask;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 8/17/2018.
 */

public class musicAdapter extends ArrayAdapter<Music> {

    public musicAdapter(Activity context, ArrayList<Music> musics) {
        super(context, 0, musics);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        Music currentMusic = getItem(position);
        TextView musicTextView = (TextView) listItemView.findViewById(R.id.music_text_view);
        musicTextView.setText(currentMusic.getArtist());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentMusic.getMusicAlbum());
        return listItemView;
    }
}

