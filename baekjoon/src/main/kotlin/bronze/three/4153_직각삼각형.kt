package bronze.three

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val l = readLine()
        if (l == "0 0 0") break
        val new = l.split(" ").sortedBy { it.toInt() }
        val result: Int = new[2].toInt() * new[2].toInt() - (new[1].toInt() * new[1].toInt() + new[0].toInt() * new[0].toInt())
        when(result) {
            0 -> bw.write("right\n")
            else -> bw.write("wrong\n")
        }
    }
    bw.flush()
}