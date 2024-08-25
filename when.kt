//'when' as an Expression

fun main(){
    val dayOfWeek = 3
    val dayName = when(dayOfWeek){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else ->"Invalid day"
    }
    println("Day of the week is: $dayName")
}

//'when' as a statement
fun main(){
println("Enter a number: ")
    val a=readLine()!!.toInt()
    when{
        a % 2==0 ->println("$a is even")
        a %2 !=0 ->println("$a is odd")
        a == 0 ->println("$a is zero")
        
    }
}