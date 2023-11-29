package bronze.five

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val numbers = readLine() ?: break
        var sum = 0
        numbers.split(" ").map { sum += it.toInt() }
        println(sum)
    }
}