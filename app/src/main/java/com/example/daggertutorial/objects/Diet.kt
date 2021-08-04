package com.example.daggertutorial.objects

import javax.inject.Inject

interface Diet {
    fun name(): String
    fun calories(): Int
}

class VeganDiet @Inject constructor(private val maxCalories: Int) : Diet {
    override fun name(): String {
        return "Vegan Diet"
    }

    override fun calories(): Int {
        return maxCalories
    }
}

class MeatDiet @Inject constructor(private val maxCalories: Int) : Diet {
    override fun name(): String {
        return "Meat Diet"
    }

    override fun calories(): Int {
        return maxCalories
    }
}