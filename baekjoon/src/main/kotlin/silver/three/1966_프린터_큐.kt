package silver.three

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for(i in 0..<readLine().toInt()) {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val case = readLine().split(" ")
        var j = 0
        readLine().split(" ").forEach {
            queue.add(Pair(it.toInt(), j))
            j++
        }

        val target = case.last().toInt()
        var count = 0
        while (true) {
            if (queue.first().first == queue.maxOf { it.first }.toInt()) {
                count++
                if (queue.poll().second == target) break
            } else {
                queue.add(queue.poll())
                continue
            }
        }
        bw.write("${count}\n")
    }
    bw.flush()
}
