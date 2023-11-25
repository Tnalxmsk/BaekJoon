package bronze.two

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 스트링 토크니저 활용하기
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    var num = 0
    for (i in 1..n) {
        if (findPrimeNumber(st.nextToken().toInt())) num++
    }
    println(num)
}

fun findPrimeNumber(number: Int): Boolean {
    if (number == 1) return false
    for (i in 2..number) {
        if (number % i == 0 && number != i) return false
    }
    return true
}