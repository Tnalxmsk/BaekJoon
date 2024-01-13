package bronze.five

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val value = br.readLine()
        if (value.isNullOrEmpty()) {
            break
        } else {
            println(value)
        }
    }
}