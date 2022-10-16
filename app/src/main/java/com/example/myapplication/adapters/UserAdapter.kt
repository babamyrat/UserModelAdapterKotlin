package com.example.myapplication.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.models.UserModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.user_item.view.*
import java.security.AccessController.getContext


class UserAdapter: RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    private var userList = emptyList<UserModel>()
    lateinit var context: Context

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<UserModel>) {
        userList = list
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemTitle.textView.text = userList[position].name
        holder.itemNum.textView2.text = userList[position].age
         // holder.itemImage.setImageResource(userList[position].image)             //image to id
        // Picasso.get().load(userList[position].image).into(holder.itemImage);     //image to url type Glide

        Glide.with(holder.itemView)
            .load(userList[position].image)
            .into(holder.itemImage);


    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemNum: TextView

        init {
            itemImage = itemView.findViewById(R.id.imageView)
            itemTitle = itemView.findViewById(R.id.textView)
            itemNum = itemView.findViewById(R.id.textView2)
        }


    }

}