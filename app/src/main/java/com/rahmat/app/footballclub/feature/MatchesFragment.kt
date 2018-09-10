package com.rahmat.app.footballclub.feature


import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rahmat.app.footballclub.R
import com.rahmat.app.footballclub.adapter.ViewPagerAdapter
import com.rahmat.app.footballclub.feature.lastmatch.LastMatchFragment
import com.rahmat.app.footballclub.feature.upcomingmatch.UpcomingMatchFragment

class MatchesFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_matches, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vPager = view.findViewById<ViewPager>(R.id.viewpager)
        val tabs = view.findViewById<TabLayout>(R.id.tabs)
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.populateFragment(LastMatchFragment(), "Last")
        adapter.populateFragment(UpcomingMatchFragment(), "Upcoming")
        vPager.adapter = adapter
        tabs.setupWithViewPager(vPager)
    }
}
