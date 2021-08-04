package com.example.daggertutorial.dagger.modules

import com.example.daggertutorial.objects.Diet
import com.example.daggertutorial.objects.VeganDiet
import dagger.Binds
import dagger.Module

@Module
/**
 * Always prefer abstract module classes and @Binds over @Provides
 * This helps Dagger not to create an instance of the Module when it's not necessary.
 *
 * Also helps keep the Module classes untouched when the underlying class (VeganDiet) changes its dependencies.
 * We didn't have to update [VeganDietModule] when [VeganDiet] started taking in maxCalories as constructor argument.
 */
abstract class VeganDietModule {
    /**
     * Binds doesn't support any configurations; it only ties a concrete implementation of an interface
     */
    @Binds
    abstract fun bindVeganDiet(veganDiet: VeganDiet): Diet

    // @Provides
    // fun provideVeganDiet(): Diet {
    //     return VeganDiet(maxCalories)
    // }
}