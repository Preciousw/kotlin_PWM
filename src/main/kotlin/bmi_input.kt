import java.util.Scanner

fun main(args: Array<String>) {
    println("Enter your name : ")
    val stringInput = readLine()!!

    val reader = Scanner(System.`in`)
    println("Enter weight in kgs : ")
    var weight = reader.nextInt()

    val readertwo = Scanner(System.`in`)
    println("Enter height in meters : ")
    var height:Float = readertwo.nextFloat()

    var bmi = (weight)/(height*height)

    println("$stringInput, your BMI is $bmi")
}