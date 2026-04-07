package api_models

import core.ApiClient
import io.restassured.response.Response

object ExampleContract {

    fun getExample(
        path: String = "/example"
    ): Response {

        return ApiClient.get(path)
    }
}
