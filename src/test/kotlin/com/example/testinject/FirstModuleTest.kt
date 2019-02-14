package com.example.testinject

import com.codahale.metrics.MetricRegistry
import org.testng.annotations.Guice
import org.testng.annotations.Test
import javax.inject.Inject

@Guice(modules = [FirstModule::class])
class FirstModuleTest
@Inject constructor(val str: String,
                    val registry: MetricRegistry
){
    @Test
    fun testInject() {
        println(str)
        assert(str == "Hello")
        assert(registry != null)
    }
}