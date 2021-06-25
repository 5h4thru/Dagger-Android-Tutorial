package com.example.daggertutorial.dagger.modules

import com.example.daggertutorial.objects.Diet
import com.example.daggertutorial.objects.MeatDiet
import dagger.Module
import dagger.Provides

@Module
class MeatDietModule constructor(private val maxCalories: Int) {

    /**
     * Optionally we can replace constructor with @Provides method
     *
     * @Provides
     * fun provideMaxCalories(): Int {
     *   return maxCalories
     * }
     *
     * Note: An issue with this will be when we want to provide different variable which happens to be Int
     * Remember that provideMaxCalories is just a naming convention,
     * According to Dagger, whenever it needs an Int Dagger will rely on this method and this causes problems when there are multiple variables of Int.
     *
     */


    /**
     * Binds doesn't support any configurations; it only ties a concrete implementation of an interface
     */
    // @Binds
    // abstract fun bindDiet(meatDiet: MeatDiet): Diet

    @Provides
    fun provideMeatDit(): Diet {
        return MeatDiet(maxCalories)
    }
}