//build a simple grading system
//80-100 =>A - Congratulations
//70-79 => A- - Good
//69-60 => B - Fair
//If E => repeat the exam
fun main(args: Array<String>) {
    println("Enter marks :")
    var marks:Int = readLine()!!.toInt()
    if ( marks >= 80 ) {
        println("A, Congratulations !!")
    }
    else if (marks >= 70){
        println("A-, Good")
    }
    else if (marks >=  60){
        println("B, Fair")
    }
    else if (marks >= 50){
        println("C, Pass")
    }
    else println("E, Repeat the exam")
}