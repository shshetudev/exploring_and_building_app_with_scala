
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

object Advanced extends App {

  // lazy evaluation
  lazy val aLazyValue = 2
  lazy val lazyValueWithSideEffect = {
    println("I am so very lazy!")
    43 // last value to be assigned in the variable
  }
  val eagervalue = lazyValueWithSideEffect + 1
  val anOption = Option(methodWhichCanReturnNull())
  // option = "collection" which contains at most one element: Some(Value) or None
  val stringProcessed = anOption match {
    case Some(string) => s"I have obtained a valid string: $string"
    case None => "I obtained nothing"
  }
  val aTry = Try(methodWhichCanThrowException())
  val anotherStringProcessing = aTry match {
    case Success(validValue) => s"I have obtained a valid string: $validValue"
    case Failure(exception) => s"I have obtained an exceptin: $exception"
  }
  /**
   * - Evaluate something on another thread
   * - asynchronous programming
   */
  val aFuture = Future({
    println("Loading...")
    Thread.sleep(1000)
    println("I have completed a value.")
    67
  })
  // a try = "collection" with either a value if the code went well, or an exception

  // pseudo-collections: Option, Try
  def methodWhichCanReturnNull(): String = "hello, Scala"

  // map, flatMap, filter
  def methodWhichCanThrowException(): String = throw new RuntimeException

  //future is a collection which contains a value when it's evaluated
  //future is composable with map, flatMap and filter

  /**
   * Implicit basics
   */

  // #1: implicit arguments
  def aMethodWithImplicitArgs(implicit arg: Int) = arg + 1

  implicit val myImplicitInt = 46
  println(aMethodWithImplicitArgs) // aMethodWithImplicitArgs(myImplicitInt)

  // #2: implicit conversions
  implicit class MyRichInteger(n: Int) {
    def isEven() = n % 2 == 0
  }

  print(23.isEven()) // new MyRichInteger(23).isEven()
}
