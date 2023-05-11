object FunctionalProgramming extends App {
  // Scala is OO
  // Create a companion class and instance with property: name, and age -> defined in the apply() method
  class Person(name: String) {
    def apply(age: Int) = println(s"I have aged $age years")
  }
  val bob = new Person("Bob")
  bob.apply(43)
  bob(43)
//  print(bob)

  /* Functional traits
   - Create a Functional trait just like java Functional Interface having an apply method.
   - Write it's short hand.
   - Introduce syntax sugars.
   */
  val simpleIncrement = new Function1[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
  }
  simpleIncrement.apply(23)
  simpleIncrement(23)

  val simpleConcatenate = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }
  simpleConcatenate("I love", " Scala")

  // syntax sugerss
  val doubler: Int => Int = (x: Int) => 2*x
  println(doubler(4))

  /*
   Higher Order Functions
   - generate: (1, 2, 3) -> (2, 4, 6)
   - generate: (1, 2, 3) -> (1, 2, 2, 4, 3, 6)
   - generate: (1, 2, 3, 4, 5) -> (3, 4, 5)
   - generate: (1, 2, 3) -> (1-a, 2-b, 3-c)
   - introduce, for comparisons
   */
  val mappedList = List(1, 2, 3).map(x => x*2)
  val flatMappedList = List(1, 2, 3).flatMap( x => List(x, 2*x))
  val filteredList = List(1, 2, 3, 4, 5).filter(_<= 3)
  val pairedList = List(1, 2, 3).flatMap(number => List('a', 'b', 'b').map(letter => s"$letter-$number"))
  val alternativePair = for {
    number <- List(1, 2, 3)
    letter <- List('a', 'b', 'c')
  } yield s"$number-$letter"

  /*
  Collections
  - lists: (1, 2, 3, 4, 5) -> head, tail, prepend 0, prepend 0 and append 6 to this list
  - sequence: (1, 2, 3) -> 2
  - vector: print (1, 2, 3, 4, 5)
  - set: (1, 2, 3, 4, 1, 2, 3) -> contains(5), set+5, set-3
  - ranges: (1 to 1000) -> (2 to 2000)
  - tuples: print ("Bon Jovi", "Rock", 1982)
  - map: create a phone book using ("Daniel", 6437812), "Jane" -> 327285
   */
  val numbersList = List(1, 2, 3, 4, 5)
  val firstElement = numbersList.head
  val lastElement = numbersList.tail
  val aPrependedList = 0 :: numbersList
  val anExtendedList = 0 +: numbersList :+6

  val aSequence: Seq[Int] = Seq(1, 2, 3) // Seq.apply(1,2,3)
  val accessedElement = aSequence(1) // the element at index 1: 2
  val aVector = Vector(1, 2, 3, 4, 5)

  val aSet = Set(1, 2, 3, 4, 1, 2, 3)
  val setHas5 = aSet.contains(5)
  val anAddedSet = aSet + 5
  val aRemovedSet = aSet - 3

  val aRange = 1 to 1000
  val twoByTwo = aRange.map(x => 2*x)

  val aTuple = ("Bon Jovi", "Rock", 1982)

  val aPhonebook: Map[String, Int] = Map(
    ("Daniel", 6437812),
    "Jane" -> 32
  )
}
