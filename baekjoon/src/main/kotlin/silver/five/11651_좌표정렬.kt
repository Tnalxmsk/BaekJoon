package silver.five

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<List<String>>()
    repeat(readLine().toInt()) {
        val n = readLine().split(" ")
        list.add(n)
    }

    list.sortBy { it[0].toInt() }
    list.sortBy { it[1].toInt() }
    list.forEach { bw.write("${it.joinToString(" ")}\n") }
    bw.flush()
}