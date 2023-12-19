package bronze.two

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine().split(" ")
    val list = readLine().split(" ").map { it.toInt() }.sorted()
    val newList = mutableListOf<Int>()
    for (i in list.indices - 2) {
        for (j in i+1..<list.size - 1) {
            for (k in j+1..<list.size) {
                val sum = list[i] + list[j] + list[k]
                if (sum > input.last().toInt()) break
                newList.add(sum)
            }
        }
    }
    bw.write("${newList.max()}")
    bw.flush()
}