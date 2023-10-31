package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cycle = readln()
    val arr = arrayListOf<Int>()
    repeat(cycle.toInt()) {
        arr.add(readLine().toInt())
    }

    val newList = arr.sorted()

    repeat(arr.size) {
        println(newList[it])
    }
}