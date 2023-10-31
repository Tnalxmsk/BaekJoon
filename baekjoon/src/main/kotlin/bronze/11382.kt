package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val number = readLine()
    var result: Long = 0
    number.split(" ").forEach {
        result += it.toLong()
    }
    println(result)
}