package bronze.three

import java.io.*
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val tk = StringTokenizer(readLine())
        val n = tk.nextToken().toInt()
        val m = tk.nextToken().toInt()

        if (n == 0 && m == 0) break
        val t = when {
            n == 0 || m == 0 -> "neither"
            m % n == 0  -> "factor"
            n % m == 0 -> "multiple"
            else -> "neither"
        }
        bw.write("$t\n")
    }
    bw.flush()
}