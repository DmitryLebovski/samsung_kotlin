fun main5() {
    var c = readln().toInt()
    var a:List<Int> = readln().split(" ").map { it.toInt() }
    var s:Int = 0
    for (i in a) {
        s += i
        s *= 113
        s %= 10000007
    }
    print(s)
}

var c = 0
fun binom(n: Int, k: Int): Int {
    c += 1
    if (n == k || k == 0) return 1
    if (k == 1 ) return n
    return binom(n-1, k-1) + binom(n-1, k)
}
fun main7() {
    println(binom(6, 2))
    print(c)
}

fun main9() {
    val input = readLine()
    print(input!!.length)
    print(input!!.compareTo("null"))
}

//internal abstract class Shape : Comparable<Shape> {
//    internal abstract fun area(): Double
//    override fun compareTo(s: Shape) = this.area().compareTo(s.area())
//}
//
//internal class Square(val a: Int) : Shape() {
//    override fun area() = (a * a).toDouble()
//}
//
//internal class Rect(val a: Int, val b: Int) : Shape() {
//    override fun area() = (a * b).toDouble()
//}
//
//fun main10() {
//    val s = Square(3)
//    val r = Rect(3, 14)
//    println(s.area() + r.area())
//}


internal class Point(var x:Int, var y:Int) {
    fun move( dx: Int, dy: Int) {
        x += dx
        y += dy
    }
}
internal class CloudOfPoints(val points: ArrayList<Point>) {
    fun move( dx: Int, dy: Int){
        points.forEach { it.move(dx, dy) }
    }
}


fun String.countVowels():Int {
    var c = 0
    for (i in this) {
        if (i in "auoie") {
            c += 1
        }
    }
    return c
}
fun main13() {
    val phrase = "I'm here to see you"
    println(phrase.countVowels())
    val greeting = "Welcome  to Neverland! Be our guest."
    println(greeting.countVowels())
}

fun main15() {
    val lengths = intArrayOf(2, 3, 5, 7)
    val words: List<String> = "a foo bar bazz linux zypper".split(" ")
    for (w in words) {
        if (w.length in lengths) {
            print(w)
        }
    }
}

abstract class Shape : Comparable<Shape>{
    abstract fun area(): Double
    override fun compareTo(other: Shape) = this.area().compareTo(other.area())
}

class Square(var a:Double): Shape() {
    override fun area(): Double {
        return a * a
    }
}

class Round(var r:Double): Shape() {
    override fun area(): Double {
        return Math.PI * r * r
    }
}

class Rectangle(var a1: Double, var a2:Double): Shape() {
    override fun area(): Double {
        return a1 * a2
    }
}

fun main() {
    val shapes = mutableListOf<Shape>()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val line = readLine()!!.split(" ")
        when (line[0]) {
            "C" -> shapes.add(Round(line[1].toDouble()))
            "S" -> shapes.add(Square(line[1].toDouble()))
            "R" -> shapes.add(Rectangle(line[1].toDouble(), line[2].toDouble()))
        }
    }
    val totalArea = shapes.sumOf { it.area() }
    println("%.2f".format(totalArea))
}