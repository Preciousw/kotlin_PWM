fun main(args: Array<String>) {
    println("Welcome to Safaricom, which service would you like today:" )
    println("1.Data Deals")
    println("2.Daily bundles")
    println("3.Weekly bundles")
    println("4.GO MONTHLY")
    println("5.Okoa data")

    println("Enter service : ")
    var service = readLine()!!.toInt()
    when(service){
        1 -> println("Data Deals")
        2 -> println("Daily bundles")
        3 -> println("Weekly bundles")
        4 -> println("Go MONTHLY")
        5 -> println("Okoa Data")

        else -> println("Service not available")


    }



}