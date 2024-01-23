package bronze.one

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val newList = mutableListOf<Int>()
    var t = readLine().toInt()
    while (t != 0) {
        newList.clear()
        val k = readLine().toInt()
        val n = readLine().toInt()
        val under = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)
        if (k == 0) {
            bw.write("$n\n")
            t--
            continue
        }
        if (n == 1) {
            bw.write("1\n")
            t--
            continue
        }
        for (i in 0..<k) {
            newList.clear()
            for (j in 0..<n) {
                if (j == 0) {
                    newList.add(1)
                    continue
                }
                newList.add(under[j]+newList[j-1])
            }
            under.clear()
            under.addAll(newList)
        }
        bw.write("${newList.last()}\n")
        t--
    }
    bw.flush()
}