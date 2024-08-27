
fun main() {
    print("Enter a number: ")
    var a = readLine()!!.toInt()
    var result = fact1(a)
    println(result)
}

fun fact1(a: Int): Int {
    if (a <= 1) {
        return a
    } else {
        return a * fact1(a - 1)
    }
}
