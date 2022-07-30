package com.cigdemkocak.kotlinalgorithmquestions

//Verilen bir dizinin eleman değerlerinin toplamı isteniyor


fun main() {
    println(SimpleArraySum(arrayOf(1,2,3,4,5,6,7)))
    println(SimpleArraySum2(arrayOf(1,2,3,4,5,6,7)))
}

//1. Yöntem
fun SimpleArraySum(ar : Array<Int>) : Int{
    var sum = 0;
    for(i in ar){
        sum += i
    }
    return sum;

}


//2. Yöntem
  fun SimpleArraySum2(ar: Array<Int>) : Int = ar.sum()