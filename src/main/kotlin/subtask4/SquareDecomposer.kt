package subtask4
import kotlin.math.sqrt

//package subtask4
//import kotlin.math.sqrt
//
//class SquareDecomposer {
//
//    // TODO: Complete the following function
//    fun decomposeNumber(number: Int): Array<Int>? {
//        var result = mutableListOf<Int>()
//        val totalSquare = number * number
//        val preTotalSquare = (number - 1) * (number - 1)
//        val cashedRemainder = totalSquare - preTotalSquare
//        var remainder = totalSquare - preTotalSquare
//        result.add(0, number - 1)
//        var numberForCycle = sqrt(remainder.toDouble()).toInt()
//
//        fun findResult(n:Int): Array<Int>? {
//            for(i in n downTo 1) {
//                val numberSquare = i * i
//                // val firstArrElem = result.first()
//                // if(result.size > 1 && firstArrElem == 1 && result[1] == 1) {
//                //     val lastElem = result.last()
//                //     result = mutableListOf<Int>()
//                //     result.add(0, lastElem)
//                //     numberForCycle -= 1
//                //     remainder = cashedRemainder
//                //     findResult(numberForCycle)
//                // }
//
//                if (remainder - numberSquare >= 0) {
//                    result.add(0, i)
//                    remainder -= numberSquare
//                }
//            }
//            return result.toTypedArray()
//        }
//
//        if(remainder > 0) {
//            val lastElem = result.last()
//            result = mutableListOf<Int>()
//            result.add(0, lastElem)
//            numberForCycle -= 1
//            remainder = cashedRemainder
//            findResult(numberForCycle)
//        }
//
//        if(remainder == 0 && result.size > 1) {
//            return result.toTypedArray()
//        } else {
//            return null
//        }
//
//        throw NotImplementedError("Not implemented")
//    }
//}
class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        return recursion(number*number, number - 1)
    }
        fun recursion(value:Int,nachalo:Int): Array<Int>? {
       for (i in nachalo downTo 1){
           val square = i*i
           val ostatok = value - square
           if (ostatok==0){
               return arrayOf(i)
           }
           if (ostatok<0){
               return null
           }
           var sqrt = sqrt(ostatok.toDouble()).toInt()
           if(sqrt>=i) sqrt = i-1
               var kysok = recursion(ostatok,sqrt)
           if(kysok!=null)  return kysok+ arrayOf(i)
       }
            return null
}

}
