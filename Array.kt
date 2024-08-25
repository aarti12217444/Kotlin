//Multidimension Arrays

fun main() 
{
 // Creating a 2D array (matrix)
 val matrix: Array<Array<Int>> = arrayOf( arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9) )
println("Element at row 3, column 2: ${matrix[3][2]}")
}

//addition of 2 array
fun main(){
    val matrix1: Array<Array<Int>> = arrayOf( arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9) )
    val matrix2: Array<Array<Int>> = arrayOf( arrayOf(11, 12, 13), arrayOf(14, 15, 16), arrayOf(17, 18, 19) )
    // println("after addition in array: ${matrix1 + matrix2}")
     // Matrix addition
    val result = Array(3) { Array(3) { 0 } } // Initialize a 3x3 array with zeros

    for (i in matrix1.indices) {
        for (j in matrix1[i].indices) {
            result[i][j] = matrix1[i][j] + matrix2[i][j]
        }
    }

    println("After addition in array:")
    for (row in result) {
        println(row.joinToString(" "))
    }
}