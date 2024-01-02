package bronze.one

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    var answer = 1
    repeat(k) {
        answer = answer * (n-it) / (it+1)
    }

    bw.write("$answer")
    bw.flush()
}