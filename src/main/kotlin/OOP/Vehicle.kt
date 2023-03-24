//Classes always have to start with a capital
package OOP

class Vehicle(owner:String, color:String, wheels:Int, model:String, ) {
    init {
        println("Owned by $owner")
        println("Color is $color")
        println("Has $wheels wheels in total")
        println("Model is $model")
    }


}

fun main(args: Array<String>) {
    var owner_1 = Vehicle("Sharon","red",4,"Mercedes")
    var owner_2 = Vehicle("Alex","green",4,"Porshe Cayenne")
    var owner_3 = Vehicle("Eve","blue",6,"Toyota")
    var owner_4 = Vehicle("Rebekah","grey",8,"Isuzu")
}