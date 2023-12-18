package silver.four

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for(j in 0..<br.readLine().toInt()) {
        val stack: Stack<Char> = Stack()
        val input = br.readLine()
        var state = true
        for (i in input.indices) {
            val char = input[i]
            if (char == '(') {
                stack.push(char)
                state = false
            }
            else {
                if (stack.isEmpty()) {
                    bw.write("NO\n")
                    state = true
                    break
                }
                stack.pop()
            }
        }
        if (stack.isEmpty().not() && state.not()) {
            bw.write("NO\n")
        } else if (stack.isEmpty() && state.not()) {
            bw.write("YES\n")
        }
    }
    bw.flush()
}