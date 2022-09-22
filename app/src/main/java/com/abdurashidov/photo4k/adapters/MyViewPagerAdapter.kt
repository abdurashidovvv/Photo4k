package com.abdurashidov.photo4k.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.abdurashidov.photo4k.fragments.ViewpagerItemFragment
import com.abdurashidov.photo4k.models.PagerItem

class MyViewPagerAdapter(fm: FragmentManager, val list:ArrayList<PagerItem>): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return ViewpagerItemFragment.newInstance(list[position].type)
    }
}