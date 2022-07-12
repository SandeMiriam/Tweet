package com.example.twitterpost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.twitterpost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytweets()
    }
    fun displaytweets(){
        var tweet=Twitter("Miriam","@sofia's own","greatful is my second name ","112","223","886")
        var tweet1=Twitter("sande","@sandem","always appreciate","112","223","886")
        var tweet2=Twitter("Muganda","@ndeda's son","accountability is what defines me","118","543","2000",)
        var tweet3=Twitter("ruth","@nabwire","Borrow money from a pessimist–they don’t expect it back","112","223","886")
        var tweet4=Twitter("floid","@ojuka","Always remember that you are unique–just like everyone else","112","223","886")
        var tweet5=Twitter("Alfred","@okecth","Out of my mind. Back in five minutes","112","223","886")
        var tweet6=Twitter("Trevor","@yout","always appreciate","112","223","886")
        var tweet7=Twitter("Cheryl","@cheryB","always appreciate","112","223","886")
        var tweet8=Twitter("Gentrix","@auma","always appreciate","112","223","886")
        var tweet9=Twitter("Peteson","@peter","always appreciate","112","223","886")
        var tweet10=Twitter("Jude","@jude","always appreciate","112","223","886")

        var twitterList= listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10)
        var tweetsAdapter=TwitterRvAdapter(twitterList)
        binding.rvTweet.layoutManager=LinearLayoutManager(this)
        binding.rvTweet.adapter=tweetsAdapter


    }


}




