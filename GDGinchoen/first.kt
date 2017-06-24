package demo 

fun main(args : Array<String>) {
    // println("Hello Kotlin!")
    /* // String - Int Casting
    var n = 2*2
    val str: String = n.toString()
    println("n = ${str}")
    val intValue: Int = str.toInt()
    println( intValue * 2 )
    // */

    // for 
    // val NUM: Int = 2
    val LIMIT_DIGITS: Int = 500
    var digits = IntArray(LIMIT_DIGITS)
    digits[0] = 2 // digits[0] = NUM
    var maxDigitPointer = 0

    for ( temp in 1..999) { // 1000승은 1..n-1번까지 반복
    // println("start temp:${temp} - digitPointer:${digitPointer}")
        for ( i in maxDigitPointer downTo 0 ){ // 각 자리수에 2배
            digits[i] *= 2 // digits[i] *= NUM
            // print( digits[i] )
            // print( " / " )
            if ( digits[i] > 9 ) { // 10이상일 떄
                digits[(i+1)] += 1 // digits[(i+1)] += (digits[i]/10).toInt()
                digits[i] = digits[i] - 10 // digits[i] = digits[i] % 10
                if( i==maxDigitPointer ) maxDigitPointer++
            }
        }
    // println("")
    // println("end temp:${temp} - digitPointer:${digitPointer}")
    }
    /*
    for ( i :Int in digitPointer downTo 0 ) {
        print( digits[i] )
    }
    println( " " )
    */
    // 각 자리수 더하기
    var total = 0;
    for ( i :Int in 0..maxDigitPointer ) {
        total += digits[i]
    }
    println( total )

}