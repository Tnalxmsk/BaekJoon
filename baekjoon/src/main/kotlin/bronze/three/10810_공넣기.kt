package bronze.three

import java.io.*
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val start = readLine().split(" ")
    val array = IntArray(start.first().toInt())
    repeat(start.last().toInt()) {
        val tk = StringTokenizer(readLine())
        val n = tk.nextToken().toInt()-1
        val m = tk.nextToken().toInt()-1
        val k = tk.nextToken().toInt()
        for (i in n..m) array[i] = k
    }
    bw.write(array.joinToString(" "))
    bw.flush()
}