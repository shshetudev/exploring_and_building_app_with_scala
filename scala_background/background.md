# Background

## About Scala
- The name of Scala is derived from word **scalable**.
- Object Oriented and functional programming language.
- Storng static type language.
- Everything is an object whether it is a function or a number.
- Does not have concept of primitive data.
- Runs on JVM.
- Execute Java code.
- Do concurrent & synchronize processing.

## Origin
- It was designed by Martin Odersky which officially released for java platform in early 2004 and for .Net framework in June 2004. Later on, Scala dropped .Net support in 2012.
- Influenced by Java, Haskell, Lisp, Pizza, F#, Fantom, Red etc.
- We can create web application, enterprise application, mobile application, desktop application etc.

## Usage
- Web applications (Play framework).
- Utilities and libraries.
- Data streaming with Akka.
- Parallel batch processing
- Concurrency and distributed application.
- Data analysis with Spark.
- AWS lambda expression.
- Ad hoc scripting in REPL etc.

## Basic Example
```scala
object MainObject {
    def main(args:Array[String]){
        print("Hello Scala")
    }
}
```

## History
- General purpose programming language released by **Martin Odersky** on January 20, 2004.
- Scala is not an extension of Java, but it is completely interoperable with it. While compilation, Scala file translates to Java bytecode and runs on JVM.

## Popularity
- Apple uses Scala in certain terms along with Java and Play framework.
- Google use Scala, mostly due to acquisitions such as Firebase and Nest.
- The Walmart Canada uses Scala for their back end platform.

## Features
- **Type inference**
  - Don't require to mention data type and function return type explicitly.
  - Return type of function is determined by the type of last expression present in the function.
- **Singleton object**
  - There are no static variables and methods.
  - Scala uses singleton object, which is essentially class with only one object in the source file.
  - Singleton object is declared by using object instead of class keyword.
- **Immutability**
  - Each declared variable is immutable by default.
  - Immutable data helps to manage concurrency control which requires managing data.
- **Lazy computation**
  - Computation is by default lazy. Scala evaluates expressions only when they are required.
  - We can declare a lazy variable by using **lazy** keyword which is used to increase performance.
- **Case classes and Pattern matching**
  - Case classes are regular classes which are immutable by default and decomposable through pattern matching. So we can write more logical code.
  - All the parameters listed in the case class are public and immutable by default.
- **Concurrency control**
  - Scala provides standard library which includes the actor model.
  - We can write concurrency code by using actor.
  - Scala provides one more platform and tool to deal with concurrency knwon as Akka.
- **String interpolation**
  - Since scala 2.10.0, it offers a mechanism to create strings from our data. It is called String interpolation.
  - It allows users to embed variable references directly in processed string literals.
- **Higher order function**
  - It is a function that either takes a function as argument or returns a function.
  - In other words we can say a HOF is a function which works with another function.
  - HOF allows us to create function composition, lambda function or anonymous function etc.
- **Traits**
  - Traits is like an interface with a partial implementation. In Trait we can have all abstract methods or some abstract and some non-abstract methods.
  - Traits are compiled into Java interfaces with corresponding impelementation classes that hold any methods implemented in the traits.
- **Rich collection set**
  - It contains classes and traits to collect data. These collections can be mutable or immutable.
  - `Scala.collection.mutable` package contains all the mutable collections and `Scala.collection.immutable` package contains all the immutable collections.