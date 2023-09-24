package bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = br.readLine()
    val list = br.readLine()
    val arr = list.split(' ')

    var minNumber: Int = arr[0].toInt()
    var maxNumber: Int = arr[0].toInt()

    for (i in arr) {
        val k = i.toInt()

        minNumber = min(minNumber, k)
        maxNumber = max(maxNumber, k)
    }
    println("$minNumber $maxNumber")
}

