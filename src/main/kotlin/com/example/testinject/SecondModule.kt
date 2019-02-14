package com.example.testinject

import com.codahale.metrics.MetricRegistry
import com.google.inject.AbstractModule
import com.google.inject.Provides

class SecondModule: AbstractModule() {
    override fun configure() {
        bind(MetricRegistry::class.java).toInstance(MetricRegistry())
    }
    @Provides
    fun provideString() = "goodbye"
}