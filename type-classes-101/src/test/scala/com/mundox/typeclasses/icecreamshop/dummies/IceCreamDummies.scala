package com.mundox.typeclasses.icecreamshop.dummies

import com.mundox.typeclasses.icecreamshop.core.model.{Chips, Chocolate, Cone, Cup, IceCream, Kellogg, OneScoopIceCream, TwoScoopsIceCream, Vanilla}

object IceCreamDummies {

  def buildIceCreamTwoFlavorsInACup(): IceCream =
    IceCream(
      TwoScoopsIceCream(
        Vanilla(),
        Chocolate()),
      Cup(24),
      Seq(Kellogg()))

  def buildIceCreamOneFlavorInACone(): IceCream =
    IceCream(
      OneScoopIceCream(Vanilla()),
      Cone("M"),
      Seq(Chips()))
}
