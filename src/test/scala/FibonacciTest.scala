import Fibonacci.fibonacci
import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite {

  test("test positive numbers") {
    val list = fibonacci(4)
    assert(list.last == 2)

    val list2 = fibonacci(5)
    assert(list2.last == 3)
  }

}
