// ********************************ARITHMENTIC OPERATOR*************************

// fun main(){
//     val a = 9
//     val b = 3
//     val c = a+b 
//     println(c)
//     val d = a-b 
//     println(d)
//     val e = a*b 
//     println(e)
//     val f = a/b 
//     println(f)
//     val g = a%b 
//     println(g)
// }

// **************************************COMPARISON OPERATOR********************

// fun main(){
//     val a = 8
//     val b = 3
//     println(a==b)
//     println(a!=b)
//     println(a>b)
//     println(a>=b)
//     println(a < b)
//     println(a <= b)
// }


// ****************************************LOGICAL OPERATOR*********************

// fun main(){
//     val a = 9
//     val b = 8
//     val c = 10
//     println(a>b && a>c)
//     println(a>b || a < c)
//     println(!(a>b))
// }

// *************************BITWISE OPERATOR************************************

// fun main(){
//     val a = 0b1010
//     val b = 0b1100

//     println(a and b) 
//     println(a or b) 
//     println(a xor b) 
//     println(b.inv()) 
// }


// ***********************ASSIGNMENT OPERATOR***********************************

// fun main(){
//     var a = 10
//     var b = 5
//     a += b 
//     a -= b 
//     a *= b 
//     a /= b 
//     a %= b 
// }


// *******************************RANGE OPERATOR********************************

// fun main(){
//     var range = 1..90
//     print(67 in range)
// }

//*********************************null safety operator*************************

// fun main(){
//     var m : String ?= null
//     print(m ?. length)
// }

//***********************************ELVIS OPERATOR*****************************

// fun main(){
//     var name :  String ?= null
//     print(name ?: "please enter string")
// }

// fun main(){
//     val name : String ?= null
//     print(name ?: "Unknown")
// }

// ********************************ASSERTION OPERATOR***************************

fun main(){
    var str: String ?= "Hello"
    print(str !!. length)
}