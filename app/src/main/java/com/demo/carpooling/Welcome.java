package com.demo.carpooling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.demo.carpooling.fragments.FragmentBlank1;
import com.demo.carpooling.fragments.FragmentBlank2;
import com.demo.carpooling.fragments.FragmentBlank3;

import java.util.ArrayList;
import java.util.List;

public class Welcome extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        List<Fragment> list = new ArrayList<>();

        list.add(new FragmentBlank1());
        list.add(new FragmentBlank2());
        list.add(new FragmentBlank3());

        pager = findViewById(R.id.pager);

        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);

        pager.setAdapter(pagerAdapter);
    }
}