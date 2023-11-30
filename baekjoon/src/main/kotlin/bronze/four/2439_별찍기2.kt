package bronze.four

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val t = ""
    for (i in n - 1 downTo 0) {
        println(padLeft(t, i, n))
    }
}

fun padLeft(s: String, i: Int, n: Int): String {
    var k = s
    repeat(n-i) {
        k += "*"
    }
    if (i == 0) {
        return k
    }
    return "%${i}s$k".format(s, n)
}