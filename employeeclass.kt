class Employee{
    var name: String=""
    
    var id: Int=0
    var department: String=""

    fun getInfo(): String{
        return "$name,  $id, $department"
    }
}
fun main(){
    val e=Employee()
    
    print("Enter employee name: ")
    var a=readLine()?:""
    
    print("Enter employee id: ")
    var b=readLine()!!.toInt()
    
    print("Enter employee department: ")
    var c=readLine()?:""
    
    e.name=a 
    e.id=b 
    e.department=c 
    
    print(e.getInfo())
    
    
    
}