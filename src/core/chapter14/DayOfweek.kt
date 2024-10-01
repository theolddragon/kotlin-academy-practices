package core.chapter14

enum class DayOfWeek (
    val isWeekend: Boolean,
    val dayName: String,
) {
    MONDAY(false, "Monday") {
        override fun nextDay(): DayOfWeek {
            return TUESDAY
        }
    },
    TUESDAY(false, "Tuesday") {
        override fun nextDay(): DayOfWeek {
            return WEDNESDAY
        }
    },
    WEDNESDAY(false, "Wednesday") {
        override fun nextDay(): DayOfWeek {
            return THURSDAY
        }
    },
    THURSDAY(false, "Thursday") {
        override fun nextDay(): DayOfWeek {
            return FRIDAY
        }
    },
    FRIDAY(false, "Friday") {
        override fun nextDay(): DayOfWeek {
            return SATURDAY
        }
    },
    SATURDAY(true, "Saturday") {
        override fun nextDay(): DayOfWeek {
            return SUNDAY
        }
    },
    SUNDAY(true, "Sunday") {
        override fun nextDay(): DayOfWeek {
            return MONDAY
        }
    };

    abstract fun nextDay(): DayOfWeek
}

fun main() {
    val friday: DayOfWeek = DayOfWeek.FRIDAY
    println(friday.dayName)
    println(friday.isWeekend)

    val saturday: DayOfWeek = friday.nextDay()
    println(saturday.dayName)
    println(saturday.isWeekend)
}