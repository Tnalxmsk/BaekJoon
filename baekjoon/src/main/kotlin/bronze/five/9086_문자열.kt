package bronze.five

import java.io.*
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readLine().toInt()) {
        val tk = StringTokenizer(readLine())
        val text = tk.nextToken()
        bw.write("${text.first()}${text.last()}\n")
    }
    bw.flush()
}