import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Fibonacci extends App {

  def fibonacci(numberOfSequence : Int): mutable.Seq[Int] = {
    var previousNumber: Int = 0
    var currentNumber : Int = 1

    if (numberOfSequence == 1) {
      val fibonacciNumbers : ListBuffer[Int] = ListBuffer(previousNumber)
      fibonacciNumbers
    }
    else {
      val fibonacciNumbers : ListBuffer[Int] = ListBuffer(previousNumber, currentNumber)
      var nextNumber : Int = 0
      var counter = 1
      while ( counter < numberOfSequence - 1) {
        nextNumber = previousNumber + currentNumber
        fibonacciNumbers.addOne(nextNumber)

        previousNumber = currentNumber
        currentNumber = nextNumber

        counter += 1
      }

      fibonacciNumbers

    }

  }

  println(fibonacci(8))
  
}
