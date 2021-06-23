package com.example.daggertutorial.objects

import android.util.Log
import javax.inject.Inject

private const val TAG = "Animal"

class Animal @Inject constructor(hands: Hands, legs: Legs) {

    fun run() {
        Log.d(TAG, "$this is running...")
    }

    @Inject
    fun setListener(leash: Leash) {
        leash.setListener(this)
    }
}