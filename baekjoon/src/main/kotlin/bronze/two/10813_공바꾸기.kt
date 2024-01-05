package bronze.two

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val array = arrayListOf<Int>()
    val list = readLine().split(" ").map { it.toInt() }
    for (i in 1..list.first()) {
        array.add(i)
    }
    repeat(list.last()) {
        val tk = StringTokenizer(readLine())
        var n = tk.nextToken().toInt()-1
        var m = tk.nextToken().toInt()-1
        while (n < m) {
            val temp = array[n]
            array[n++] = array[m]
            array[m--] = temp
        }
    }
    bw.write(array.joinToString(" "))
    bw.flush()
}