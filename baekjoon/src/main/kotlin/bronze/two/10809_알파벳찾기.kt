package bronze.two

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val k = readLine()
    val n = ('a'..'z')
    n.forEach {
        when {
            n.contains(it) -> bw.write("${k.indexOf(it)} ")
            !n.contains(it) -> bw.write("-1")
        }
    }
    bw.flush()
}