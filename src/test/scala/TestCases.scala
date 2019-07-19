
import org.scalatest.WordSpec
class TestCases extends WordSpec {

  val calculator = new Calculator(4,2)


  "Calculation" should {
    "addition of number1 and number2" in {
      assert(calculator.addition == 6)
    }
    "substraction of number1 and number2" in {
      assert(calculator.substraction == 2)
    }
    "Multipliucation of number1 and number2" in {
      assert(calculator.multiplication == 8)
    }
    "Division of number1 and number2" in {
      assert(calculator.division == 2)
    }



  }
}
