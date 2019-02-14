package com.example.testinject

import com.google.inject.AbstractModule
import com.google.inject.Provides


class FirstModule: AbstractModule() {

    @Provides
    fun provideString(): String = "Hello"
}
