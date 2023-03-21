fun main(args: Array<String>) {
    println("Enter floor : ")
    var point = readLine()!!.toInt()
    when(point){
        1 -> println("Go to First Floor")
        2 -> println("Go to Second Floor")
        3 -> println("Go to Third Floor")
        4 -> println("Go to Fourth Floor")

        else -> println("Not available after fourth floor")}

}