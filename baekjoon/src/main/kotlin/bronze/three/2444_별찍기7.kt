package bronze.three

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    for (i in 1..<n) {
        for (j in 1..<n - i + 1) {
            bw.write(" ")
        }
        for (j in 1..<2 * i) {
            bw.write("*")
        }
        bw.write("\n")
    }

    for (i in n downTo 1) {
        for (j in 1..<n - i + 1) {
            bw.write(" ")
        }
        for (j in 1..<2 * i) {
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
}