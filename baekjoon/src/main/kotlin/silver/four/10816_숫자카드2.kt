package silver.four

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    readLine()
    val num1 = readLine().split(" ")
    readLine()
    val num2 = readLine().split(" ")

    val sortedN = num2.sorted()

    val map = HashMap<String, Int>()

    num1.forEach { num ->
        if (sortedN.binarySearch(num) >= 0) {
            map[num] = (map[num] ?: 0) + 1
        }
    }

    num2.forEach { bw.write("${map[it] ?: 0} ") }
    bw.flush()
}