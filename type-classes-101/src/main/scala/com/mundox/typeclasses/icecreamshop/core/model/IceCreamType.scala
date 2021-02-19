package com.mundox.typeclasses.icecreamshop.core.model

sealed trait IceCreamType

case class OneScoopIceCream(mainFlavor: Flavor)
  extends IceCreamType

case class TwoScoopIceCream(mainFlavor: Flavor,
                            secondaryFlavor: Flavor)
  extends IceCreamType