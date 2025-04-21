package com.company.scalaref.collections

object ListNotes extends App{

  // 1.Add/remove elements
  // Immutable, hence cannot add/remove elements but create a new instance
  // Remove - filter, drop, tail(remove head)
  val list1 = List(1,2,3,4,5)
  println("Initial list")
  println(list1.mkString("|"))

  println("Adding suffix and prefix to the list")
  val templist1 = 0 +: list1 :+ 6
  println(templist1.mkString("|"))

  println("Remove head from list1")
  println(list1.tail.mkString("|"))

  println("Remove first 2 elements from list1 using drop")
  println(list1.drop(2).mkString("|"))

  println("Remove elements < 3 from list1 using filter")
  println(list1.filter(_ < 3).mkString("|"))



  // 2.Append/Diff 2 lists
  val list2 = List(101,102,103,104,105)
  val concatenatedList = list1 ++ list2

  println()
  println("==============================")
  println(s"list1 = ${list1.mkString("|")}")
  println(s"list2 = ${list2.mkString("|")}")
  println("Concatenated list1 and list2")
  println(concatenatedList.mkString("|"))
  println()

  val list3 = List(1,2,3,4)
  val diffList = list1.diff(list3)
  println(s"list1 = ${list1.mkString("|")}")
  println(s"list3 = ${list3.mkString("|")}")
  println("Diff list1 and list3")
  println(diffList.mkString("|"))



  // 3.Access individual elements
  // head, tail, last, init, apply(index), take(n), drop(n)
  println()
  println("==============================")

  println(s"list1 head = ${list1.head}")
  println(s"list1 tail = ${list1.tail.mkString("|")}")
  println(s"list1 last = ${list1.last}")
  println(s"list1 init = ${list1.init.mkString("|")}")
  println(s"list1(0) = ${list1(0)}")
  println(s"list1.take(3) = ${list1.take(3).mkString("|")}")
  println(s"list1.drop(3) = ${list1.drop(3).mkString("|")}")



  // 4.Traverse through the collection
  //for, foreach, map
  println()
  println("==============================")

  println(s"list1 elements using for")
  for(i <- list1) print(i)

  println()
  println(s"list1 elements using foreach")
  list1.foreach(x => print(x))

  println()
  println(s"list1 elements using map")
  list1.map(x => print(x))
  println()



  // 5.Check whether element exists in the collection
  //contains, exists, find(returns Some or None)
  println()
  println("==============================")

  println(s"list1 contains 3 = ${list1.contains(3)}")
  println(s"list1 contains 99 = ${list1.contains(99)}")
  println(s"list1 exists 3 = ${list1.exists(_ == 3)}")
  println(s"list1 exists 99 = ${list1.exists(_ == 99)}")
  println(s"list1 find 3 = ${list1.find(_ == 3)}")
  println(s"list1 find 99 = ${list1.find(_ == 99)}")



  // 6.Size, isEmpty, reverse
  println()
  println("==============================")

  println(s"list1 size = ${list1.size}")
  println(s"list1 isEmpty = ${list1.isEmpty}")
  println(s"list1 reversed = ${list1.reverse.mkString("|")}")



  // 7.Pattern matching
  println()
  println("==============================")

  println("Pattern matching list1")
  list1 match {
    case head :: tail => println(s"A list with head $head and tail as ${tail.mkString("|")}")
    case _ => println("Not a list")
  }

  println()
  println("Pattern matching list1")
  list1 match {
    case List(1, _*) => println(s"List starting with 1")
    case _ => println("Not a list")
  }


  println()
  println()
  println("==============================")
  println("Sequence")
  //Sequence -> Arrays/Lists extended from Seq
  val aSeq = Seq(1,2,3)
  println(s"aSeq.head = ${aSeq.head}")
  println(s"aSeq(0) = ${aSeq(0)}")
  println(s"aSeq.size = ${aSeq.size}")
}
