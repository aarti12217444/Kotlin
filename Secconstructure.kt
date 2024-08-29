class Person{
    var name:String=""
    var roll:Int=0
    var age:Int=0
    
    constructor(name:String,roll:Int){
        this.name=name
        this.roll=roll
        
        println("name= $name")
        println("roll= $roll")
    }
    constructor(name:String,roll:Int,age:Int){
        this.name=name
        this.roll=roll
        this.age=age
        println("name= $name")
        println("roll= $roll")
        println("age= $age")
    }
}
fun main(){
    // val p0=Person()
    val p1=Person("aarti",57)
    val p2=Person("Aaru",56,19)
}

