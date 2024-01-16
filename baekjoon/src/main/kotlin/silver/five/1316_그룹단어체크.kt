package silver.five

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var count = readLine().toInt()
    repeat(count) {
        val word = readLine()
        if (word.length == 1) return@repeat
        for (i in word.toSet()) {
            val index = word.indexOf(i)
            for (j in index..<word.length) {
                if (j + 1 == word.length) break
                else if (i != word[j]) {
                    if (i == word[j + 1]) {
                        count--
                        return@repeat
                    }
                }
            }
        }
    }
    bw.write("$count")
    bw.flush()
}