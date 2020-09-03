package com.example.swipeapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.package_list.view.*

class PackageViewAdapter : RecyclerView.Adapter<PackageViewAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.package_list,parent,false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int){
        Glide.with(holder.itemView.context)
            .load(R.drawable.ic_launcher_background)
            .apply(RequestOptions().fitCenter().format(DecodeFormat.PREFER_ARGB_8888).override(Target.SIZE_ORIGINAL))
            .into(holder.view.image_view)
    }

    override fun getItemCount(): Int {
        return 4
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}