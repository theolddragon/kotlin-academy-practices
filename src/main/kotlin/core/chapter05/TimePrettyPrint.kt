package main.kotlin.core.chapter05

fun secondsToPrettyTime(seconds: Int): String {
    if (seconds < 0) {
        return "Invalid input"
    }

    val X = seconds / (60 * 60)
    val XString = if (X > 0) {
        "$X h "
    } else {
        ""
    }

    val Y = (seconds % (60 * 60)) / 60
    val YString = if (Y > 0) {
        "$Y min "
    } else {
        ""
    }

    val Z = seconds % 60
    val ZString = if (Z > 0) {
        "$Z sec"
    } else {
        ""
    }

    return "$XString$YString$ZString"
}

fun main() {
    println(secondsToPrettyTime(-1))
    println(secondsToPrettyTime(0))
    println(secondsToPrettyTime(45))
    println(secondsToPrettyTime(60))
    println(secondsToPrettyTime(150))
    println(secondsToPrettyTime(1410))
    println(secondsToPrettyTime(60 * 60))
    println(secondsToPrettyTime(3665))
}

