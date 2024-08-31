open class Parent(var name: String, var age: Int){
    init{
        println("Name: $name")
        println("Age: $age")
    }
}
class MathTeacher(name:String,age: Int): Parent(name,age){
    fun displayInfo(){
        println("Name of the teacher is $name and age is $age")
    }
}
class Footballer(name: String, age: Int):Parent(name,age){
    fun displayInfo1(){
        println("Name of the footballer is $name and their age is $age")
    }
}
fun main(){
    val m = MathTeacher("Ajit",30)
    m.displayInfo()
    println()
    val f=Footballer("Krish",35)
    f.displayInfo1()
}