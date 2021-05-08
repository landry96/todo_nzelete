package com.guillaume.todo.userInfo

import com.guillaume.todo.network.Api
import com.guillaume.todo.network.UserInfo
import okhttp3.MultipartBody

class UserInfoRepository {
    private val userWebService = Api.userWebService

    suspend fun update(user: UserInfo): Boolean {
        val response = userWebService.update(user)
        return response.isSuccessful
    }

    suspend fun getInfos(): UserInfo? {
        val response = userWebService.getInfos()
        return if (response.isSuccessful) response.body() else null
    }

    suspend fun updateAvatar(avatar: MultipartBody.Part): Boolean {
        val response = userWebService.updateAvatar(avatar)
        return response.isSuccessful
    }
}