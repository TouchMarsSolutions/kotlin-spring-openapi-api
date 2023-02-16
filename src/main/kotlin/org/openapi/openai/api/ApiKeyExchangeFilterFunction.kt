package org.openapi.openai.api

import org.springframework.web.reactive.function.client.ClientRequest
import org.springframework.web.reactive.function.client.ClientRequest.Builder
import org.springframework.web.reactive.function.client.ClientResponse
import org.springframework.web.reactive.function.client.ExchangeFilterFunction
import org.springframework.web.reactive.function.client.ExchangeFunction
import reactor.core.publisher.Mono

class ApiKeyExchangeFilterFunction(private val apiKey: String) : ExchangeFilterFunction {

    override fun filter(request: ClientRequest, next: ExchangeFunction): Mono<ClientResponse> {
        val builder: Builder = ClientRequest.from(request)
        builder.header("Content-Type", "application/json")
        builder.header("Authorization", "Bearer $apiKey")
        return next.exchange(builder.build())
    }
}
