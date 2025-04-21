package com.company.scalaref.collections

object TupleNotes extends App{

  // 1.Add/remove elements
  // Tuple is immutable, fixed-size, ordered collection of heterogeneous elements
  // Tuple extends Product trait

  val tuple1 = (1, "Sachin", 10)
  val tuple2 = (2, "Sourav", 99)
  println("Initial map1")
  println(tuple1.toString())
  println(tuple2.toString())
  println()

  println("Appending element to tuple1 and creating temptuple")
  val temptuple1 = (tuple1._1, tuple1._2, tuple1._3, 200)
  println(temptuple1.toString())
  println()

  println("Removing element from tuple1 and creating temptuple1")
  val temptuple2 = (tuple1._1, tuple1._2)
  println(temptuple2.toString())
  println()

  println("Adding element to a tuple dynamically")
  def addElementToTuple[T](tuple: Product, element: T): Product = {
    tuple.productIterator.toList :+ element
  }
  val newTuple = addElementToTuple(tuple1, 200)
  println(s"tuple1 = ${tuple1.toString()}")
  println(s"newTuple = ${newTuple.toString()}")
  println(s"newTuple.getClass.getName = ${newTuple.getClass.getName}")
  println(s"tuple1.getClass.getName = ${tuple1.getClass.getName}")
  println()



  // 2.Append/Diff 2 maps
  // Access individual elements from both and then append/diff
  // Convert it to list and return appended lists



  // 3.Access individual elements
  // ._x
  println()
  println("==============================")

  println(s"tuple1._1 = ${tuple1._1}")
  println(s"tuple1._2 = ${tuple1._2}")
  println(s"tuple1._3 = ${tuple1._3}")



  // 4.Traverse through the collection
  // for, foreach, map - tuple.productIterator
  println()
  println("==============================")

  println(s"tuple1 elements using for")
  for(i <- tuple1.productIterator) print(i)

  println()
  println(s"tuple1 elements using foreach")
  tuple1.productIterator.foreach(x => print(x))
  println()



  // 5.Check whether element exists in the collection
  // exists, pattern matching
  // convert to List/Seq and apply contains/filter
  println()
  println("==============================")

  println(s"tuple1 exists Sachin = ${tuple1.productIterator.exists(_ == "Sachin")}")
  println(s"tuple1 contains Sachin using toList = ${tuple1.productIterator.toList.contains("Sachin")}")



  // 6.Size, isEmpty
  println()
  println("==============================")

  println(s"tuple1 size = ${tuple1.productIterator.toList.size}")
  println(s"tuple1 isEmpty = ${tuple1.productIterator.toList.isEmpty}")



  // 7.Pattern matching
  println()
  println("==============================")

  println("Pattern matching tuple1")
  tuple1 match {
      case (num, "Sachin", jerseynum) => println(s"This is Sachin batting at no. $num")
      case (num, name, jerseynum) => println(s"This is $name batting at no. $num")
      case _ => println("Something else")
    }

  println()
  println("Pattern matching tuple2")
  tuple2 match {
    case (num, "Sachin", jerseynum) => println(s"This is Sachin batting at no. $num")
    case (num, name, jerseynum) => println(s"This is $name batting at no. $num")
    case _ => println("Something else")
  }

  println()



  // Range
  println()
  println("==============================")

  val r1 = 1 to 10
  val r2 = 1 until 4
  val r2ToList = r2.map(x => x*x).toList
  println(s"r2 = $r2")
  println(s"""r2ToList.mkString("|") = ${r2ToList.mkString("|")}""")

}
