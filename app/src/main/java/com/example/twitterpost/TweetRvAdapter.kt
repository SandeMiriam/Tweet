package com.example.twitterpost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var twitterList:List<Twitter>):
    RecyclerView.Adapter<TwitterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return TwitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter = twitterList.get(position)
        holder.tvName.text= currentTwitter.Name
        holder.tvhandle.text= currentTwitter.handle
        holder.tvtweet.text= currentTwitter.tweet

    }

    override fun getItemCount(): Int {
        return twitterList.size

    }
}


class TwitterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvhandle = itemView.findViewById<TextView>(R.id.tvhandle)
    var tvtweet= itemView.findViewById<TextView>(R.id.tvtweet)
    var imgRetweet= itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgProfile= itemView.findViewById<ImageView>(R.id.imgProfile)
    var imglike= itemView.findViewById<ImageView>(R.id.imglike)
    var imgComment= itemView.findViewById<ImageView>(R.id.imgComment)
    var imgShare= itemView.findViewById<ImageView>(R.id.imglike)
}
