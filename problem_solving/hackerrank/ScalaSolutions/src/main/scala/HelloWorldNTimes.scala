object HelloWorldNTimes extends App {
  def f(n: Int) = {
    val range = 1 to n
    range.foreach(_ => println("Hello World"))
  }
}

