package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

const val VALUE_RT = 0.5
class RightTriangle(color: Color,
                    private val sideA: Double,
                    private val sideB: Double): Figure(color) {
    override fun drow() {
        println("Figure: rightTriangle, area: ${VALUE_RT * sideA * sideB} sq. units," +
                " sideA: $sideA units, sideB: $sideB units, color: $color")
    }
}
