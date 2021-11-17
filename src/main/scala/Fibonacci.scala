import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Fibonacci {

  def fibonacci(numberOfSequence : Int): mutable.Seq[Int] = {
    var previousNumber: Int = 0
    var currentNumber : Int = 1
    val fibonacciNumbers : ListBuffer[Int] = ListBuffer(previousNumber, currentNumber)
    var nextNumber : Int = 0
    var counter = 1
    while ( counter < numberOfSequence) {
      nextNumber = previousNumber + currentNumber
      fibonacciNumbers.addOne(nextNumber)

      previousNumber = currentNumber
      currentNumber = nextNumber

      counter += 1
    }
    
    fibonacciNumbers

  }
  
}
