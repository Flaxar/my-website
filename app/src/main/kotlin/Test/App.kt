/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package Test


// this == class instance
// field == variable
class App {
    var hello: String = "string"
}

fun main() {
    var app = App()
    app.hello = "override"
    println(app.hello)
}