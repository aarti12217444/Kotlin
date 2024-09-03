interface Animal{
    val name:String
    
    fun sound():String{
        return "I am an animal"
    }
}
class Dog : Animal{
    override val name:String="Dog"
    override fun sound(): String{
        return "Bark"
    }
}
class Cat : Animal{
    override val name: String="Cat"
    override fun sound(): String{
        return "Meow"
    }
}
fun main(){
    // a=Animal()
    // a.sound()
    
    val d = Dog()
    println(d.sound())
    
   val c = Cat()
   println(c.sound())
}