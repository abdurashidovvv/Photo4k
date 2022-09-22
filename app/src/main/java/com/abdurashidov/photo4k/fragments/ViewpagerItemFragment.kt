package com.abdurashidov.photo4k.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.abdurashidov.photo4k.R
import com.abdurashidov.photo4k.adapters.RvAdapter
import com.abdurashidov.photo4k.databinding.FragmentViewpagerItemBinding
import com.abdurashidov.photo4k.models.ItemRv
import com.abdurashidov.photo4k.models.MyData

private const val ARG_PARAM1 = "param1"


class ViewpagerItemFragment : Fragment(), RvAdapter.RvClick {
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    private lateinit var binding: FragmentViewpagerItemBinding
    private lateinit var rvAdapter: RvAdapter
    private lateinit var list:ArrayList<ItemRv>
    private val TAG = "ViewpagerItemFragment"
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding= FragmentViewpagerItemBinding.inflate(layoutInflater)

        list= ArrayList()

        if (param1.toString()=="All"){
            Log.d(TAG, "onCreateView: ${MyData.allList}")
            list=MyData.allList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecycleview.adapter=rvAdapter
        }
        if (param1.toString()=="Technology"){
            Log.d(TAG, "onCreateView: ${MyData.allList}")
            list=MyData.techList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecycleview.adapter=rvAdapter
        }
        if (param1.toString()=="Animals"){
            Log.d(TAG, "onCreateView: ${MyData.allList}")
            list=MyData.animalList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecycleview.adapter=rvAdapter
        }
        if (param1.toString()=="Gradient"){
            Log.d(TAG, "onCreateView: ${MyData.allList}")
            list=MyData.gradientList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecycleview.adapter=rvAdapter
        }
        if (param1.toString()=="Nature"){
            Log.d(TAG, "onCreateView: ${MyData.allList}")
            list=MyData.natureList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecycleview.adapter=rvAdapter
        }
        if (param1.toString()=="Black"){
            Log.d(TAG, "onCreateView: ${MyData.allList}")
            list=MyData.blackList
            list.shuffle()
            rvAdapter= RvAdapter(list, this)
            binding.myRecycleview.adapter=rvAdapter
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            ViewpagerItemFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }


    override fun onClick(itemRv: ItemRv) {
        findNavController().navigate(R.id.clickableFragment, bundleOf("key" to itemRv))
    }
}