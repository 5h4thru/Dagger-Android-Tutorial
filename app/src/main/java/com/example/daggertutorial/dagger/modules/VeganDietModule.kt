package com.example.daggertutorial.dagger.modules

import com.example.daggertutorial.objects.Diet
import com.example.daggertutorial.objects.VeganDiet
import dagger.Binds
import dagger.Module

@Module
abstract class VeganDietModule {
    @Binds
    abstract fun bindDiet(veganDiet: VeganDiet): Diet
}