package com.abdurashidov.photo4k.fragments

import android.content.ContentResolver
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abdurashidov.photo4k.R
import com.abdurashidov.photo4k.databinding.FragmentClickableBinding
import com.abdurashidov.photo4k.models.ItemRv
import com.abdurashidov.photo4k.models.MyData

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ClickableFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    private lateinit var binding: FragmentClickableBinding
    private val TAG = "ClickableFragment"
    private var like=0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding=FragmentClickableBinding.inflate(layoutInflater)


        val item=arguments?.getSerializable("key") as ItemRv
        binding.image.setImageResource(item.img)

        MyData.likeList.forEach {
            if (item.equals(it)){
                binding.imgHeart.setImageResource(R.drawable.heart_red)
            }
        }

        //backstack
        binding.back.setOnClickListener {
            fragmentManager?.popBackStack()
        }


        //share
        binding.share.setOnClickListener {
        }
        
        //like
        binding.heart.setOnClickListener {
            if (MyData.likeList.contains(item)){
                MyData.likeList.remove(item)
                binding.imgHeart.setImageResource(R.drawable.heart_icon)
            }else{
                MyData.likeListData(item)
                binding.imgHeart.setImageResource(R.drawable.heart_red)
            }
            Log.d(TAG, "onCreateView: ${MyData.likeList}")
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ClickableFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}