package com.cigdemkocak.kotlinalgorithmquestions

//Bize bir liste verilmiş listede kaç tane sıfırdan küçük, sıfıra eşit ve sıfırdan büyük olmalarının
// yüzdelik kısmının ne kadar olduğunu soruyor.

fun main(){
    println(plusMinus(arrayOf(1,1,0,-1,-1)))
    println(plusMinus2(arrayOf(1,1,0,-1,-1)))
}
//1. Yöntem
fun plusMinus(arr : Array<Int>) : Unit {
    var plusElement = 0f
    var minusElement = 0f
    var zeroElement  = 0f
    var a = arr.size

    for(i in arr){
        if(i > 0){
            plusElement++
        }else if (i < 0){
            minusElement++
        }else if(i == 0){
            zeroElement++
        }
    }
    plusElement = (plusElement/a)
    minusElement = (minusElement/a)
    zeroElement = (zeroElement/a)

    println(plusElement)
    println(minusElement)
    println(zeroElement)
}

//2. Yöntem
//if yerine when kullandık
fun plusMinus2(arr : Array<Int>) : Unit {
    var plusElement = 0f
    var minusElement = 0f
    var zeroElement  = 0f
    var a = arr.size

    for(i in arr){
        when{
            i > 0 -> plusElement++
            i < 0 -> minusElement++
            i == 0 -> zeroElement++
        }
    }
    plusElement = (plusElement/a)
    minusElement = (minusElement/a)
    zeroElement = (zeroElement/a)

    println(plusElement)
    println(minusElement)
    println(zeroElement)
}
