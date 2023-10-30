//abstract class Shape : Comparable<Shape>{
//    abstract fun area(): Double
//    override fun compareTo(other: Shape) = this.area().compareTo(other.area())
//}
//
//class Circle(private val radius: Double) : Shape() {
//    override fun area(): Double {
//        return Math.PI * radius * radius
//    }
//}
//
//class Square(private val side: Double) : Shape() {
//    override fun area(): Double {
//        return side * side
//    }
//}
//
//class Rectangle(private val sideA: Double, private val sideB: Double,) : Shape() {
//    override fun area(): Double {
//        return sideA * sideB
//    }
//}
//
//
//fun main() {
//    val shapes = mutableListOf<Shape>()
//    val n = readLine()!!.toInt()
//    for (i in 0 until n) {
//        val line = readLine()!!.split(" ")
//        when (line[0]) {
//            "C" -> shapes.add(Circle(line[1].toDouble()))
//            "S" -> shapes.add(Square(line[1].toDouble()))
//            "R" -> shapes.add(Rectangle(line[1].toDouble(), line[2].toDouble()))
//        }
//    }
//    val totalArea = shapes.sumOf { it.area() }
//    println("%.2f".format(totalArea))
//}
//abstract class Shape : Comparable<Shape>{
//    abstract fun area(): Double
//    override fun compareTo(other: Shape) = this.area().compareTo(other.area())
//}
//
//class Circle(private val radius: Double) : Shape() {
//    override fun area(): Double {
//        return Math.PI * radius * radius
//    }
//}
//
//class Square(private val side: Double) : Shape() {
//    override fun area(): Double {
//        return side * side
//    }
//}
//
//class Rectangle(private val sideA: Double, private val sideB: Double,) : Shape() {
//    override fun area(): Double {
//        return sideA * sideB
//    }
//}
//
//
//fun main() {
//    val shapes = mutableListOf<Shape>()
//    val n = readLine()!!.toInt()
//    for (i in 0 until n) {
//        val line = readLine()!!.split(" ")
//        when (line[0]) {
//            "C" -> shapes.add(Circle(line[1].toDouble()))
//            "S" -> shapes.add(Square(line[1].toDouble()))
//            "R" -> shapes.add(Rectangle(line[1].toDouble(), line[2].toDouble()))
//        }
//    }
//    val totalArea = shapes.sumOf { it.area() }
//    println("%.2f".format(totalArea))
//}
