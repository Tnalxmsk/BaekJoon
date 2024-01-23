package silver.five

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var num = 665
    var n = readLine().toInt()
    while (n != 0) {
        num++
        var count = 0
        var tmp = num

        while (tmp > 0) {
            if (tmp % 10 == 6) {
                count++
            } else count = 0
            tmp /= 10
            if (count == 3) {
                n--
            }
        }
    }
    bw.write("$num")
    bw.flush()
}

fun test() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var number = 665
    var n = br.readLine().toInt()
    while (n != 0) {
        number++
        if (number.toString().contains("666")) {
            n--
        }
    }
    bw.write("$number")
    bw.flush()
}