package silver.three

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numbers = mutableListOf<Int>()
    val size = br.readLine().toInt()
    repeat(size) {
        val tk = StringTokenizer(br.readLine())
        numbers.add(tk.nextToken().toInt())
    }

    bw.write("${(getAM(numbers))}\n")
    bw.write("${getCenter(numbers.sorted(), size)}\n")
    bw.write("${getN(numbers.sorted())}\n")
    bw.write("${numbers.max() - numbers.min()}")
    bw.flush()
}

fun getAM(numbers: List<Int>): Int = numbers.average().roundToInt()

fun getN(sortedNumbers: List<Int>): Int {
    val map = sortedNumbers.groupingBy { it }.eachCount()
    val maxValue = map.maxOf { it.value }
    val maxMap = map.filter { it.value == maxValue }
    val mapKeys = maxMap.keys.sorted()
    println(mapKeys)
    return if (mapKeys.size == 1) {
        mapKeys.first()
    } else {
        mapKeys[1]
    }
}

fun getCenter(sortedNumbers: List<Int>, size: Int): Int = sortedNumbers[(size/2)]