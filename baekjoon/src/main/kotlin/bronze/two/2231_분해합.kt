package bronze.two

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var i = 0
    while (i <= n) {
        var sum = i
        for (j in i.toString()) {
            sum += j.digitToInt()
        }
        if (n == sum) {
            bw.write("$i")
            bw.flush()
            return@with
        }
        i++
    }
    bw.write("0")
    bw.flush()
}