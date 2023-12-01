package silver.four

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Deque
import java.util.LinkedList

fun Deque<Int>.empty(): Int {
    return if (this.isEmpty()) {
        return 1
    } else 0
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val deque: Deque<Int> = LinkedList()
    repeat(readLine().toInt()) {
        val data = readLine().split(" ")
        when(data[0]) {
            "push_front" -> deque.addFirst(data[1].toInt())
            "push_back" -> deque.addLast(data[1].toInt())
            "pop_front" -> bw.write("${deque.pollFirst() ?: -1}\n")
            "pop_back" -> bw.write("${deque.pollLast() ?: -1}\n")
            "size" -> bw.write("${deque.size}\n")
            "empty" -> bw.write("${deque.empty()}\n")
            "front" -> bw.write("${deque.firstOrNull() ?: -1}\n")
            "back" -> bw.write("${deque.lastOrNull() ?: -1}\n")
        }
    }
    bw.flush()
}
