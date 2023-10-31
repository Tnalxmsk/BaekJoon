package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val number = st.nextToken().toString()
    number.toList().sorted().reversed().forEach {
        print(it)
    }
}