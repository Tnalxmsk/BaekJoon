package bronze.five

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val tk = StringTokenizer(readLine())
        val n = tk.nextToken().toInt()
        val m = tk.nextToken().toInt()
        bw.write("Case #${it+1}: $n + $m = ${n+m}\n")
    }
    bw.flush()
}