package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

class Rectangle(color: Color,
                private val width: Double,
                private val height: Double): Figure(color) {
    override fun drow() {
        println("Figure: rectangle, area: ${width * height} sq. units," +
                " width: $width units, height: $height units, color: $color")
    }
}
