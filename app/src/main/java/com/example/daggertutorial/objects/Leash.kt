package com.example.daggertutorial.objects

import android.util.Log
import javax.inject.Inject

private const val TAG = "Leash"

class Leash @Inject constructor() {
    fun setListener(animal: Animal) {
        Log.d(TAG, "${animal.javaClass.simpleName} is listening for leash controls.")
    }
}