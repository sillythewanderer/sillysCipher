// There is a tutorial at the bottom of this file

const val dict = " ~1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./!@#$%^&*()_+qwertyuiop{}|asdfghjkl:\"zxcvbnm<>?þθđ•◦∃→∀∨¬"
val length = dict.length

fun index(char: Char): Int {
    var num = dict.indexOf(char)
    return num
}

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

fun num_to_char(int: Int): Char {
    val char = dict[int % length]
    return char
}


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

fun add_num_to_numS(cn: Int, numS: MutableList<Int>): MutableList<Int> {

    var i = 0
    val size: Int = numS.size
    while (i != size) {
        numS[i] = ((numS[i] + cn % length) + length) % length
        i+=1
    }

    return numS
}

fun main() {

    // place text here

    val message = "Hello this is an example input string of text."
    println(message)

    // the number that controls the scrambling

    val encryption_number = -33
    println("")
    //println(add_num_to_numS(3,string_to_num(x)))

    /*
    This last one is a tad complicated, so i'll break it down

    this function does a few things

    numS_to_string(add_num_to_numS(encryption_number,string_to_num(message)))

    first is this part:

    string_to_num(message)

    this turns the string "message" into a list of numbers [integers]

    add_num_to_numS(encryption_number,string_to_num(message))

    this adds the variable number "encryption number" to each number in the list we made in the previous step"

    numS_to_string

    this last step turns the list of numbers back into letters

     */

    println(numS_to_string(add_num_to_numS(encryption_number,string_to_num(message))))
}

/*
* This program is composed of several functions, but only 3 are of important to the user.
*
* first of all, any of these functions should be contained within a println function
*
* the first function is "string_to_num()" this function takes a string as input, then returns a list of numbers.
*
* the second function is "numS_to_string()" this function takes a list of numbers, and returns the string that is equivalent to that lis of numbers
*
*
* */
