import java.io.IOException
import java.lang.NumberFormatException

fun main() {
    val s: String = "ho ho ho"
    try {
        val d: Int = s.toInt()
        println(d)
    } catch (e: NumberFormatException) {
        print(e.message)
    }

}