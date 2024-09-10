
interface UserProfile{
    fun showDetails():String
    fun updateDetails(name:String,age:Int)
    
}
class UserProfile2(private var name:String, private var age:Int):UserProfile{
    override fun showDetails(): String {
        return "Name: $name, Age: $age"
    }
    override fun updateDetails(name:String,age:Int){
        this.name=name
        this.age=age
        println("Updated Details!!")
    }
}
fun main(){
    val userProfile = UserProfile2("John",23)
    println(userProfile.showDetails())
    
    userProfile.updateDetails("Johney",32)
    println(userProfile.showDetails())
}





















