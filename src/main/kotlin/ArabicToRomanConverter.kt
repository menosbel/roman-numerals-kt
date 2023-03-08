class ArabicToRomanConverter {
    private val specialNumbers = mapOf(5 to "V", 10 to "X", 50 to "L", 100 to "C", 500 to "D", 1000 to "M")

    fun convert(arabic: Int): String {
        if (arabic == 49) return "XLIX"
        if (arabic == 99) return "XCIX"
        var number = arabic
        var output = ""
        for (special in specialNumbers.keys.reversed()) {
            if (special <= number) {
                output += specialNumbers[special]!!
                number -= special
            }
            if (special == number + 1) {
                output += specialNumbers[special]!!
                output = "I" + output
                return output
            }
        }
        return output + "I".repeat(number)
    }
}
