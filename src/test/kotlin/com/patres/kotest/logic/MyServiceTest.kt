package com.patres.kotest.logic

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


class MyServiceTest: FreeSpec({

    "Should return true" - {
        val service = MyService()

        val result = service.isValid()

        result shouldBe true
    }

})