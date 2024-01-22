package bronze.one

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = readLine().toLong()
    var i = 2L
    while (true) {
        if (n%i == 0L) {
            n /= i
            bw.write("$i\n")
        } else i++
        if (n == 1L) break
    }
    bw.flush()
}