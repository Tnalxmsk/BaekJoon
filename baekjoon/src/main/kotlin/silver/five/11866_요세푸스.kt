package silver.five

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    val queue: Queue<Int> = LinkedList()
    for (i in 1..n) {
        queue.add(i)
    }
    var count = 1
    bw.write("<")
    while (true) {
        if (queue.size == 1) {
            bw.write("${queue.remove()}>")
            break
        }
        if (count == k) {
            bw.write("${queue.remove()}, ")
            count = 1
            continue
        }
        val number = queue.poll()
        queue.add(number)
        count++
    }
    bw.flush()
}