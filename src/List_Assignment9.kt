fun evenIndices(names:List<String>):List<String>{
    var evenNames= mutableListOf<String>()
    for (name in names){
        if (names.indexOf(name)%2==0){
            evenNames.add(name)
        }
    }
    return evenNames
        }
data class ListOfHeight(var average: Double,var sum:Double)
fun heightOfPeople(height:List<Double>):ListOfHeight{
    var totalSum= height.sum()
    var mean= height.average()
    var meanSum= ListOfHeight(totalSum,mean)
    return meanSum
}
data class Person(var name:String, var age:Int,var height: Double, var weight: Double)
fun sortedAge() {

    var people = listOf(
        Person("Celine", 22, 1.55, 59.0),
        Person("Belyse", 19, 1.70, 72.5),
        Person("Sarah", 18, 1.64, 52.6)
    )
    var sortedDesc = people.sortedByDescending { person -> person.age }
    println(sortedDesc)
}

fun addPeople(){
    var humanBeing= mutableListOf(
        Person("Celine", 22, 1.55, 59.0),
        Person("Belyse", 19, 1.70, 72.5),
        Person("Sarah", 18, 1.64, 52.6)
    )
    humanBeing.addAll(listOf(
        Person("Charline",24,1.50,64.0),
        Person("Pacis",26,1.82,84.0)
    ))
    println(humanBeing)
}

data class Car(var registration:String,var mileage:Int)
fun carReg(vehicles:List<Car>):Int {
    var sum= 0
    vehicles.forEach {car -> sum+=car.mileage}
    return sum/vehicles.size
}
fun main() {
    println(evenIndices(mutableListOf("Kotlin","Pthon","Celine","Kay","Nadine","Pamela","Louise","Apple","Google","Silcon Valley")))
    var personHeight= listOf(1.60,1.55,1.49,1.53,1.72,1.80)
    println(personHeight.sum())
    println(personHeight.average())
    sortedAge()
    addPeople()
    var matatu= listOf(
        Car("KGR 798",78),
        Car("RAB 544E",120),
        Car("KCP 310",60),
        Car("83D 424",90)
    )
    println(carReg(matatu))
}


