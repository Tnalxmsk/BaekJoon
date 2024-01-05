package bronze.five

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val array = arrayListOf<Int>()
    repeat(30) {
        array.add(it+1)
    }
    repeat(28) {
        val n = readLine().toInt()
        array.remove(n)
    }
    bw.write(array.joinToString("\n"))
    bw.flush()
}