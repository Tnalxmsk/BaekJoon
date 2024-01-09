package bronze.two

import java.io.*
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val tk = StringTokenizer(readLine())
    val n = tk.nextToken().reversed().toInt()
    val m = tk.nextToken().reversed().toInt()
    bw.write("${max(n, m)}")
    bw.flush()
}