package com.example.daggertutorial.objects

import javax.inject.Inject
import javax.inject.Named

interface Diet {
    fun name(): String
    fun calories(): Int
    fun minCalories()
}

class VeganDiet @Inject constructor(@Named("maxCalories") private val maxCalories: Int, @Named("minCalories") private val minCalories: Int) : Diet {
    override fun name(): String {
        return "Vegan Diet"
    }

    override fun calories(): Int {
        return maxCalories
    }

    override fun minCalories() {
        println("Min calories for Vegan diet is $minCalories")
    }
}

class MeatDiet @Inject constructor(private val maxCalories: Int) : Diet {
    override fun name(): String {
        return "Meat Diet"
    }

    override fun calories(): Int {
        return maxCalories
    }

    override fun minCalories() {
        println("Same as $maxCalories because NOT IMPLEMENTED")
    }
}