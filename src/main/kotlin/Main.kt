import java.util.Scanner
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun main() {
    //main11()
    //main12()
    //main14()
    main121()

    /*
    println("Hello World!")

    var x = 5
    val y = 3

    println(x + y)
    println(calc(x, y))
    println(calc_sh(x, y))

    val (a, b) = readln().split(" ").map { it.toInt() } // или через Scanner
    println(calc_sh(a, b))

    val sc = Scanner(System.`in`)
    val a1 = sc.nextInt()
    println(a1)

    val res = if (a > b) a else b
    val res2 = when{
        a>b -> a
        else -> b
    }

    val nums = 1..10 //[1, 10]
    println(nums)

    for (i in 6 downTo 0 step 2) { // for i in range(6, 0, -2)
        print(i)
    }
    */
}

fun main11() {
    val (a, b, m, n) = readln().split(" ").map{it.toDouble()}
    if (a > m && b > n) {
        println("YES")
    } else {
        println("NO")
    }
}

fun main12() {
    val s = readln().map { it.toString() }
    var a = 0
    var t = 0
    var g = 0
    var c = 0

    for (i in s) {
        if (i == "A") {
            a += 1
        } else if (i == "T") {
            t += 1
        } else if (i == "G") {
            g += 1
        } else if (i == "C") {
            c += 1
        }
    }

    print("$a $t $g $c")
}

fun calc (a: Int, b: Int) : Int  { //unit=void
    return a + b
}

fun sum(a: Int, b: Int) = a / b
fun main14() {
    val (k, x, y) = readln().split(" ").map { it.toInt() }

    if (max(x, y) >= k && abs(x - y) >= 2) {
        println(0)
    } else if (max(x, y) >= k && (abs(x - y) == 0)) {
        println(2)
    } else if (max(x, y) >= k && (abs(x - y) < 2)) {
        println(abs(x - y))
    } else println(k - max(x, y))
}
//JVM - Java Virtual Machine

fun countVowels(s:String):Int {
    var c:Int = 0
    for (i in s) {
        if (i in "aeiou") {
           c++
        }
    }
    return c;
}
fun main121() {
    print(countVowels("hello"))
}