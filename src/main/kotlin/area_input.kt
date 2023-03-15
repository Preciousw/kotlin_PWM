import java.util.Scanner

fun main(args: Array<String>) {


    val reader = Scanner(System.`in`)
    println("Enter length : ")
    var length = reader.nextInt()

    val readertwo = Scanner(System.`in`)
    println("Enter width: ")
    var width = readertwo.nextInt()

    var area = length*width

    println("The area is $area")
}