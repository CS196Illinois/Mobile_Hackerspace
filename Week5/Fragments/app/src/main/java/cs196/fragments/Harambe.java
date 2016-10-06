package cs196.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tommypacker for HackIllinois' 2016 Clue Hunt
 */

public class Harambe extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_main, parent, false);

        return view;
    }
}
