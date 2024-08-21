fun main() {
    print("Enter the number of terms: ")
    val terms = readLine()?.toIntOrNull()

    if (terms == null || terms <= 0) {
        println("Please enter a valid positive integer.")
        return
    }

    var first = 0
    var second = 1

    print("Fibonacci Series: $first $second ")

    for (i in 3..terms) {
        val next = first + second
        print("$next ")
        first = second
        second = next
    }
}
