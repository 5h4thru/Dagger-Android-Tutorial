package com.example.daggertutorial.objects

import javax.inject.Inject

interface Diet {
    fun name(): String
    fun calories(): Int
}

class VeganDiet @Inject constructor() : Diet {
    override fun name(): String {
        return "Vegan Diet"
    }

    override fun calories(): Int {
        return 250
    }
}

class MeatDiet @Inject constructor() : Diet {
    override fun name(): String {
        return "Meat Diet"
    }

    override fun calories(): Int {
        return 650
    }
}