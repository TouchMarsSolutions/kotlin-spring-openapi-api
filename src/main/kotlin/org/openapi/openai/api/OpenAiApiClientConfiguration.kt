package org.openapi.openai.api

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class OpenAiApiClientConfiguration {

    @Bean
    fun openAiWebClient(): WebClient {
        return WebClient.builder()
            .baseUrl("YOUR_API_BASE_URL_HERE")
            .filter(ApiKeyExchangeFilterFunction("YOUR_API_KEY_HERE"))
            .build()
    }

}
