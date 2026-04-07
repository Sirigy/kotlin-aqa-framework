package api_models

import io.restassured.response.Response

object ExampleContract {

    fun getExample(): Response {
        return core.ApiClient.get("/example")
    }
}
