package main.kotlin.core.chapter10

open class View(
    val id: String,
    var isVisible: Boolean
) {

    fun show() {
        this.isVisible = true
    }
    fun hide() {
        this.isVisible = false
    }
}

class TextView(
    id: String,
    var text: String,
) : View(
    id = id,
    isVisible = true
)

class Toggle(
    id: String,
): View(
    id = id,
    isVisible = true
) {
    var isOn: Boolean = false

    fun click() {
        this.isOn = !isOn
    }
}

fun main() {
    val textView = TextView(
        id = "tv1",
        text = "Hello, World!"
    )
    println(textView.id)

    textView.text = "Welcome to Kotlin!"
    println(textView.text)
    println(textView.isVisible)

    textView.hide()
    println(textView.isVisible)

    val toggle = Toggle(
        id = "toggle1",
    )
    println(toggle.id)

    println(toggle.isOn)
    toggle.click()
    println(toggle.isOn)

    println(toggle.isVisible)
    toggle.hide()
    println(toggle.isVisible)
}