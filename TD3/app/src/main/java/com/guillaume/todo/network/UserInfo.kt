package com.nzelete.todo.network

import com.squareup.moshi.Json

/*

{
  "firstname": "nzelete",
  "lastname": "landry",
  "email": "nzeletecherubin@gmail.com",
  "password": "landry",
  "password_confirmation": "landry"
}

response
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyMjAsImV4cCI6MTYxMzA1MDM3Nn0.kJtjdL83JR4eVqqO6MAn8YIsN9ff9eLkKtU9AwQdV-g",
  "expire": "2021-02-11T14:32:56.102+01:00"
}

 */

data class UserInfo(
    @field:Json(name = "email")
    val email: String,
    @field:Json(name = "firstname")
    val firstName: String,
    @field:Json(name = "lastname")
    val lastName: String
)