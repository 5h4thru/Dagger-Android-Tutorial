package com.example.daggertutorial.objects

import android.util.Log
import javax.inject.Inject

private const val TAG = "Hands"

class Hands @Inject constructor(private val left: LeftHand, private val right: RightHand) {
    init {
        Log.d(TAG, "leftHand is $left; and rightHand is $right")
    }
}

// pretend this class is out of our control scope
class LeftHand : Fingers {
    override fun createFingers() {
        Log.d(TAG, "Creating fingers for leftHand $this")
    }
}

// pretend this class is out of our control scope
class RightHand : Fingers {
    override fun createFingers() {
        Log.d(TAG, "Creating fingers for rightHand $this")
    }
}


interface Fingers {
    fun createFingers()
}