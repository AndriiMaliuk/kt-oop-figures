package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

const val VALUE_RT = 0.5
class RightTriangle(color: Color,
                    private val sideA: Double,
                    private val sideB: Double): Figure(color) {
    override fun area() = VALUE_RT * sideA * sideB

    override fun draw() {
        println("Figure: rightTriangle, area: ${area()} sq. units," +
                " sideA: $sideA units, sideB: $sideB units, color: $color")
    }
}
