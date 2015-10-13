package com.example.casey.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by casey on 9/28/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
