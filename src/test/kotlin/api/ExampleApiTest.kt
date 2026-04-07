package api

import api_models.ExampleContract
import core.assertions.ApiAssertions
import org.junit.jupiter.api.Test

class ExampleApiTest {

    @Test
    fun gettingExample() {

        val response = ExampleContract.getExample()

        println(response.statusCode)

        ApiAssertions.assertStatusCode(response, 200)
    }
}
