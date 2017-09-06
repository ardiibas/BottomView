package com.example.amikom.bottomview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by amikom on 06/09/2017.
 */

public class FragmentTiga extends Fragment {

    public static FragmentTiga newInstance(){
        return new FragmentTiga();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tiga, container, false);

        return view;
    }

    public interface OnFragmentInteractionListener{

    }
}
