package core.chapter17

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class User(
    val username: String,
    val email: Email,
    val registrationDate: LocalDateTime,
    val height: Centimeters,
)

data class Email(val value: String)

data class Centimeters(val value: Int)

data class UserJson(
    val username: String,
    val email: String,
    val registrationDate: String,
    val heightCm: Int,
)

val Int.cm: Centimeters
    get() {
        return Centimeters(this)
    }

fun User.toJson(): UserJson {
    return UserJson(
        username = this.username,
        email = this.email.value,
        registrationDate = this.registrationDate.toString(),
        heightCm = this.height.value,
    )
}

fun UserJson.toUser(): User {
    return User(
        username = this.username,
        email = Email(this.email),
        registrationDate = LocalDateTime.parse(this.registrationDate),
        height = this.heightCm.cm,
    )
}

fun main() {
    val user = User(
        username = "alex",
        email = Email("alex@example.com"),
        registrationDate = LocalDateTime.of(1410, 7, 15, 10, 13),
        height = 170.cm,
    )

    val userJson = user.toJson()
    println(userJson)

    val user2 = userJson.toUser()
    println(user2)
}