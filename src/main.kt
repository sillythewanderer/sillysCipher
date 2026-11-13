// There is a tutorial at the bottom of this file

fun main() {

    val message = "Hello this is an example input string of text."
    val encryption_number = -33

    println(message)
    println("")

    val encrypted_message = encrypt(encryption_number, message)

    println(encrypted_message)
}

/*
    To encrypt your message you simply set the message variable and the encryption number, then run the program.

    To decrypt your message you set the message variable to be your encrypted message, then set the encryption number variable as follows:

    encrypt -> 33
    Therefore:
    decrypt -> -33

    encrypt = -33
    Therefore:
    decrypt = 33

    it is the same for any other number.

* */
