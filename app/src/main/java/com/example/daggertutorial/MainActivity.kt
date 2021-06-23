package com.example.daggertutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggertutorial.dagger.AnimalComponent
import com.example.daggertutorial.dagger.DaggerAnimalComponent
import com.example.daggertutorial.objects.Animal
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var animal: Animal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Option 1: Initialize Dagger
        val animalComponent: AnimalComponent = DaggerAnimalComponent.create()
        // animal = animalComponent.getAnimal()

        // Option 2: Inject this class into Dagger component to let Dagger inject all member variables and methods
        animalComponent.inject(this)

        animal.run()
    }
}