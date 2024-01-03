package bronze.four

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = br.readLine().toInt()
    repeat(br.readLine().toInt()) {
        val tk = StringTokenizer(br.readLine())
        val k = tk.nextToken().toInt()
        val m = tk.nextToken().toInt()
        n -= k * m
    }
    if (n == 0) bw.write("Yes") else bw.write("No")
    bw.flush()
}