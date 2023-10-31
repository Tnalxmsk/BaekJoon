package silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine()
    val list = n.split(" ")
    val numbers = br.readLine()
    val arr = arrayListOf<Int>()
    numbers.split(" ").forEach {
        arr.add(it.toInt())
    }
    println(arr.sorted().reversed()[list[1].toInt() - 1])
}