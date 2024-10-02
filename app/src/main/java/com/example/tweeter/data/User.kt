package com.example.tweeter.data

data class User(
    val userEmail: String = "",
    val userProfileImage: String = "",
    val listOfFollowings: List<String> = listOf(),
    val listOfTweets: List<String> = listOf(),
    val uid: String = ""
)