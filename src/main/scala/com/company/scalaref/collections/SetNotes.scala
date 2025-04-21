package com.company.scalaref.collections

object SetNotes extends App{

  // 1.Add/remove elements
  // Set is collection of unique elements
  val set1 = Set(1,1,2,2,3,3,4,4,5,5)
  println("Initial set1")
  println(set1.mkString("|"))
  println()

  println("Appending element to set1 and creating tempset")
  val tempset1 = set1 +  (6,7,8,9)
  println(tempset1.mkString("|"))
  println()

  println("Removing elements from set1 and creating tempset")
  val tempset2 = set1 -  (1, 2, 3)
  println(tempset2.mkString("|"))
  println()

  println("Initial mutable set1")
  val mutableSet1 = scala.collection.mutable.Set(1,2,3,4,5)
  println(mutableSet1.mkString("|"))
  println()

  println("Appending element to mutableSet1")
  mutableSet1 += (6,7,8,9)
  println(mutableSet1.mkString("|"))
  println()

  println("Removing element from mutableSet1")
  mutableSet1 -= (1,2,3,4,5)
  println(mutableSet1.mkString("|"))
  println()



  // 2.Append/Diff 2 maps
  val set2 = Set(101,102,103,104,105)
  val concatenatedSet = set1 ++ set2

  println()
  println("==============================")
  println(s"set1 = ${set1.mkString("|")}")
  println(s"set2 = ${set2.mkString("|")}")
  println("Concatenated set1 and set2")
  println(concatenatedSet.mkString("|"))

  println()
  val set3 = Set(1,2,3)
  val diffSet = set1 -- set3

  println()
  println(s"set1 = ${set1.mkString("|")}")
  println(s"set3 = ${set3.mkString("|")}")
  println("Diff set1 and set3")
  println(diffSet.mkString("|"))



  // 3.Access individual elements
  // Set is an unordered collection hence can iterate over elements
  // for, foreach, contains, exists, find
  // toList/toSeq and then apply(index), filter()

  // Set operations : UNION, INTERSECT, DIFF
  println()
  println("==============================")

  val opSet1 = Set(1,2,3)
  val opSet2 = Set(1,88,99)
  println(s"opSet1 = ${opSet1.mkString("|")}")
  println(s"opSet2 = ${opSet2.mkString("|")}")
  println(s"opSet1.union(opSet2) = ${opSet1.union(opSet2)}")
  println(s"opSet1.intersect(opSet2) = ${opSet1.intersect(opSet2)}")
  println(s"opSet1.diff(opSet2) = ${opSet1.diff(opSet2)}")




  // 4.Traverse through the collection
  //for, foreach, map
  println()
  println("==============================")

  println(s"set1 elements using for")
  for(i <- set1) print(i)

  println()
  println(s"set1 elements using foreach")
  set1.foreach(x => print(x))

  println()
  println(s"set1 elements using map")
  set1.map(x => print(x))
  println()



  // 5.Check whether element exists in the collection
  //contains, find, exists
  println()
  println("==============================")

  println(s"set1 contains 3 = ${set1.contains(3)}")
  println(s"set1 contains 99 = ${set1.contains(99)}")
  println(s"set1 exists 3 = ${set1.exists(_ == 3)}")
  println(s"set1 exists 99 = ${set1.exists(_ == 99)}")
  println(s"set1 find 3 = ${set1.find(_ == 3)}")
  println(s"set1 find 99 = ${set1.find(_ == 99)}")



  // 6.Size, isEmpty
  println()
  println("==============================")

  println(s"set1 size = ${set1.size}")
  println(s"set1 isEmpty = ${set1.isEmpty}")



  // 7.Pattern matching
  println()
  println("==============================")



  // 8.Empty set
  println()
  println("==============================")
  val emptySet = Set()
  println(s"emptySet.size = ${emptySet.size}")
}
