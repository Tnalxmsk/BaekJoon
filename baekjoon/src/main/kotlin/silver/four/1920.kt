package silver.four

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val num1 = br.readLine().toString().split(" ").sorted()

    val m = br.readLine().toInt()
    val num2 = br.readLine().toString().split(" ")

    for (i in 0..< m) {
        if (num1.binarySearch(num2[i]) >= 0) bw.write("1\n") else bw.write("0\n")
    }
    bw.flush()
}