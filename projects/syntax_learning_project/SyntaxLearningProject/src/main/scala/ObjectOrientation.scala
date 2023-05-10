/*
We are going to introduce Animal related examples here
 */
// We already have a main method in this class since App has main method, so it will inherit.
object ObjectOrientation extends App {

  val animal = new Animal
  val mini = new Cat("Mini")
  // subtype polymorphism
  val childOfMini: Animal = new Cat("Monti")
  val crocInstance = new Crocodile

  // constructor arguments ar not fields: need to put a val before the constructor argument
  mini.name
  // operators in scala are actually methods
  val addition = 1 + 2
  childOfMini.eat() // the most derived method will be called at runtime
  val scrambledAddition = 1.+(2) // equivalent
  // anonymous classes: behind the scene it actually create a new class say: Carnivore_Anonymous_35728 by extending Animal class
  val dinosaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("Dinosaur is eating")
  }

  // "interface" = 100% abstraction
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  // valid method name which is constructed by ?!
  trait Philosopher {
    def ?!(thought: String): Unit
  }

  // abstract class
  abstract class WalkingAnimal {
    val hasLegs = true // by default public, Scala only have: private and protected

    def walk(): Unit
  }
  crocInstance.eat(childOfMini)
  crocInstance eat childOfMini // infix notation = object method argument, for single argument we can write in this way
  crocInstance ?! "What if we could fly" // invoking a the method which is named as ?! in Philosopher trait

  // class and instance
  class Animal {
    val age: Int = 0

    def eat() = println("This animal is eating")
  }

  // inheritance
  class Cat(val name: String) extends Animal {
    override def eat(): Unit = {
      println(s"The cat named $name is eating")
    }
  } // constructor definition

  // single-class and multi-trait inheritance
  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println(s"Crocodile is eating this animal $animal")

    override def ?!(thought: String): Unit = println(s"I was thinking: $thought")
  }

  // singleton object
  object MySingleton { // the only instance of MySingleton type
    val mySpecialValue = 53278

    def mySpecialMethod(): Int = 5327

    def apply(x: Int): Int = x + 1
  }

  MySingleton.mySpecialMethod()
  MySingleton.apply(65)
  MySingleton(65) // equivalent to MySingleton.apply(65)

  // companions - companion object
  object Animal {
    // companions can access each other's private fields/methods
    // singleton Animal and instances of Animal are different things
    val canLiveIndefinitely = false
  }
  val animalsCanLiveForever = Animal.canLiveIndefinitely // static fields/methods

  /*
   Case classes = lightweight data structures with some boilerplate
   - sensible equals and hash code
   - serialization
   - companion with apply
   - pattern matching
   */
  case class Person(name: String, age: Int)
  val bob = Person("Bob", 54) // Person.apply("Bob", 54)

  // exceptions
  try {
    val x: String = null
    x.length
  } catch {
    case e: Exception => "some faulty error message"
  } finally {
    // execute some code no matter what
  }

  // Generics, we have to define as like [T]
  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
  }

  // using a generic with a concrete type
  val integers: List[Int] = List(1,2,3) // List.apply(1,2,3)
  val first = integers.head
  val rest = integers.tail
  val greetingList = List("hello", "Scala")
  val firstString = greetingList.head

  // Point #1: In Scala we usually operate with IMMUTABLE values/objects
  // Any modification to an object must return ANOTHER object
  /*
  Benefits:
  1. works miracle in multithreaded/distributed env
  2. helps making sense of the code ("reasoning about")
   */
  val reversedList = integers.reverse // returns a NEW list

  // Point #2: Scala is the closet to the OO ideal
  // todo: Add generics code
}
