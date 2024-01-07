package silver.three

import java.io.*
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = readLine().split(" ")
    val size = list.last().toInt() + 1
    val arr = Array(size) { false }

    arr[0] = true
    arr[1] = true
    // 2부터 내가 설정한 마지막 수의 제곱근까지 반복문 수행
    for (i in 2..sqrt(size.toDouble()).toInt()) {
        // 0과 1은 건너띔
        if(arr[i]) {
            continue;
        }
        // i의 제곱, 부터 내가 설정한 마지막 수까지 소수가 아니므로 true
        for(j in i*i..list.last().toInt() step i) {
            arr[j] = true
        }
    }
    // false 값만 write
    for(i in list.first().toInt()..list.last().toInt()) {
        if(!arr[i]) {
            bw.write("$i\n")
        }
    }
    bw.flush()
}