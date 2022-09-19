

fun main(args: Array<String>) {
    println("main triggered!")
    getAnimalsNames(100).forEach {
        println(it)
    }
}

fun addOneToNumber(number: Int): Int{
    return number + 1
}

fun getAnimalsNames(numOfAnimals: Int): List<String>{
    return List(10){
        "Animal no. ${it+1}"
    }
}

