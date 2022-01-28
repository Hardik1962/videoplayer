package com.example.demoapicall.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demoapicall.R
import com.example.demoapicall.model.MediaModel
import kotlinx.android.synthetic.main.item_row_list.view.*


class ItemRowHomeList(val itemList:ArrayList<MediaModel>,val context: Context): RecyclerView.Adapter<ItemRowHomeList.ItemRowViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemRowViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_list, parent, false)
        return ItemRowViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ItemRowViewHolder, position: Int) {
        val data = itemList[position]
        Glide.with(context).load(data.imgurl).into(holder.imgUser)
        Glide.with(context).load(data.firstimg).into(holder.imgFirst)
        holder.onBind()
        holder.tvname.text = data.name
        holder.tvdate.text = data.date
        holder.tvtext.text = data.text
        if ((position %2) == 0){
            holder.mediaUrl.visibility = View.VISIBLE
            holder.imgUser.visibility = View.GONE

        } else{
            holder.mediaUrl.visibility = View.GONE
            holder.imgUser.visibility = View.VISIBLE
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ItemRowViewHolder(view:View):RecyclerView.ViewHolder(view) {
        var parent = view

        val mediaUrl :FrameLayout = view.media_container
        val imgFirst :ImageView = view.img_first
        val imgUser :ImageView = view.userImg
        val tvname :TextView = view.name
        val tvdate :TextView = view.date
        val tvtext :TextView = view.tvText
        val progress :ProgressBar = view.progressBar


        fun onBind()
        {
            parent.tag = this
        }

    }

}