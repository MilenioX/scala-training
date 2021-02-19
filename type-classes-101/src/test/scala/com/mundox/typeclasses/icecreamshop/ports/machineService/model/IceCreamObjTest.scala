package com.mundox.typeclasses.icecreamshop.ports.machineService.model

import com.mundox.typeclasses.icecreamshop.dummies.IceCreamDummies
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class IceCreamObjTest extends AnyFlatSpec with Matchers {

  "The Ice Cream Obj apply method" should "returns an IceCream Obj with two flavors Object" in {
    val iceCreamObj = IceCreamObj(IceCreamDummies.buildIceCreamTwoFlavorsInACup())
    iceCreamObj.flavors.flavors.size shouldEqual 2
    iceCreamObj.flavors.flavors(0).name shouldEqual "vanilla"
    iceCreamObj.flavors.flavors(1).name shouldEqual "chocolate"
    iceCreamObj.presentation shouldEqual "cup"
    iceCreamObj.size shouldEqual "24"
    iceCreamObj.addons.addons.size shouldEqual 1
    iceCreamObj.addons.addons(0).name shouldEqual "kellogg"
  }

  "The Ice Cream Obj apply method" should "returns an IceCream Obj with one flavors Object" in {
    val iceCreamObj = IceCreamObj(IceCreamDummies.buildIceCreamOneFlavorInACone())
    iceCreamObj.flavors.flavors.size shouldEqual 1
    iceCreamObj.flavors.flavors(0).name shouldEqual "vanilla"
    iceCreamObj.presentation shouldEqual "cone"
    iceCreamObj.size shouldEqual "M"
    iceCreamObj.addons.addons.size shouldEqual 1
    iceCreamObj.addons.addons(0).name shouldEqual "chips"
  }

}
