package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

class Square(color: Color, private val side: Double): Figure(color) {

    override fun drow() {
        println("Figure: square, area: ${side * side} sq. units," +
                " side: $side units, color: $color")
    }
}
