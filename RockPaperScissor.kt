fun main() {
    var player1: String? = null
    var player2: String? = null
    
    println("Rock, Paper, Scissors - Enter your choice:")
    player1 = readLine()?.capitalize() 
    
    val rand = (1..3).random() 
    
    if (rand == 1) {
        player2 = "Rock"
    } else if (rand == 2) {
        player2 = "Paper"
    } else if (rand == 3) {
        player2 = "Scissors"
    }
    
    println("Player 2 chose: $player2") 
    
    val win = when {
        player1 == player2 -> "Draw"
        player1 == "Rock" && player2 == "Scissors" -> "Player 1 wins"
        player1 == "Rock" && player2 == "Paper" -> "Player 2 wins"
        player1 == "Paper" && player2 == "Scissors" -> "Player 2 wins"
        player1 == "Paper" && player2 == "Rock" -> "Player 1 wins"
        player1 == "Scissors" && player2 == "Paper" -> "Player 1 wins"
        player1 == "Scissors" && player2 == "Rock" -> "Player 2 wins"
        else -> "Invalid input"
    }
    
    if (win == "Draw") {
        println("It's a tie!")
    } else {
        println(win)
    }
}
