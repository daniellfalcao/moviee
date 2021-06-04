package br.danielfalcao.shared.infrastructure.network

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*


val client = HttpClient {
    install(JsonFeature) {
        serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
            isLenient = true
            prettyPrint = true
        })
    }
}