package silver.four

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    repeat(n) {
        queue.offer(it+1)
    }
    while (true) {
        if (queue.size == 1) break
        queue.poll()
        if (queue.size == 1) break
        queue.add(queue.poll())
        if (queue.size == 1) break
    }
    println(queue.last())
}