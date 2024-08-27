fun CtoF(celsius:Double):Double{
    return celsius*9/5 +32
}
fun FtoC(fahrenheit:Double):Double{
    return (fahrenheit-32)*5/9
}
fun main(){
    println("Enter celsius: ")
    var cInput=readLine()!!.toDoubleOrNull()
    println("Enter fahrenheit: ")
    var fInput=readLine()!!.toDoubleOrNull()
    
    if(cInput != null){
        println("$cInput degree C is equal to ${CtoF(cInput)}degree F")
    }
    else{
        println("Invalid input for celsius")
    }
    if(fInput != null){
        println("$fInput degree F is equal to ${FtoC(fInput)}degree C")
    }
    else{
        println("Invalid input for fahrenheit")
    }
}