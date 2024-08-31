open class Parent(var name:String, var age:Int){
    init{
        println("Name: $name")
        println("Age: $age")
    }
}
class Children(name:String,age:Int):Parent(name,age){
    fun displayInfo(){
        println("Name of the children is $name and age is $age")
    }
}
fun main(){
    val c=Children("karan",19)
    c.displayInfo()
}

