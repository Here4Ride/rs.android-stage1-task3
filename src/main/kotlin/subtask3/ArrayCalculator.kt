package subtask3

import kotlin.math.absoluteValue

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val sortedList = itemsFromArray.filterIsInstance<Int>().sortedBy { it.absoluteValue }.reversed()

        if(sortedList.size>0){
            var result = 1

            if(sortedList.size <= numberOfItems) {
                for (i in sortedList)
                    result *= i
                return result
            }
            for (i in 0 until numberOfItems){
                result *= sortedList[i]
            } 
            val onlyPositive = sortedList.filter { i -> i>= 0 }
            var resultTwo= 1
            for (i in 0 until numberOfItems){
                resultTwo*= onlyPositive[i]
            }
            return if (resultTwo>= result){
                resultTwo
            }
            else result
        }
        return 0

    }
}