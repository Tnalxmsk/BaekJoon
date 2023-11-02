package bronze.three

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var maxIndex = 0
    var max = 0
    var num = 0
    repeat(9) {
        num = br.readLine().toInt()
        if (num > max) {
            max = num
            maxIndex = it
        }
    }
    println(max)
    println(maxIndex+1)
}