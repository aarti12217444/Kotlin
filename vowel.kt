// Kotlin Program to Check Whether an Alphabet is Vowel or Consonant

fun main(){
    println("Enter a character: ")
    val a = readLine()?.first()
    if(a != null){
        if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')){
            if(a == 'e' || a == 'a' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
                println("$a is a vowel")
            }else{
                println("$a is a consonant")
            }
        }else{
            println("$a is not a letter")
        }
    }else{
        println("No input provided")
    }
}