/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package Test

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.* // for serving static content
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import java.io.File

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.configureRouting() {
    routing {

        static("/") {
            resources("files/my-app/build")
        }

        get("/") {
            call.respondRedirect("/index.html")
        }
    }
}

fun Application.module() {
    configureRouting()
    // configureTemplating()
}