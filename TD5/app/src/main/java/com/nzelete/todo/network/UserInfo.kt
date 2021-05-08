package com.nzelete.todo.network

import com.squareup.moshi.Json

/*

{
  "firstname": "nzelete",
  "lastname": "landry",
  "email": "nzeletecherubin@gmail.com",
  "password": "testtest",
  "password_confirmation": "testtest"
}

response
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyMjAsImV4cCI6MTYxMzA1MDM3Nn0.kJtjdL83JR4eVqqO6MAn8YIsN9ff9eLkKtU9AwQdV-g",
  "expire": "2021-02-11T14:32:56.102+01:00"
}

 */

data class UserInfo(
    @field:Json(name = "email")
    var email: String,
    @field:Json(name = "firstname")
    var firstName: String,
    @field:Json(name = "lastname")
    var lastName: String,
    @field:Json(name = "avatar")
    val avatar: String
)