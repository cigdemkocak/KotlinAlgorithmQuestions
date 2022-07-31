package com.cigdemkocak.kotlinalgorithmquestions

//    #
//   ##
//  ###
// ####
//#####
//Verilen n sayısına göre bu n maksimum sayı olacak şekilde yukarıdaki şekli yazdırmamız isteniyor
//Bu şekil için n = 5

fun main() {

    staircase(5)
    staircase1(5)

}

fun staircase(n: Int): Unit {

    var star = "#"
    var space: String

    for (index in 1..n) { //1
        space = ""
        for (spaceSize in index until n) { //1
            space += " "
        }

        println(space + star)
        star += "#"
    }
}
// 2.Yöntem
fun staircase1(n: Int): Unit {

    var star = "#"
    var space: String

    for (index in 1..n) {

        space = " ".repeat(n - star.length)

        println(space.plus(star))

        star += "#"
    }

}