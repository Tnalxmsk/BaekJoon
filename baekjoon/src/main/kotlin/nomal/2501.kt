package nomal

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())

    val n: Int = st.nextToken().toInt()
    val k: Int = st.nextToken().toInt()

    var result = 0
    var count = 0

    for (i in 1..n) {
        if (n%i == 0) {
            count++
        }
        if (count == k) {
            result = i
            break
        }
    }
    println(result)
}