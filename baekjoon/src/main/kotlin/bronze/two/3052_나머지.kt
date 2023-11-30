package bronze.two

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = mutableListOf<Int>()
    repeat(10) {
        list.add(readLine().toInt() % 42)
    }
    println(list.toSet().size)
}