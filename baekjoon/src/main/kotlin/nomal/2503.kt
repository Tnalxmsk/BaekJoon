package nomal

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())

    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    println(n)
    println(k)
    st = StringTokenizer(readLine())
    val arr = Array(n) {st.nextToken().toInt()}
    arr.sort()
    print(arr[n - k])
}