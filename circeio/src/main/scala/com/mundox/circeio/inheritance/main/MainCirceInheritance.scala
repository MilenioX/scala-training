package com.mundox.circeio.inheritance.main

import com.mundox.circeio.inheritance.model.{DTODummies, IceCreamDTO}
import io.circe.generic.auto._
import io.circe.syntax._
import io.circe.parser.{decode, _}

object MainCirceInheritance extends App {

  val iceCream : IceCreamDTO = DTODummies.buildChocolateVanillaCookieIceCream()
  println(s"Your Icecream is:")
  println(s"${iceCream.asJson.noSpaces}")

  val iceCreamOneInput: String = """{"iceCreamDetail":{"mainFlavor":{"name":"vanilla"}},"cup":null,"cone":{"size":"M"},"addons":[{"name":"chips"}]}"""
  val iceCreamTwoInput: String = """{"iceCreamDetail":{"mainFlavor":{"name":"chocolate"},"secondaryFlavor":{"name":"vanilla"}},"cup":{"oz":12},"cone":null,"addons":[{"name":"cookie"}]}"""
  println(s"The construction is")
  for {
    iceCreamOneDTO <- decode[IceCreamDTO](iceCreamOneInput)
    iceCreamTwoDTO <- decode[IceCreamDTO](iceCreamTwoInput)
  } yield {
    println(s"$iceCreamOneDTO")
    println(s"$iceCreamTwoDTO")
  }
}
