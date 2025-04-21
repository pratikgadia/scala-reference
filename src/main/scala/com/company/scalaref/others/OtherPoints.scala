package com.company.scalaref.others

object OtherPoints extends App{

  // 1.A higher-order function that returns a function
  def multiplyBy(factor: Int): (Int, Int) => Int = {
    // The returned function multiplies its input by the factor
    (x: Int, y:Int) => x * factor
  }

  val multiplyBy2 = multiplyBy(2)  // Returns a function that multiplies by 2
  val multiplyBy3 = multiplyBy(3)  // Returns a function that multiplies by 3

  println("A higher-order function that returns a function")
  println("================================================")
  println(s"multiplyBy2(5, 99999) = ${multiplyBy2(5, 10)}")  // Output: 10 (5 * 2)
  println(s"multiplyBy3(5, 99999) = ${multiplyBy3(5, 10)}")  // Output: 15 (5 * 3)




  // 2.Pure function
  //The function add takes two integers, a and b, as input and returns their sum.
  //This function is pure because:
  //It always produces the same result (sum of a and b) for the same input values.
  //It has no side effects, meaning it doesn't modify any external state, variables, or I/O operations.
  // It only computes a value based on its input arguments and returns that value.

  //Impurity Introduced by println
  //A println statement causes side effects because it interacts with the external environment (the console) and produces output that is not part of the function's return value.
  //The presence of side effects (like printing to the console) violates the definition of a pure function.
  println()
  println("A pure function: Always return same result, no side-effect")
  println("================================================")

  // A pure function that adds two numbers
  def add(a: Int, b: Int): Int = {
    a + b
  }

  println(s"add(2, 3) = ${add(2, 3)}")  // Output: 5
  println(s"add(2, 3) = ${add(2, 3)}")  // Output: 5 (always the same output for the same inputs)




  // 3.foldLeft
  // foldLeft is a higher-order function that allows you to process a collection and accumulate a result.
  // It iterates through the collection from left to right, applying a function to each element and an accumulator (starting with an initial value).
  // It returns a single result after processing all elements.
  println()
  println("foldLeft example")
  println("================================================")

  val numbers = List(1, 2, 3, 4, 5)
  val sumOfNumbers = numbers.foldLeft(0)((acc, num) => acc + num)

  //foldLeft is called with:
  //An initial accumulator value of 0 (this is the starting point of the sum).
  //A function (acc, num) => acc + num that adds each element (num) of the list to the accumulator (acc).

  println("foldLeft for summation of numbers from 1 to 5")
  println(s"sumOfNumbers = ${sumOfNumbers}")  // Output: 15

  println()
  println("foldLeft for List reversal")
  val listToBeReversed = List(1,2,3,4,5)
  val reversedList = listToBeReversed.foldLeft(List[Int]()) {
    (l, num) => num :: l
  }
  println(s"listToBeReversed = ${listToBeReversed.mkString("|")}")
  println(s"reversedList = ${reversedList.mkString("|")}")
}
