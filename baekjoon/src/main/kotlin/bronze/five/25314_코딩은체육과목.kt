package bronze.five

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readLine().toInt()/4) {
        bw.write("long ")
    }
    bw.write("int")
    bw.flush()
}