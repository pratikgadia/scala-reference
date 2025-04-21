package com.company.scalaref.collections

import scala.collection.mutable

object MapNotes extends App{

  // 1.Add/remove elements
  // Map is immutable key-value pair by default
  // Map() + (key -> value), Map() - key, Map += (k -> v), Map -= k
  val map1 = Map((1, "Sehwag")
                ,(2,"Gambhir")
                ,3 -> "Rahul"
                ,4 -> "Sachin")
  println("Initial map1")
  println(map1.mkString("|"))
  println()

  println("Appending element to map1 and creating tempmap1")
  val tempmap1 = map1 +  (5 -> "VVS")
  println(tempmap1.mkString("|"))
  println()

  println("Appending elements to map1 and creating tempmap11")
  val tempmap11 = map1 +  (5 -> "VVS", 6 -> "Mongia")
  println(tempmap11.mkString("|"))
  println()

  println("Removing elements from map1 and creating tempmap2")
  val tempmap2 = map1 -  (1, 2, 3)
  println(tempmap2.mkString("|"))
  println()

  println("Removing single element from map1 and creating tempmap3")
  val tempmap3 = map1 -  1
  println(tempmap3.mkString("|"))
  println()

  println("Initial mutable map1")
  val mutableMap1 = scala.collection.mutable.Map((1, "Hayden")
                                                 ,(2,"Katich")
                                                 ,3 -> "Ponting"
                                                 ,4 -> "Martyn")
  println(mutableMap1.mkString("|"))
  println()

  println("Appending element to mutableMap1")
  mutableMap1 += (5 -> "Clarke", 6 -> "Symonds")
  println(mutableMap1.mkString("|"))
  println()

  println("Removing element from mutableMap1")
  mutableMap1 -= (1,2,3)
  println(mutableMap1.mkString("|"))
  println()



  // 2.Append/Diff 2 maps
  val map2 = Map((5, "VVS")
                 ,(6, "Dhoni")
                 ,7 -> "Irfan")
  val concatenatedMap = map1 ++ map2

  println()
  println("==============================")
  println(s"map1 = ${map1.mkString("|")}")
  println(s"map2 = ${map2.mkString("|")}")
  println("Concatenated map1 and map2")
  println(concatenatedMap.mkString("|"))

  println()
  val map3 = Map((1, "Sehwag")
                 ,(2,"Gambhir")
                 ,3 -> "Rahul")
  val diffMap = map1 -- map3.keys

  println()
  println(s"map1 = ${map1.mkString("|")}")
  println(s"map3 = ${map3.mkString("|")}")
  println("Diff map1 and map3")
  println(diffMap.mkString("|"))



  // 3.Access individual elements
  // apply(key), get(key), .keys, .values, map, collect
  println()
  println("==============================")

  println(s"map1(1) = ${map1(1)}")
  println(s"map1.get(1) = ${map1.get(1)}")
  println(s"map1.get(1).get = ${map1.get(1).get}")

  val filterList = List(1,2)
  println(s"filterList.map(x => map1(x)) = ${filterList.map(x => map1(x))}")
  println(s"filterList.collect =")
  val filteredListCollect = map1.collect {
    case (k, v) if filterList.contains(k) => (k, v)
  }
  println(filteredListCollect)
  println()
  // collect is useful when you want to both filter and transform elements in a collection

  val map1Keys = map1.keys.toList
  val map1Values = map1.values
  println(s"map1 keys = ${map1Keys}")
  println(s"map1 values = ${map1Values}")



  // 4.Traverse through the collection
  //for, foreach, map
  println()
  println("==============================")

  println(s"map1 elements using for")
  for(i <- map1) print(i)

  println()
  println(s"map1 elements using foreach")
  map1.foreach(x => print(x))

  println()
  println(s"map1 elements using map")
  map1.map(x => print(x))
  println()

  println(s"map1 elements using for")
  for((k,v) <- map1) print(s"Key = $k with value = $v \n")
  println()


  // 5.Check whether element exists in the collection
  //contains, get
  println()
  println("==============================")

  println(s"map1 contains 3 = ${map1.contains(3)}")
  println(s"map1.get(1) = ${map1.get(1)}")
  println(s"map1 values contains Sachin = ${map1.values.toList.contains("Sachin")}")
  println(s"map1 values contains Kumble = ${map1.values.toList.contains("Kumble")}")



  // 6.Size, isEmpty
  println()
  println("==============================")

  println(s"map1 size = ${map1.size}")
  println(s"map1 isEmpty = ${map1.isEmpty}")



  // 7.Pattern matching
  println()
  println("==============================")

  println("Pattern matching map1")
  for(i <- map1) //println(i)
  {
    i match {
      case (k, v) => println(s"Key = $k, value = $v")
      case _ => println("Something else")
    }
  }



  // 8.Create empty map
  println()
  println("==============================")
  val emptyMap = Map.empty
  println(s"emptyMap.size = ${emptyMap.size}")

}
