package subtask1

import kotlin.math.absoluteValue
class PolynomialConverter {
    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.size == 0) return null
        var result = ""
        var coef = numbers.size
        for(i in numbers.indices){
            if(numbers[i]==0){result += "" }
            else if (numbers[i]==-1) {  result+= " - "+"x"}
            else if(numbers[i]==1) {  result+= " + "+"x"}
            else if(numbers[i]>0) {
                if(i == coef - 1) {
                    result+= " + "+numbers[i].absoluteValue.toString()
                } else if (i == coef - 2) {
                    result+= " + "+numbers[i].absoluteValue.toString()+"x"
                }
                else if(numbers[i]==numbers.first()){
                    result+= numbers[i].absoluteValue.toString()+"x^"+(coef-i-1).toString()
                }
                else{
                    result+= " + "+numbers[i].absoluteValue.toString()+"x^"+(coef-i-1).toString()
                }
            }
            else if(numbers[i]<0) {  result+= " - "+numbers[i].absoluteValue.toString()+"x^"+(coef-i-1).toString()}

        }
        return result
    }
}


/*package subtask1
import kotlin.math.absoluteValue
class PolynomialConverter {
    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.size == 0) return null
        var coef = numbers.size - 1
        var result = ""
        for(num in numbers){
            if(num==0) {
                result += ""
            }
            if(num<0){
                if(numbers.indexOf(num) == coef) {
                    result += " - " + num.absoluteValue.toString()
                } else if(num == -1) {
                    result += " - x"
                } else if(numbers.indexOf(num) == coef - 1) {
                    result += " - " + num.absoluteValue.toString() + "x"
                } else if(num == numbers.first()) {
                    result += "-" + num.absoluteValue.toString() + "x^" + (coef - numbers.indexOf(num))
                } else {
                    result += " - " + num.absoluteValue.toString() + "x^" + (coef-numbers.indexOf(num))
                }
            }
            if(num>0) {
                if(numbers.indexOf(num) == coef) {
                    result += " + " + num.absoluteValue.toString()
                } else if(num == 1) {
                    result += " + x"
                } else if(numbers.indexOf(num) == coef - 1) {
                    result += " + " + num.absoluteValue.toString() + "x"
                } else if(num == numbers.first()) {
                    result += num.absoluteValue.toString() + "x^" + (coef - numbers.indexOf(num))
                } else {
                    result += " + " + num.absoluteValue.toString() + "x^" + (coef - numbers.indexOf(num))
                }
            }
        }
        return result
    }
}*/