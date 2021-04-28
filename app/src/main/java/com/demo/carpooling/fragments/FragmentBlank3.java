package com.demo.carpooling.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.demo.carpooling.R;

public class FragmentBlank3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container,
                             @Nullable Bundle saveInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_blank3,container,false);

        return  rootView;

    }
}
