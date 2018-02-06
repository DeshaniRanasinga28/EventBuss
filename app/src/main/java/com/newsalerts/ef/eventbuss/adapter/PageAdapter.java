package com.newsalerts.ef.eventbuss.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EF on 06-Feb-18.
 */

public class PageAdapter extends FragmentPagerAdapter {
    private final List<Fragment> tabList = new ArrayList<>();
    private final List<String> tabTitle = new ArrayList<>();


    public PageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return tabList.get(position);
    }

    @Override
    public int getCount() {
        return tabList.size();
    }

    public void addFragment(Fragment fragment, String title){
        tabList.add(fragment);
        tabTitle.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitle.get(position);
    }
}
