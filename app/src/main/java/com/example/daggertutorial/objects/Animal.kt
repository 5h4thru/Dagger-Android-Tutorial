package com.example.daggertutorial.objects

import android.util.Log
import javax.inject.Inject

private const val TAG = "Animal"

class Animal @Inject constructor(private val hands: Hands, private val legs: Legs, private val owner: Owner) {

    fun run() {
        Log.d(TAG, "$this is running...")
        Log.d(TAG, "Owner: $owner")
    }

    @Inject
    fun setListener(leash: Leash) {
        leash.setListener(this)
    }
}