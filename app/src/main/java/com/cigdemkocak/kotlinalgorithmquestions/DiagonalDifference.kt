package com.cigdemkocak.kotlinalgorithmquestions
import java.lang.Math.abs

//Soruda verilen matrisin köşegenleri arasındaki fark soruluyor.
// 1 23 1   (0,0)  (0,1) (0,2)
// 1 3 4    (1,0)  (1,1) (1,2)
// 2 4 5    (2,0)  (2,1) (2,2)


fun main() {

    println(diagonalDifference(arrayOf(arrayOf(1, 23, 1), arrayOf(1, 3, 4), arrayOf(2, 4, 5))))

}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var diagonal1 = 0
    var diagonal2 = 0

    val n = arr.size


    for (i in 0 until n) { //until bitiş ögesini içermeyen durumlar için kullanılır

        diagonal1 += arr[i][i]  //(0,0) (1,1) (2,2)
        diagonal2 += arr[i][n - 1 - i] //(0,2) (1,1) (2,0)

    }

    return abs(diagonal1 - diagonal2) //abs çıkan sonucun mutlak değerini döndürür.
}