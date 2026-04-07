package core.assertions

import io.restassured.response.Response

object ApiAssertions {

    fun assertStatusCode(
        response: Response,
        expectedStatus: Int
    ) {
        if (response.statusCode != expectedStatus) {
            throw AssertionError(
                "Expected status $expectedStatus but was ${response.statusCode}"
            )
        }
    }
}
