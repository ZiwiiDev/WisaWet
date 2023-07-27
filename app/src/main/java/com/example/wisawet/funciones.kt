package com.example.wisawet

import okhttp3.*
import java.io.IOException


class funciones {
    // Función para enviar una solicitud HTTP al servidor
    fun sendHttpRequest(url: String, requestBody: RequestBody?, callback: Callback) {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                // Manejar errores aquí (por ejemplo, conexión fallida)
                callback.onFailure(call, e)
            }

            override fun onResponse(call: Call, response: Response) {
                // Manejar la respuesta del Arduino aquí
                val responseBody = response.body?.string()
                // Realizar acciones adicionales según la respuesta

                // Llamar al callback con la respuesta
                callback.onResponse(call, response)
            }
        })
    }

    // Función para recibir mensajes desde el servidor
    fun receiveMessage(url: String, requestBody: RequestBody?, callback: Callback) {
        val client = OkHttpClient()
        val requestBuilder = Request.Builder()
            .url(url)

        // Si se proporciona un RequestBody, se configura como parte de la solicitud
        requestBody?.let {
                requestBuilder.post(it)
        }

        val request = requestBuilder.build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                // Manejar errores aquí (por ejemplo, conexión fallida)
                callback.onFailure(call, e)
            }

            override fun onResponse(call: Call, response: Response) {
                // Manejar la respuesta del servidor aquí
                val responseBody = response.body?.string()
                // Realizar acciones adicionales según la respuesta

                // Llamar al callback con la respuesta
                callback.onResponse(call, response)
            }
        })
    }
}