package com.example.twitterpost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class TwitterRvAdapter(var twitterList:List<Twitter>):
        RecyclerView.Adapter<TwitterViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
            var itemView  = LayoutInflater.from(parent.context)
                .inflate(R.layout.twitter_item_list,parent,false)
            return TwitterViewHolder(itemView)

        }

        override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
            var currentTwitter =twitterList.get(position)
            holder.tvName.text = currentTwitter.Name
            holder.tvEmail.text = currentTwitter.Email
            holder.tvStatement.text= currentTwitter.Statement
        }

        override fun getItemCount(): Int {
            return twitterList.size
        }
    }


    class TwitterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvName = itemView.findViewById<TextView>(R.id.)
        var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
        var tvStatement= itemView.findViewById<TextView>(R.id.tvStatement)
        var imgTweet= itemView.findViewById<ImageView>(R.id.imgTweet)
        var imgPerson= itemView.findViewById<ImageView>(R.id.imgPerson)
        var imgLike= itemView.findViewById<ImageView>(R.id.imgLike)
        var imgComment= itemView.findViewById<ImageView>(R.id.imgComment)
        var imgShare= itemView.findViewById<ImageView>(R.id.imgShare)
    }

}
