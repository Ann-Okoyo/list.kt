fun main() {
    val heights = listOf(5,4,6,7)
   println(heights.average())
    tall()
    createPersonObject()
    createObjectCar()
//    val crew=listOf("sumi","sumi1","sumi2","sumi3","sumi4")
//    val hope=evenIndices(crew)
//    println(cery)







}
//fun evenIndices(strings: List<String>): List<String> {
//    val answer = mutableListOf<String>()
//    for (z in strings.indices step 2) {
//        answer.add(strings[z])
//    }
//    return answer



fun tall(){
    val heights = listOf(5,4,6,7)
    var sum = 0
    for(height in heights){
        sum +=height
    }
    println(sum)
}
data class Person(var name:String , var age :Int , var height:String, var weight:String)

fun createPersonObject(){
    val person1 = Person("Ann",20,"5.5 feet","54kg")
    val person2 = Person("Charles",22,"7 feet","70kg")
    val person3 = Person("Jeff",16,"7 feet","68kg")
    val person4 = Person("Omar",28,"6 feet","69kg")

    var person = listOf(person1,person2,person3,person4)
    println(person)

    var write = person.sortedByDescending { person->person.age }
    println(write)




}

data class Car (var name:String , var registration:String , var mileage:Double)

fun createObjectCar(){
    var car1 = Car("Porsche","KCA714",41.6)
    var car2 = Car("BMW","KDC814",22.48)
    var car3 = Car("Mercedes","KDB714",23.00)

    var car = listOf(car1,car2,car3)
    println(car)

    var gari = listOf(41.6,22.48,23.00)
    println(gari.average())




}