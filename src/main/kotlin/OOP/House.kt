package OOP

class House(owner:String,number_of_acres: Int, doors:Int, windows:Int, bathrooms:Int, roof_colour:String){
    init {
        println("Owned by $owner")
        println("The house sits on $number_of_acres acres")
        println("It has $doors doors")
        println("$windows windows which are fairly distributed ensure adequate lighting")
        println("The house has $bathrooms large bathrooms")
        println("And a $roof_colour roof")

    }

}

fun main(args: Array<String>) {
    var house_1 = House("Alex Ndegwa",2,10,20,4,"maroon")
    var house_2 = House("Jane Doe",1,6,10,3,"green")
    var house_3 = House("Albert Einstein",2,10,20,4,"black")
    var house_4 = House("Stacy Ervin",15,3,5,2,"brown")
}