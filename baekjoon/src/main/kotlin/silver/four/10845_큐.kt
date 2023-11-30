package silver.four

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val myQueue = MyQueue<Int>()

    repeat(readLine().toInt()) {
        val k = readLine().split(" ")
        when(k[0]) {
            "push" -> myQueue.push(k[1].toInt())
            "pop" -> bw.write("${myQueue.pop()}\n")
            "size" -> bw.write("${myQueue.size()}\n")
            "empty" -> bw.write("${myQueue.empty()}\n")
            "front" -> bw.write("${myQueue.front()}\n")
            "back" -> bw.write("${myQueue.back()}\n")
        }
    }
    bw.flush()
}

class MyQueue<Int : Any> {
    private val list: LinkedList<Int> = LinkedList()

    fun push(data: Int): Int {
        list.addLast(data)
        return data
    }

    fun pop(): Any? {
        return if (list.isEmpty()) {
            -1
        } else {
            list.removeFirst()
        }
    }

    fun size(): kotlin.Int {
        return list.size
    }

    fun empty(): kotlin.Int {
        return when(list.isEmpty()) {
            true -> 1
            false -> 0
        }
    }

    fun front(): Any? {
        return if (list.isEmpty()) {
            -1
        } else list.first
    }

    fun back(): Any? {
        return if (list.isEmpty()) {
            -1
        } else list.last
    }
}