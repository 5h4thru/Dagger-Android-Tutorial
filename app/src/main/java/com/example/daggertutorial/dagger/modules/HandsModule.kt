package com.example.daggertutorial.dagger.modules

import com.example.daggertutorial.objects.Hands
import com.example.daggertutorial.objects.LeftHand
import com.example.daggertutorial.objects.RightHand
import dagger.Module
import dagger.Provides

@Module
class HandsModule {
    @Provides
    fun provideLeftHand(): LeftHand {
        val leftHand: LeftHand = LeftHand()
        leftHand.createFingers()
        return leftHand
    }

    @Provides
    fun provideHands(leftHand: LeftHand, rightHand: RightHand): Hands {
        return Hands(leftHand, rightHand)
    }

    @Provides
    fun provideRightHand(): RightHand {
        val rightHand = RightHand()
        rightHand.createFingers()
        return rightHand
    }
}