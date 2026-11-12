
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
    val x = "v=E*m=ZT→*WD=*'TUD=Q*T]*-YQGTCS*-=HH→*[C\\*f>Z=*-QTWW=C*[*UQYSQ[V*WY*=C'Y\\=*[C\\*\\='Y\\=*R]TCS*WD=*'YQQ='W*QRH=]∀*c>CTSDW"
    println(x)
    //println(string_to_num(x))
    println("")
    //println(add_num_to_numS(3,string_to_num(x)))
    println(numS_to_string(add_num_to_numS(777,string_to_num(x))))
}