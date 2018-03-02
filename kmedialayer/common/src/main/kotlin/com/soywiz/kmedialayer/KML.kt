package com.soywiz.kmedialayer

data class WindowConfig(
    val width: Int = 640,
    val height: Int = 480,
    val title: String = "KMediaLayer"
)

expect object Kml {
    fun createWindow(config: WindowConfig, listener: KMLWindowListener)
}

open class KMLWindowListener {
    open fun init(gl: KmlGl): Unit = gl.run {
    }

    open fun render(gl: KmlGl): Unit = gl.run {
        ClearColor(1f, 0f, 1f, 1f)
        Clear(GL_COLOR_BUFFER_BIT)
    }

    open fun keyUpdate(keyCode: Int, pressed: Boolean) {
    }

    open fun gamepadUpdate(button: Int, pressed: Boolean, ratio: Double) {
    }

    open fun mouseUpdate(x: Int, y: Int, buttons: Int) {
    }
}
