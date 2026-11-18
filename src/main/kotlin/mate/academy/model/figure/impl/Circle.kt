package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure
import kotlin.math.PI
import kotlin.math.pow

class Circle(color: Color, private val radius: Double): Figure(color) {
    override fun drow() {
        println("Figure: circle, area: ${PI * radius.pow(2)} sq. units," +
                " radius: $radius units, color: $color")
    }
}
