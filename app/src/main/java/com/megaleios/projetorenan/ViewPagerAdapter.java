package com.megaleios.projetorenan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int numOfTbabs;
    private Fragmento tabA = null;
    private Fragmento tabB = null;
    private Fragmento tabC = null;
    private Fragmento tabD = null;

    public ViewPagerAdapter(FragmentManager fm, int NumOfTbabs) {
        super(fm);
        this.numOfTbabs = NumOfTbabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                if (tabA == null){
                    Log.i("C", "tabA");
                    tabA = new Fragmento();
                }else{
                    Log.i("X", "tabA");
                }
                return tabA;
            case 1:
                if (tabB == null){
                    tabB = new Fragmento();
                }
                return tabB;
            case 2:
                if (tabC == null){
                    tabC = new Fragmento();
                }
                return tabC;
            case 3:
                if (tabD == null){
                    tabD = new Fragmento();
                }
                return tabD;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTbabs;
    }

}