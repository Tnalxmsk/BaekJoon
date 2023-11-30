package bronze.one

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = readLine().uppercase()
    var max = 0
    var k = 'a'
    w.toSet().forEach { s ->
        val n = w.count { it == s }
        if (max < n) {
            max = n
            k = s
        } else if (max == n) {
            k = '?'
        }
    }
    println(k)
}