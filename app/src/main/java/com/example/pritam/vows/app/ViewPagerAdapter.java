package com.example.pritam.vows.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Pritam on 8/26/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mnumbOfTabs) {
        super(fm);
        this.Titles = mTitles;
        this.NumbOfTabs = mnumbOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            EnglishTab englishTab = new EnglishTab();
            return englishTab;
        } else if (position == 1) {
            HindiTab hindiTab = new HindiTab();
            return hindiTab;
        } else {
            MarathiTab marathiTab = new MarathiTab();
            return marathiTab;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}

