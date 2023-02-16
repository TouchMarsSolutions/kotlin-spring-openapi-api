package org.openapi.openai.api

import org.springframework.core.io.buffer.DefaultDataBufferFactory
import org.springframework.http.MediaType
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono
import java.nio.charset.StandardCharsets

object ApiUtil {
    fun getExampleResponse(exchange: ServerWebExchange, mediaType: MediaType?, example: String): Mono<Void> {
        val response = exchange.response
        response.headers.contentType = mediaType
        val exampleBytes = example.toByteArray(StandardCharsets.UTF_8)
        val data = DefaultDataBufferFactory().wrap(exampleBytes)
        return response.writeWith(Mono.just(data))
    }
}