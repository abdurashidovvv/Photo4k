package com.abdurashidov.photo4k.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.abdurashidov.photo4k.R
import com.abdurashidov.photo4k.databinding.RvItemBinding
import com.abdurashidov.photo4k.models.ItemRv

class RvAdapter(val list:ArrayList<ItemRv>, val rvClick: RvClick): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val rvItem:RvItemBinding): RecyclerView.ViewHolder(rvItem.root){
        fun onBind(itemRv: ItemRv){

            val animation = AnimationUtils.loadAnimation(rvItem.root.context, R.anim.my_rv_anim)
            rvItem.root.startAnimation(animation)

            rvItem.image.setImageResource(itemRv.img)
            rvItem.image.setOnClickListener {
                rvClick.onClick(itemRv)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface RvClick{
        fun onClick(itemRv: ItemRv)
    }
}