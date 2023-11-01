package bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val word = br.readLine()
    val num = br.readLine().toInt()
    bw.write("${word[num-1]}")
    bw.flush()
}