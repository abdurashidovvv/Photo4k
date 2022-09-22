package com.abdurashidov.photo4k.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.abdurashidov.photo4k.fragments.ViewpagerItemFragment
import com.abdurashidov.photo4k.models.PagerItem

class StateAdapters(val list:ArrayList<PagerItem>,fragment: Fragment)
    :FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return ViewpagerItemFragment.newInstance(list[position].type)
    }
}