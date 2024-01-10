package bronze.three

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()
    val size = n.length - 1
    for (i in 0..size/2) {
        if (n[i] == n[n.length-1-i]) {
            continue
        } else {
            bw.write("0")
            bw.flush()
            return
        }
    }
    bw.write("1")
    bw.flush()
}