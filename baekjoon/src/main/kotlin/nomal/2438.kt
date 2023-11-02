package nomal

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val number = readLine()
    val sb = StringBuilder()
    var result = ""
    repeat(number.toInt()) {
        result += "*"
        sb.append("$result\n")
    }
    println(sb.toString())
}