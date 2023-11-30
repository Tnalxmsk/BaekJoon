package bronze.three

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readLine().toInt()) {
        val data = readLine().split(" ")
        var r = data[2].toInt()
        val f = data[0].toInt()
        var count = 1
        while (true) {
            if (r <= f) {
                break
            }
            r -= f
            count++
        }

        if (count < 10) {
            bw.write("${r}0${count}\n")
        }
        else bw.write("${r}${count}\n")
    }
    bw.flush()
}