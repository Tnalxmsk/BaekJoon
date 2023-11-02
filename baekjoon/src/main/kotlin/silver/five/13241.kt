package silver.five

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val tk = StringTokenizer(br.readLine())

    val ran = (1..100)
    if (ran.random() > 50) {
        val a = tk.nextToken().toLong()
        val b = tk.nextToken().toLong()
        println(lcmL(a,b))
    } else {
        val a = tk.nextToken().toInt()
        val b = tk.nextToken().toInt()
        println(lcm(a,b))
    }
}

fun gcd(x: Int, y: Int): Int {
    var num1 = max(x, y)
    var num2 = min(x, y)
    while (true) {
        val r = num1 % num2
        if (r == 0) {
            return num2
        } else {
            num1 = num2
            num2 = r
        }
    }
}

fun lcm(x: Int, y: Int): Int {
    return x * y / gcd(x,y)
}

fun gcdL(x: Long, y: Long): Long {
    var num1 = max(x, y)
    var num2 = min(x, y)
    while (true) {
        val r = num1 % num2
        if (r == 0L) {
            return num2
        } else {
            num1 = num2
            num2 = r
        }
    }
}

fun lcmL(x: Long, y: Long): Long {
    return x * y / gcdL(x,y)
}