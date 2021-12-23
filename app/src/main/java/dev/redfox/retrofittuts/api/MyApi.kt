package dev.redfox.retrofittuts.api

import dev.redfox.retrofittuts.model.Post
import retrofit2.http.GET

interface MyApi {

    @GET("posts/1")
    suspend fun getPost(): Post
}