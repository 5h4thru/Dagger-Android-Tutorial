package com.example.daggertutorial.dagger

import com.example.daggertutorial.MainActivity
import com.example.daggertutorial.dagger.modules.HandsModule
import com.example.daggertutorial.dagger.modules.OwnerModule
import com.example.daggertutorial.dagger.modules.VeganDietModule
import com.example.daggertutorial.objects.Animal
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [OwnerModule::class, HandsModule::class, VeganDietModule::class])
interface AnimalComponent {

    // Provision methods
    fun getAnimal(): Animal

    // Inject classes that Dagger should inject member variables and methods
    // Cannot be a super class (cannot be Activity class for example)
    fun inject(mainActivity: MainActivity)

    /**
     * In a nutshell, this defines the API for Component Builder ourselves.
     * Check out the example of provideVeganDiet: instead of using Dagger's Builder API, we use this interface to create VeganDiet object.
     *
     * We now have the control to expose which methods are required to build the objects.
     * Important to note that we must provide a build() method that returns the Component itself.
     *
     * We also have to provide all the Modules included in the Component if they have parametrized constructors; failure to do so will result in error:
     * Sample error: @Component.Builder is missing setters for required modules or components: [com.example.daggertutorial.dagger.modules.VeganDietModule]
     */
    @Component.Builder
    interface Builder {
        /**
         * If we want to @BindsInstance multiple methods that return the same type we need to use @Named annotation to differentiate between them.
         * Dagger by default doesn't know which type to be used where.
         * Failure to do that will result in error:
         * error: [Dagger/DuplicateBindings] java.lang.Integer is bound multiple times:
         */
        @BindsInstance
        fun maxCalories(@Named("maxCalories") calories: Int): Builder

        @BindsInstance
        fun minCalories(@Named("minCalories") calories: Int): Builder

        fun build(): AnimalComponent
    }
}