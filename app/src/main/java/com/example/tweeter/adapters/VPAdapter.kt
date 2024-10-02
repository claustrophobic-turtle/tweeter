package com.example.tweeter.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tweeter.SuggestedAccountFragment
import com.example.tweeter.TweetFragment

class VPAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> SuggestedAccountFragment()
            else -> TweetFragment()
        }
    }
}