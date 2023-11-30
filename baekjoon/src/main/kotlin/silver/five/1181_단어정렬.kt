package silver.five

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = mutableListOf<String>()
    repeat(readLine().toInt()) {
        list.add(readLine())
    }
    val set = list.sorted().toSet().toMutableList()

    set.sortBy { it.length }

    set.forEach {
        println(it)
    }
}