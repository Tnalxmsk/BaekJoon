package bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    val cycle = readLine().toInt()

    for (i in 1..cycle) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        sb.append("${a+b}\n")
    }
    println(sb.toString())
}