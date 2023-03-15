fun main(){

    numbers()
    println(humans(arrayOf("Nancy","Wawasi","Juliana")))
    robot(12)
    robot(4)
    robot(20)

    multiples()


}

//Create a function that prints out all the odd numbers between 1 and 100
fun numbers(){
    for(number in 1..100)
        if (number%2 !=0){
            println(number)
        }
}


//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun humans(names: Array<String>): Int{
    var num = 0
    names.forEach{ name ->
        if (name.length>5)
            num ++
    }
    return num
}



//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of orange. Everybody
//else gets a bottle of . Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)

//fun robot(age:Int){
//    if (age<6){
//        println("Glass of milk")
//    }
//    else if (age<15 && age>6){
//        println("Bottle of fanta orange")
//    }
//    else {
//        println("Bottle of coca cola")
//    }

fun robot(age:Int) {
    when (age) {
        in 0..5 -> println("milk")
        in 6..15 -> println("fanta orange")
        else -> println("cocacola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

    fun multiples() {
        for (num in 1..100) {
            if (num % 3 == 0 && num % 5 == 0) {
                println("FizzBuzz")
            } else if (num % 3 == 0) {
                println("Fizz")
            } else if (num % 5 == 0) {
                println("Buzz")
            }else{
                println(num)
            }
        }
    }



