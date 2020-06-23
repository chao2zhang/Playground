package com.kotlinc.playground.ret;

import com.kotlinc.playground.models.Rectangle
import com.kotlinc.playground.models.Urn
import org.junit.Test

fun setupFeature(map: Map<String, String>): Unit {
    val id = map["id"] ?: return safeThrow()
    println("setupFeature() succeeded")
}

fun safeThrow(): Unit {
    println("safeThrow()")
    TODO()
}

class ReturnTest {

    @Test
    fun setupFeatureSuccessfully() {
        setupFeature(mapOf("id" to "cazhang"))
    }

    @Test
    fun setupFeatureFailure() {
        setupFeature(mapOf("notid" to "cazhang"))
        drawSquare(
            x = 10, y = 10,
            width = 100, height = 100,
            fill = true
        )
    }

    fun mapIfNullable() {
        val urn: Urn? = parseUrnFromResponse()
        val mapped = urn
            ?.let { transformValue(it) }
            ?: Urn.DEFAULT
    }

    fun parseUrnFromResponse(): Urn? {
        return null
    }

    fun transformValue(urn: Urn?) : Urn {
        return urn!!
    }

    fun apply(): Rectangle {
        val myRectangle = Rectangle().run {
            length = 4
            breadth = 5
            color = 0xFAFAFA
        }
        return transposeRectangle(myRectangle)
    }

    fun transposeRectangle(rect: Unit): Rectangle {
        return Rectangle()
    }

    fun transposeRectangle(rectangle: Rectangle): Rectangle {
        return rectangle
    }

    fun applyT(): Rectangle {
        val myRectangle = Rectangle().apply {
            transposeRectangle(this)
        }
        return transposeRectangle(myRectangle)
    }

    fun applyRegex() {
        val hexNumberRegex = run {
            val digits = "0-9"
            val hexDigits = "A-Fa-f"
            val sign = "+-"
            Regex("[$sign]?[$digits$hexDigits]+")
        }
        hexNumberRegex
    }

    fun foo(param: Int): String {

        return if (param == 1) {
            "one"
        } else {
            "two"
        }
    }

    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException(
                "Invalid color param value"
            )
        }
    }

    fun transformStyle(color: String) {

    }

    fun applyStyle(u: Unit) {

    }

    fun applyStyle(maybeStyle: String?) {
        val style = maybeStyle ?: return
        applyStyle(transformStyle(style))
    }
}

fun drawSquare(
    x: Int = 10, y: Int = 10,
    width: Int = 100, height: Int = 100,
    fill: Boolean = true
) {
    if (fill) {
        x + y + width + height
    }
}
