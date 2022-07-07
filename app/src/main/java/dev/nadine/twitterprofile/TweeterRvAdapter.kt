package dev.nadine.twitterprofile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweeterRvAdapter(var twitterList:List<Tweeter>):
    RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return TwitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter=twitterList.get(position)
        holder.tvName.text =currentTwitter.name
        holder.tvUserName.text=currentTwitter.username
        holder.tvRetweet.text=currentTwitter.retweet
        holder.tvlikes.text=currentTwitter.likess
        holder.tvRetweets.text=currentTwitter.image
        holder.tvReplys.text=currentTwitter.reply
        holder.tvLikes.text=currentTwitter.Likes
    }

    override fun getItemCount(): Int {
        return twitterList.size
    }

}
class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    var tvUserName= itemView.findViewById<TextView>(R.id.tvUserName)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var imglike= itemView.findViewById<ImageView>(R.id.imgLike)
    var tvlikes= itemView.findViewById<TextView>(R.id.tvLikees)
    var imgReply= itemView.findViewById<ImageView>(R.id.imgReply)
    var imgRetweet= itemView.findViewById<ImageView>(R.id.imgRetweet)
    var tvRetweets= itemView.findViewById<TextView>(R.id.tvretweets)
    var tvRetweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var tvReplys=itemView.findViewById<TextView>(R.id.tvReply)
    var tvLikes=itemView.findViewById<TextView>(R.id.tvLikees)
    var imgShare= itemView.findViewById<ImageView>(R.id.imgShare)
    var tvReshares = itemView.findViewById<TextView>(R.id.tvReshares)
}