fun main() {
    var age = 0

    println("Please enter your age as a whole number: ")
    age = readln().toInt()
    if(age in 18..39) {
        println("You can go into the club!")
    }
    else if(age >= 40) {
        println("You cannot go into the club, please go home!")
    }
    else {
        println("You are too young to go into the club!")
    }
}