//  you have a superclass 'Shape' with an open method draw(). 
//  You want to create a subclass 'Circle' that provides its own implementation of the draw() method.
//  How would you define the 'Shape' class and the 'Circle' class to achieve this, and how would you ensure that the draw()
//  method in the 'Circle' class overrides the one in the 'Shape' class?


open class Shape{
    open fun draw(){
      println("This is shape class")  
    }
}
class Circle:Shape(){
    override fun draw(){
        println("This is Circle class")
    }
}
fun main(){

      val s = Shape()
      s.draw()
    val c=Circle()
    c.draw()
}

