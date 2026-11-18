package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val sup = FigureSupplier()
    sup.getRandomFigure().drow()
    sup.getDefaultFigure().drow()
}
