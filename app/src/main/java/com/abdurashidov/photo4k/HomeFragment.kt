package com.abdurashidov.photo4k

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.abdurashidov.photo4k.adapters.StateAdapters
import com.abdurashidov.photo4k.databinding.FragmentClickableBinding
import com.abdurashidov.photo4k.databinding.FragmentHomeBinding
import com.abdurashidov.photo4k.databinding.FragmentViewpagerItemBinding
import com.abdurashidov.photo4k.databinding.TabItemViewBinding
import com.abdurashidov.photo4k.fragments.ClickableFragment
import com.abdurashidov.photo4k.models.MyData
import com.abdurashidov.photo4k.models.PagerItem
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {

    private val list=ArrayList<PagerItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        list.add(PagerItem("All"))
        list.add(PagerItem("Technology"))
        list.add(PagerItem("Animals"))
        list.add(PagerItem("Gradient"))
        list.add(PagerItem("Nature"))
        list.add(PagerItem("Black"))
    }

    private lateinit var binding: FragmentHomeBinding
//    private lateinit var myViewPagerAdapter: MyViewPagerAdapter
    private lateinit var stateAdapters: StateAdapters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding=FragmentHomeBinding.inflate(layoutInflater)

        //bottom heart button setOnClickListener
        binding.heart.setOnClickListener {
            findNavController().navigate(R.id.likeImageFragment)
        }

        //set viewpager adapter
        stateAdapters= StateAdapters(list, this)
        binding.myViewpager.adapter=stateAdapters

        binding.appBar.setOnClickListener {
            binding.drawer.open()
        }

        //set tablayout
        setTab()

        //Drawer layout item listener
        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->{
                    Toast.makeText(binding.root.context, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.popular->{
                    Toast.makeText(binding.root.context, "Popular", Toast.LENGTH_SHORT).show()
                }
                R.id.random->{
                    MyData.allList.shuffle()
                    MyData.animalList.shuffle()
                    MyData.natureList.shuffle()
                    MyData.likeList.shuffle()
                    MyData.gradientList.shuffle()
                    MyData.blackList.shuffle()
                    binding.drawer.close()
                }
                R.id.liked->{
                    findNavController().navigate(R.id.likeImageFragment)
                }
                R.id.history->{
                    Toast.makeText(binding.root.context, "History", Toast.LENGTH_SHORT).show()
                }
                R.id.about->{
                    Toast.makeText(binding.root.context, "About", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }

        TabLayoutMediator(binding.myTablayout,binding.myViewpager){tab,position->
            val tabItemView=TabItemViewBinding.inflate(layoutInflater)

            tabItemView.tabItemTv.text=list[position].type

            tabItemView.tabItemImg.visibility=View.GONE

            tab.customView = tabItemView.root
        }.attach()

        return binding.root
    }



    private fun setTab() {
//        val tabCount=binding.myTablayout.tabCount
//        for (i in 0 until tabCount){
//            val tabItemView=TabItemViewBinding.inflate(layoutInflater)
//            val tab=binding.myTablayout.getTabAt(i)
//            tab?.customView=tabItemView.root
//
//            tabItemView.tabItemTv.text=list[i].type
//
//            if (i==0){
//                tabItemView.tabItemTv.animate().alpha(1f).setDuration(0).start()
//                tabItemView.tabItemImg.visibility=View.VISIBLE
//            }else{
//                tabItemView.tabItemTv.animate().alpha(.5f).setDuration(0).start()
//                tabItemView.tabItemImg.visibility=View.GONE
//            }

            //tablayout item listener
            binding.myTablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    val customView=tab?.customView
                    customView?.findViewById<ImageView>(R.id.tab_item_img)?.visibility=View.VISIBLE
                    customView?.findViewById<TextView>(R.id.tab_item_tv)?.animate()?.alpha(1f)?.setDuration(300)?.start()
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    val customView=tab?.customView
                    customView?.findViewById<ImageView>(R.id.tab_item_img)?.visibility=View.GONE
                    customView?.findViewById<TextView>(R.id.tab_item_tv)?.animate()?.alpha(.5f)?.setDuration(300)?.start()
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }
            })

        }
    }