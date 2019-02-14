package com.example.testinject

import com.codahale.metrics.MetricRegistry
import org.testng.annotations.Guice
import org.testng.annotations.Test
import javax.inject.Inject


@Guice(modules = [SecondModule::class])
class SecondModuleTest
@Inject constructor(val str: String,
                    val registry: MetricRegistry){
    @Test
    fun testInject() {
        println(str)
        assert(str == "goodbye")
        assert(registry != null)
    }
}