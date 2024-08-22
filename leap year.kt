// Kotlin Program to Check Leap Year
fun main(){
    println("Enter year: ")
    val a = readLine()!!.toInt()
    if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)){
        println("a leap year")
    }else{
        println("not a leap year")
    }
}