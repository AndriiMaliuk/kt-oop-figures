package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

const val VALUE_IT = 2.0
class IsoscelesTrapezoid(color: Color,
                         private val sideA: Double,
                         private val sideB: Double,
                         private val height: Double): Figure(color)  {
    override fun drow() {
        println("Figure: isoscelesTrapezoid, area: ${((sideA + sideB) / VALUE_IT) * height}" +
                " sq. units, sideA: $sideA units, sideB: $sideB units, height: $height units," +
                " color: $color")
    }
}
