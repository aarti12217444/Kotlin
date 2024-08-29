class Person(val name:String, var age:Int){
    val isAdult:  Boolean
    
    init{
        isAdult=age>=18
        println("Inside init block...")
        println("Name: $name")
        println("Age: $age")
        println("isAdult: $isAdult")
    }
    fun printDetails(){
        println("Person's name is $name. Their age is $age")
    }
}
fun main(){
    val p1 = Person("Karan", 19)
    p1.printDetails()
    
    val p2 = Person("Arjun", 20)
    p2.printDetails()
}