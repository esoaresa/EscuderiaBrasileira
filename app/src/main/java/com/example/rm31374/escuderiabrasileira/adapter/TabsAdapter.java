package com.example.rm31374.escuderiabrasileira.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.rm31374.escuderiabrasileira.fragments.TimesFragment;

/**
 * Created by rm31374 on 28/11/2016.
 */
public class TabsAdapter extends FragmentStatePagerAdapter {

    public static final int TOTAL_TABS = 2;

    public TabsAdapter(FragmentManager fm){
        super(fm);
    }

    //Nesse método definimos qual fragment deverá ser exibido no ViewPager
    @Override
    public Fragment getItem(int position) {

        Bundle args = new Bundle();


        if (position ==  0 ){
            args.putString( "tipo" , "57c49ba10f00007111b50c00");

        } else if (position ==  1 ) {
            args.putString( "tipo" , "57c49ba10f00007111b50c00");

        }

        Fragment f = new TimesFragment();
        f.setArguments(args);

        return f;
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }
}
