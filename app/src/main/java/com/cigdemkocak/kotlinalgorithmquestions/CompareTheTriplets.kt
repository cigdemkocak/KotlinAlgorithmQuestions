package com.cigdemkocak.kotlinalgorithmquestions
//Bir listede Alice'in 3 farklı alanda puanı, diğer listede Bob'ın 3 farklı alanda puanı bulunuyor.
//Bu puanlar karşılaştırılıyor ve büyük puana sahip olan kişinin skoru bir puan artıyor. Eşitlik durumunda kimsenin puanı artmıyor.
//En sonunda kişilerin skorları liste içinde döndürülüyor.
//Kısacası, verilen iki liste içinde dizilerin birbirine karşılık gelen indexlerinden büyük olan 1 puan kazanacak.
//Bunu bütün liste elemanları için yapmamızı istiyorlar.
//Son olarak her iki listenin puan skorunu veren bir liste istiyorlar.


fun main() {
    var result =compareTriplets(arrayOf(1, 2, 3),arrayOf(3,2,1))
    println(result.joinToString(" "))

    var result1 =compareTriplets1(arrayOf(1, 2, 3),arrayOf(3,2,1))
    println(result1.joinToString(" "))

    var result2 =compareTriplets2(arrayOf(1, 2, 3),arrayOf(3,2,1))
    println(result2.joinToString(" "))


}

//1. Yöntem
fun compareTriplets(a:Array<Int> , b : Array<Int>) : Array<Int> {
    var scoreOfAlice = 0;
    var scoreOfBob = 0;
    for(index in a.indices){
        if(a[index] > b[index]){
            scoreOfAlice++;
        }else if(a[index] < b[index]){
            scoreOfBob++
        }
    }
    return arrayOf(scoreOfAlice,scoreOfBob)
}

//2. Yöntem
//For yerine when kullandık
fun compareTriplets1(a:Array<Int> , b : Array<Int>) : Array<Int> {
    var scoreOfAlice = 0;
    var scoreOfBob = 0;
    for(index in a.indices){
        when{
            a[index] > b[index] -> {
                scoreOfAlice ++
            }
            b[index] > a[index] ->{
                scoreOfBob ++
            }
        }
    }
    return arrayOf(scoreOfAlice,scoreOfBob)
}

//3. Yöntem
//zip fonksiyonu iki listeyi verilen şarta göre kıyaslar, count fonkdiyonu şarta uygun durumlarda skoru bir arttırır.
fun compareTriplets2(a: Array<Int>, b: Array<Int>) :Array<Int> {
    var scoreOfAlice = a.zip(b).count {it.first > it.second}
    var scoreOfBob = a.zip(b).count {it.second > it.first}

    return arrayOf(scoreOfAlice,scoreOfBob);

}