package bronze.five

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().split(" ")
    val k = readLine().split(" ").filter { it.toInt() < n[1].toInt() }
    println(k.joinToString(" "))
}