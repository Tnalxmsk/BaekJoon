package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numbers = IntArray(5)
    repeat(5) {
        numbers[it] = br.readLine().toInt()
    }
    var result = 0
    numbers.forEach {
        result += it
    }

    println(result/5)
    println(numbers.sorted()[2])
}