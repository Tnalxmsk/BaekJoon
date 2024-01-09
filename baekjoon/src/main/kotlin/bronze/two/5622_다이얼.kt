package bronze.two

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var count = 0
    val t = readLine()
    for (i in t.indices) {
        val j =al.indexOf(t[i])
        count += when (j) {
            in 0..2 -> 3
            in 3..5 -> 4
            in 6..8 -> 5
            in 9..11 -> 6
            in 12..14 -> 7
            in 15..18 -> 8
            in 19..21 -> 9
            else -> 10
        }
    }
    bw.write("$count")
    bw.flush()
}