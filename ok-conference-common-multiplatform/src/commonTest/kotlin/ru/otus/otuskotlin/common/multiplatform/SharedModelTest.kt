package ru.otus.otuskotlin.common.multiplatform

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SharedModelTest {

    @Test
    fun testModel() {
        val model = SharedModel(id = "1", name = "one")

        assertEquals("1", model.id)
        assertEquals("one", model.name)
    }
}