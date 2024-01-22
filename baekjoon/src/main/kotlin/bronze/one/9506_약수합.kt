package bronze.one

import java.io.*
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val tk = StringTokenizer(readLine())
        val n = tk.nextToken().toInt()
        if (n == -1) break
        val list = mutableListOf<Int>()
        for (i in 1..<n) {
            if (n % i == 0) list.add(i)
        }
        if (n == list.sum()) {
            bw.write("$n = ${list.joinToString(" + ")}\n")
            continue
        }
        bw.write("$n is NOT perfect.\n")
    }
    bw.flush()
}