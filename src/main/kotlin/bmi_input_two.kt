fun main(args: Array<String>) {
    println("Enter your weight in kgs : ")
    var weight = readLine()!!.toInt()
    println("Enter your height in metres : ")
    var height = readLine()!!.toFloat()
    var bmi = (weight)/(height*height)
    if (bmi <= 18){
        println("Your bmi is $bmi , You are underweight")
    }
    else if (bmi <=24){
        println("Your bmi is $bmi ,You are healthy")
    }
    else if (bmi <= 30){
        println("Your bmi is $bmi ,You are overweight")
    }
    else {
        println("Your bmi is $bmi ,You are obese")
    }
}