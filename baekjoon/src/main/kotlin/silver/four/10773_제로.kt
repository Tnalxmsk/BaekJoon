package silver.four

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stack = Stack<Int>()
    repeat(readLine().toInt()) {
        val k = readLine().toInt()
        if (k == 0) {
            stack.pop()
        } else stack.push(k)

    }
    println(stack.sum())
}