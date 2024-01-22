package bronze.two

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val m = readLine().toInt()
    val list = mutableListOf<Int>()
    for (i in n..m) {
        if (i.findPrimeNumber()) list.add(i)
    }
    if (list.size > 0) bw.write("${list.sum()}\n${list.min()}")
    else bw.write("-1")
    bw.flush()
}

fun Int.findPrimeNumber(): Boolean {
    if (this == 1) return false
    for (i in 2..this) {
        if (this % i == 0 && this != i) return false
    }
    return true
}