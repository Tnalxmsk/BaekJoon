package silver.five

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Human>()
    val rank = mutableListOf<Int>()
    val size = readLine().toInt()
    repeat(size) {
        val tk = StringTokenizer(readLine())
        list.add(Human(tk.nextToken().toInt(), tk.nextToken().toInt()))
        rank.add(1)
    }

    for (i in list.indices) {
        val target = list[i]
        for (k in 0..<list.size) {
            if (target.height > list[k].height && target.kg > list[k].kg) {
                rank[k] += 1
            }
            /*} else if (target.height > list[k].height && target.kg < list[k].kg) {
                rank[i] -= 1
            } else if (target.height < list[k].height && target.kg > list[k].kg) {
                rank[i] -= 1
            } else continue*/

        }
    }
    bw.write(rank.joinToString(" "))
    bw.flush()
}

data class Human(
    val kg: Int,
    val height: Int
)