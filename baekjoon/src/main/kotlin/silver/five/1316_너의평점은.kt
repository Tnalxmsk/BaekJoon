package silver.five

import java.io.*

private const val FORMAT = "%.6f"

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var sum = 0.0
    var k = 0.0
    for (i in 1..20) {
        val t = br.readLine().split(" ")
        when (t[2]) {
            "P" -> continue
            "A+" -> {
                k += t[1].toDouble()
                sum += t[1].toDouble() * 4.5
            }
            "A0" -> {
                k += t[1].toDouble()
                sum += t[1].toDouble() * 4.0 }
            "B+" -> {
                k += t[1].toDouble()
                sum += t[1].toDouble() * 3.5 }
            "B0" -> {
                k += t[1].toDouble()
                sum += t[1].toDouble() * 3.0 }
            "C+" -> {
                k += t[1].toDouble()
                sum += t[1].toDouble() * 2.5 }
            "C0" -> {
                k += t[1].toDouble()
                sum += t[1].toDouble() * 2.0 }
            "D+" -> {
                k += t[1].toDouble()
                sum += t[1].toDouble() * 1.5 }
            "D0" -> {
                k += t[1].toDouble()
                sum += t[1].toDouble() * 1.0 }
            "F" -> {
                k += t[1].toDouble()
                sum += 0.0
            }
        }
    }
    val result = if (sum == 0.0) {
        0.0
    } else sum/k
    bw.write(FORMAT.format(result))
    bw.flush()
}
