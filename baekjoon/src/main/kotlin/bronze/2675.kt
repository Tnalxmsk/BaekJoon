package bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    val cycle = readLine().toInt()

    for (k in 1..cycle) {
        val tk = StringTokenizer(readLine())
        val num = tk.nextToken().toInt()
        val text = tk.nextToken()
        for(j in text) {
            for (i in 0..<num.toInt()) {
                sb.append(j)
            }
        }
        sb.append("\n")
    }
    println(sb.toString())
}