// fun main(){
//     println("Welcome in KRISHNA Bank....")
//     print("Enter your Initial balance: ")
//     var iBal =readLine()!!.toInt()
//     var a = true
    
//     while(a){
    
//     print("Dear shriman/Shrimati ji, Please enter withdrawing amount from your current balance: ")
//     val withdraw = readLine()!!.toInt()
//         if(withdraw>iBal){
//             println("Insufficient balance $iBal. Thank you")
//         }
//         else{
//             iBal -= withdraw
//             println("Withdraw successful. Your new balance is $iBal. Thank you")
//         }
        
//         print("Are you want to make another withdraw(yes/no)?: ")
//         val result = readLine()!!
        
//         if(result.lowercase() != "yes"){
//             a = false
//             println("Thank you for using my service.Please come again to use my servise!!")
//         }
//     }
    
// }

fun main()
 {   
 var bal = 1000  
 var withdraw: Int    
 var cont: String    
do {        
    println("Your current balance is: $bal")
    println("Enter amount to withdraw: ")
    withdraw = readLine()?.toInt() ?: 0
         if (withdraw <= bal) {  
             bal -= withdraw 
            println("Withdrawal successful! New balance: $bal")       
         } else {
           println("Insufficient balance!")
        }
    println("Do you want to make another withdrawal? (yes/no): ")
    cont = readLine() ?: "no"    } 
while(cont.equals("yes", ignoreCase = true))
    println("Thank you for using our service!")
}