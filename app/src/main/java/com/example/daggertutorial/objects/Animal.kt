package com.example.daggertutorial.objects

import android.util.Log
import javax.inject.Inject

private const val TAG = "Animal"

class Animal @Inject constructor(private val owner: Owner, private val diet: Diet) {

    fun run() {
        Log.d(TAG, "${this.javaClass.simpleName} is running...")
        Log.d(TAG, "Owner: $owner")
        Log.d(TAG, "Diet: ${diet.name()} consumes ${diet.calories()} calories")
    }

    @Inject
    fun setListener(leash: Leash) {
        leash.setListener(this)
    }
}