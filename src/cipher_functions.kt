
const val dict = " ~1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./!@#$%^&*()_+qwertyuiop{}|asdfghjkl:\"zxcvbnm<>?þθđ•◦∃→∀∨¬"
// the set of all characters
val length = dict.length
// The number of characters (starting at zero).

fun index(char: Char): Int {
    var num = dict.indexOf(char)
    return num
}
// This function returns the numerical value of a character.

fun string_to_num(string: String): MutableList<Int> {
    var numS = mutableListOf<Int>()
    var c = 0
    string.length

    while (c != string.length) {
        numS.add(index(string[c]))
        c += 1
    }

    return numS
}
// This function returns the numerical values of each character in a string.

fun num_to_char(int: Int): Char {
    val char = dict[int % length]
    return char
}
// This function returns the character that the input number is equal to.

fun numS_to_string(list_of_numbers: MutableList<Int>): String {

    var numS = list_of_numbers
    var c: Int = 0
    var str: String = buildString {
        while (c != numS.size) {
            append(num_to_char(numS[c]))
            c += 1
        }
    }

    return str
}
// This function takes a list of numbers as input, and returns the equivalent string.

fun add_num_to_numS(cn: Int, numS: MutableList<Int>): MutableList<Int> {

    var i = 0
    val size: Int = numS.size
    while (i != size) {
        numS[i] = ((numS[i] + cn % length) + length) % length
        i+=1
    }

    return numS
}
// This function takes two inputs, a number, and a set of numbers. The function then adds the number to each number in the set of numbers, and returns the new set of numbers

fun encrypt(encryption_number: Int, message: String): String {
    return numS_to_string(add_num_to_numS(encryption_number,string_to_num(message)))
}
