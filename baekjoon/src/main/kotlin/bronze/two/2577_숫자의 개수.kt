package bronze.two

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = 1
    for (i in 0..2) {
       n *= readLine().toInt()
    }
    for (i in 0..9) {
        println(n.toString().count { it.digitToInt() == i })
    }
}