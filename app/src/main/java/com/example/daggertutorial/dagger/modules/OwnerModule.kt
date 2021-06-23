package com.example.daggertutorial.dagger.modules

import com.example.daggertutorial.objects.Owner
import dagger.Module
import dagger.Provides

@Module
class OwnerModule {
    @Provides
    fun provideOwner(): Owner {
        return Owner()
    }
}