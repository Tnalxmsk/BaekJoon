package silver.four

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var before = 0
    val list = mutableListOf<Int>()
    readLine()
    readLine().split(" ")
        .map { it.toInt() }
        .sorted()
        .forEach {
        before += it.toInt()
        list.add(before)
    }
    bw.write("${list.sum()}")
    bw.flush()
}