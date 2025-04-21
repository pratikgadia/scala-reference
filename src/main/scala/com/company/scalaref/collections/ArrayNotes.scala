package com.company.scalaref.collections

import scala.collection.mutable.ArrayBuffer

object ArrayNotes extends App{

  // 1.Add/remove elements
  // Array is mutable but size is fixed
  // ArrayBuffer is mutable array where we can append data (mutable array)
  // Remove - filter, drop, diff, slice
  val array1 = Array(1,2,3,4,5)
  println("Initial array1")
  println(array1.mkString("|"))

  println("Appending elements to array1 and creating temparray")
  val temparray1 = array1 :+ 6
  println(temparray1.mkString("|"))

  // Cannot use :- same as :+

  println("Initial arrayBuffer1")
  val arrayBuffer1 = ArrayBuffer(1,2,3,4,5)
  println(arrayBuffer1.mkString("|"))

  println("Appending elements to arrayBuffer1")
  arrayBuffer1 += 6
  println(arrayBuffer1.mkString("|"))

  println("Removing elements from arrayBuffer1")
  arrayBuffer1 -= 1
  println(arrayBuffer1.mkString("|"))

  println("Removing elements < 3 from array1 using filter")
  println(array1.filter(_ < 3).mkString("|"))

  println("Remove first 2 elements from array1 using drop")
  println(array1.drop(2).mkString("|"))

  println("Keeping elements at index 1-3(exclusive) from array1 using slice")
  println(array1.slice(1,3).mkString("|"))



  // 2.Append/Diff 2 arrays
  val array2 = Array(101,102,103,104,105)
  val concatenatedArray = array1 ++ array2

  println()
  println("==============================")
  println(s"array1 = ${array1.mkString("|")}")
  println(s"array2 = ${array2.mkString("|")}")
  println("Concatenated array1 and array2")
  println(concatenatedArray.mkString("|"))

  println()

  val array3 = Array(1,2,3,4)
  val diffArray = array1.diff(array3)
  println(s"array1 = ${array1.mkString("|")}")
  println(s"array3 = ${array3.mkString("|")}")
  println("Diff array1 and array3")
  println(diffArray.mkString("|"))



  // 3.Access individual elements
  // last, init, apply(index), take(n), drop(n)
  println()
  println("==============================")

  println(s"array1 last = ${array1.last}")
  println(s"array1 init = ${array1.init.mkString("|")}")
  println(s"array1(0) = ${array1(0)}")
  println(s"array1.take(3) = ${array1.take(3).mkString("|")}")
  println(s"array1.drop(3) = ${array1.drop(3).mkString("|")}")



  // 4.Traverse through the collection
  //for, foreach, map
  println()
  println("==============================")

  println(s"array1 elements using for")
  for(i <- array1) print(i)

  println()
  println(s"array1 elements using foreach")
  array1.foreach(x => print(x))

  println()
  println(s"array1 elements using map")
  array1.map(x => print(x))
  println()



  // 5.Check whether element exists in the collection
  //contains, exists, find(returns Some or None)
  println()
  println("==============================")

  println(s"array1 contains 3 = ${array1.contains(3)}")
  println(s"array1 contains 99 = ${array1.contains(99)}")
  println(s"array1 exists 3 = ${array1.exists(_ == 3)}")
  println(s"array1 exists 99 = ${array1.exists(_ == 99)}")
  println(s"array1 find 3 = ${array1.find(_ == 3)}")
  println(s"array1 find 99 = ${array1.find(_ == 99)}")



  // 6.Size, isEmpty, reverse
  println()
  println("==============================")

  println(s"array1 size = ${array1.size}")
  println(s"array1 isEmpty = ${array1.isEmpty}")
  println(s"array1 reversed = ${array1.reverse.mkString("|")}")



  // 7.Pattern matching
  println()
  println("==============================")

  println("Pattern matching array1")
  array1 match {
    case Array(1, 2, _* ) => println(s"Array starts with [1,2] and has more elements")
    case _ => println("Not a array starting with [1,2]")
  }



  // 8.Empty Array
  println()
  println("==============================")
  val emptyArray = ArrayBuffer()
  println(s"emptyArray.size = ${emptyArray.size}")



}
