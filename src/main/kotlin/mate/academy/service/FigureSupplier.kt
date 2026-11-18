package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.figure.Figure
import mate.academy.model.figure.impl.Circle
import mate.academy.model.figure.impl.IsoscelesTrapezoid
import mate.academy.model.figure.impl.Rectangle
import mate.academy.model.figure.impl.RightTriangle
import mate.academy.model.figure.impl.Square
import kotlin.random.Random
import kotlin.random.nextInt

class FigureSupplier {
    val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(1..5)) {
            1 -> Circle(colorSupplier.getRandomColor(),Random.nextDouble())
            2 -> Square(colorSupplier.getRandomColor(),Random.nextDouble())
            3 -> Rectangle(colorSupplier.getRandomColor(),Random.nextDouble(),Random.nextDouble())
            4 -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(), Random.nextDouble(),Random.nextDouble())
            5 -> RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(),Random.nextDouble())

            else -> {
                Square(colorSupplier.getRandomColor(),Random.nextDouble())
            }
        }
    }

    fun getDefaultFigure(): Figure = Circle(Color.WHITE, 10.0)
}
