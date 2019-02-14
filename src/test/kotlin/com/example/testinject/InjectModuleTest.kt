package com.example.testinject

import dagger.Component
import org.testng.annotations.Test
import javax.inject.Inject

@Component(modules = [InjectModule::class])
interface InjectComponent {
    val str: String
}

class InjectModuleTest {
    @Test
    fun testInject() {
        val component = DaggerInjectComponent.create()
        assert(component.str == "Hello")
    }
}