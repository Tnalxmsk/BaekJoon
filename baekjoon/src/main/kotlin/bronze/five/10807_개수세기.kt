package bronze.five

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    readLine()
    val list = readLine().split(" ")
    val num = readLine()
    bw.write("${list.count { it == num }}")
    bw.flush()
}