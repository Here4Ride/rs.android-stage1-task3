package subtask5
class TelephoneFinder {
    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        if (number.substring(0, 1) == "-") {
            return null
        }

        var result = mutableListOf<String>()
        var stringOne = number
        var stringTwo = ""
        for (i in number) {
            when (i) {
                '1' -> {
                    stringTwo = stringOne.replace(i, '2')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '4')
                    result.add(stringTwo)
                }
                '2' -> {
                    stringTwo = stringOne.replace(i, '1')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '3')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '5')
                    result.add(stringTwo)
                }
                '3' -> {
                    stringTwo = stringOne.replace(i, '2')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '6')
                    result.add(stringTwo)

                }
                '4' -> {
                    stringTwo = stringOne.replace(i, '1')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '5')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '7')
                    result.add(stringTwo)
                }
                '5' -> {
                    stringTwo = stringOne.replace(i, '2')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '4')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '6')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '8')
                    result.add(stringTwo)
                }
                '6' -> {
                    stringTwo = stringOne.replace(i, '3')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '5')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '9')
                    result.add(stringTwo)
                }
                '7' -> {
                    stringTwo = stringOne.replace(i, '4')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '8')
                    result.add(stringTwo)

                }
                '8' -> {
                    stringTwo = stringOne.replace(i, '5')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '7')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '9')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '0')
                    result.add(stringTwo)
                }
                '9' -> {
                    stringTwo = stringOne.replace(i, '6')
                    result.add(stringTwo)
                    stringTwo = stringOne.replace(i, '8')
                    result.add(stringTwo)

                }
                '0' -> {
                    stringTwo = stringOne.replace(i, '8')
                    result.add(stringTwo)
                }

            }
        }
        return  result.toTypedArray()
    }
}



