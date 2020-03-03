package com.carmel.guestjini;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.carmel.guestjini.Community.CommunityLandingFragment;

public class CommunityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
//        InterestGroupsFragment interestGroupsFragment=new InterestGroupsFragment();
        CommunityLandingFragment communityLandingFragment=new CommunityLandingFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.CommunityPlaceHolder,communityLandingFragment);
        fragmentTransaction.commit();
    }
}
