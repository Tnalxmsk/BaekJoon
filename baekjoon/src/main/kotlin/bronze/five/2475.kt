package bronze.five

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().split(" ")
    val r = n.sumOf { it.toInt() * it.toInt() }
    println(r%10)
}