package silver.five

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val cro = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var t = br.readLine()
    cro.forEach {
        t = t.replace(it, " ")
    }
    bw.write("${t.length}")
    bw.flush()
}
