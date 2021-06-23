package com.example.daggertutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggertutorial.dagger.AnimalComponent
import com.example.daggertutorial.dagger.DaggerAnimalComponent
import com.example.daggertutorial.objects.Animal

class MainActivity : AppCompatActivity() {
    lateinit var animal: Animal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Dagger
        val animalComponent: AnimalComponent = DaggerAnimalComponent.create()
        animal = animalComponent.getAnimal()

        animal.run()
    }
}