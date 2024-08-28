class Student{
    var name: String=""
    var class1: Int=0
    var id: Int=0
    var department: String=""

    fun getInfo(): String{
        return "$name, $class1, $id, $department"
    }
}
fun main(){
    val s=Student()
    s. name="aarti"
    s. class1 = 3
    s. id = 1221890
    s. department="cse"
    
    print(s.getInfo())
}