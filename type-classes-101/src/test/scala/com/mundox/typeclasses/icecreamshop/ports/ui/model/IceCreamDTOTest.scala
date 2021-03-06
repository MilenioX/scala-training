package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.{Cone, Cup, OneScoopIceCream, TwoScoopsIceCream}
import com.mundox.typeclasses.icecreamshop.dummies.IceCreamDTODummies
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class IceCreamDTOTest extends AnyFlatSpec with Matchers {

  "The Ice Cream DTO toDomain method" should "returns an IceCream with two flavors Object" in {
    val result = IceCreamDTO.toDomain(IceCreamDTODummies.buildChocolateVanillaCookieIceCream())
    result match {
      case Right(iceCream) => {
        iceCream.iceCreamType match {
          case _: OneScoopIceCream => fail()
          case ic: TwoScoopsIceCream => {
            ic.mainFlavor.name shouldEqual "chocolate"
            ic.secondaryFlavor.name shouldEqual "vanilla"
          }
        }
        iceCream.presentation match {
          case _: Cone => fail()
          case cup: Cup => {
            cup.oz shouldEqual 12
          }
        }
        iceCream.addons.length shouldEqual 1
        iceCream.addons(0).name shouldEqual "cookie"
      }
      case Left(_) => fail()
    }
  }

  "The Ice Cream DTO toDomain method" should "returns an IceCream with one flavor Object" in {
    val result = IceCreamDTO.toDomain(IceCreamDTODummies.buildTuttiFruitWithChipsInACone())
    result match {
      case Left(_) => fail()
      case Right(iceCream) => {
        iceCream.iceCreamType match {
          case _: TwoScoopsIceCream => fail()
          case ic: OneScoopIceCream => {
            ic.mainFlavor.name shouldEqual "tutti fruit"
          }
        }
        iceCream.presentation match {
          case _: Cone => succeed
          case _: Cup => fail()
        }
        iceCream.addons.length shouldEqual 1
        iceCream.addons(0).name shouldEqual "chips"
      }
    }
  }

  "The Ice Cream DTO toDomain method" should "returns an String with an Alert" in {
    val result = IceCreamDTO.toDomain(IceCreamDTODummies.buildNoFlavorWithKellogInACup())
    println(result)
    result match {
      case Right(_) => fail()
      case Left(error) => {
        error shouldEqual "Select an Ice Cream presentation please"
      }
    }
  }
}