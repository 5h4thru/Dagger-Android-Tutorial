package com.example.daggertutorial.dagger

import com.example.daggertutorial.MainActivity
import com.example.daggertutorial.dagger.modules.HandsModule
import com.example.daggertutorial.dagger.modules.MeatDietModule
import com.example.daggertutorial.dagger.modules.OwnerModule
import com.example.daggertutorial.objects.Animal
import dagger.Component

@Component(modules = [OwnerModule::class, HandsModule::class, MeatDietModule::class])
interface AnimalComponent {

    // Provision methods
    fun getAnimal(): Animal

    // Inject classes that Dagger should inject member variables and methods
    // Cannot be a super class (cannot be Activity class for example)
    fun inject(mainActivity: MainActivity)
}