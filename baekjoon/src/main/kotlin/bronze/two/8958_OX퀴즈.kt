package bronze.two

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readln().toInt()) {
        var sum = 0
        var n = 1
        val k = readLine()
        for (i in k.indices) {
            if (k[i] == 'X') {
                n = 1
                continue
            }
            sum += 1 * n
            n++
        }
        bw.write("$sum\n")
    }
    bw.flush()
}