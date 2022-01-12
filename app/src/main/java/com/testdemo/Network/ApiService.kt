package com.testdemo.Network

import com.testdemo.Model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
   suspend fun getPost():List<Post>
}