package silver.three

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toCharArray()
    val sum = (n[0] - n[1]
    if ((n[0] - n[1]) < 48) {
        bw.write("${-sum}")
        bw.flush()
        return@with
    }
    bw.write("$sum")
    bw.flush()
}