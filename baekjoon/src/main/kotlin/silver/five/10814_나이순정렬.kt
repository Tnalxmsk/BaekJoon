package silver.five

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val map = mutableListOf<Pair<String, Int>>()
    repeat(readLine().toInt()) {
        val input = readLine().split(" ")
        map.add(Pair(input[1], input[0].toInt()))
    }
    map.sortedBy { it.second }.forEach {
        bw.write("${it.second} ${it.first}\n")
    }

    bw.flush()
}