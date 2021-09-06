package com.eggroup.composearch.network

import com.eggroup.composearch.data.remote.Post
import retrofit2.http.GET

interface ApiService {

    companion object{
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }

    @GET("posts")
    suspend fun getPost():List<Post>

}