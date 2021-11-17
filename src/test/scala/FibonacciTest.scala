import Fibonacci.fibonacci
import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite {

  test("test positive numbers") {
//    val list = fibonacci(4)
    assert(fibonacci(8) == 20)
  }

}
