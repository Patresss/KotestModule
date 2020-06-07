package com.patres.kotest

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

class JavaFXExample : Application() {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(JavaFXExample::class.java)
        }

    }
    override fun start(primaryStage: Stage) {
        val layout = VBox().apply {
            children.add(Label("Hello, World!"))
        }
        primaryStage.run {
            scene = Scene(layout)
            show()
        }
    }
}