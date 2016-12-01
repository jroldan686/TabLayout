package jrl.deint.tablayout.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

import jrl.deint.tablayout.CustomFragment;
import jrl.deint.tablayout.R;

import static android.R.attr.fragment;

/**
 * Created by usuario on 30/11/16.
 */

public class AdapterViewPager extends FragmentStatePagerAdapter {

    private int tabCount;
    private Context context;

    public AdapterViewPager(FragmentManager fm, int tabCount, Context cntxt) {
        super(fm);
        this.tabCount=tabCount;
        this.context = cntxt;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);
        String[] titles = context.getResources().getStringArray(R.array.tabs);
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {
        CustomFragment fragment = null;
        Bundle arguments = new Bundle();

        switch (position) {
            case 0:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 1");
                fragment= (CustomFragment) CustomFragment.newInstance(arguments);

                break;
            case 1:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 2");
                fragment= (CustomFragment) CustomFragment.newInstance(arguments);

                break;
            case 2:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 3");
                fragment= (CustomFragment) CustomFragment.newInstance(arguments);

                break;
            case 3:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 4");
                fragment= (CustomFragment) CustomFragment.newInstance(arguments);

                break;
            case 4:
                arguments.putString(CustomFragment.KEY_REG_TEXT, "Tab 5");
                fragment= (CustomFragment) CustomFragment.newInstance(arguments);

                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
