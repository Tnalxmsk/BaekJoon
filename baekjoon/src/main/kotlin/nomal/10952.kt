package nomal

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var sb = StringBuilder()

    while (true) {
        val tk = StringTokenizer(br.readLine())
        val a = tk.nextToken().toInt()
        val b = tk.nextToken().toInt()
        if (a == 0 && b == 0) {
            break
        }
        sb.append("${a+b}\n")
    }
    println(sb.toString())
}