package bronze.one

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val tk = StringTokenizer(br.readLine())

    val x = tk.nextToken().toInt()
    val y = tk.nextToken().toInt()

    bw.write("${gcd(x,y)}\n${lcm(x,y)}")
    bw.flush()
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