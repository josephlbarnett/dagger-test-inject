package com.example.testinject

import dagger.Module
import dagger.Provides

@Module
class InjectModule {

    @Provides
    fun provideString(): String = "Hello"
}
