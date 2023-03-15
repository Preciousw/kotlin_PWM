fun main(args: Array<String>) {
    println("Welcome to Safaricom, which service would you like today:" )
    println("1.Data Deals")
    println("2.Daily bundles")
    println("3.Weekly bundles")
    println("4.GO MONTHLY")
    println("5.Okoa data")

    println("Enter service : ")
    var service:Int = readLine()!!.toInt()
    println(service)
    if(service == 1){
        println("Data Deals")    }
    else if(service == 2){
        println("Daily bundles")
    }
    else if(service == 3){
        println("Weekly bundles")
       }
    else if(service == 4){
        println("GO MONTHLY")}
    else if(service == 5) {
        println("Okoa data")
    }
    else {
        println("Invalid entry")
    }






}