package example.micronaut

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.client.annotation.Client
import org.reactivestreams.Publisher

@Client(id = "linkedin") // <1>
interface LinkedInApiClient {

    @Get("/v2/me") // <2>
    fun me(@Header authorization: String): Publisher<LinkedInMe> // <3> <4>
}
