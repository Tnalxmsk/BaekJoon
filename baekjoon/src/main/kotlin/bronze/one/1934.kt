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
    val n = br.readLine().toInt()
    for (i in 1..n) {
        val st = StringTokenizer(br.readLine())
        val n1 = st.nextToken().toInt()
        val n2 = st.nextToken().toInt()
        bw.write("${nlcm(n1, n2)}\n")
    }
    bw.flush()
}

fun ngcd(x: Int, y: Int): Int {
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

fun nlcm(x: Int, y: Int): Int {
    return x * y / ngcd(x,y)
}