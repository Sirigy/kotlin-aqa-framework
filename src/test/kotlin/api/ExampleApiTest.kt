package api

import api_models.ExampleContract
import org.junit.jupiter.api.Test

class ExampleApiTest {

    @Test
    fun gettingExample() {

        val response = ExampleContract.getExample()

        println(response.statusCode)

        assert(response.statusCode == 200)
    }
}
