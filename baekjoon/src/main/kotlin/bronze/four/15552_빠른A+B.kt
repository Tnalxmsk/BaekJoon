package bronze.four

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val tk = StringTokenizer(readLine())
        bw.write("${tk.nextToken().toInt() + tk.nextToken().toInt()}\n")
    }
    bw.flush()
}