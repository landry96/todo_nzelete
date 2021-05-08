package com.guillaume.todo.userInfo

import com.guillaume.todo.network.UserInfo
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface UserWebService {
    @GET("users/info")
    suspend fun getInfos(): Response<UserInfo>

    @PATCH("users")
    suspend fun update(@Body user: UserInfo): Response<UserInfo>

    @Multipart
    @PATCH("users/update_avatar")
    suspend fun updateAvatar(@Part avatar: MultipartBody.Part): Response<UserInfo>
}