package com.example.daggertutorial.dagger

import com.example.daggertutorial.objects.Animal
import dagger.Component

@Component
interface AnimalComponent {
    fun getAnimal(): Animal
}