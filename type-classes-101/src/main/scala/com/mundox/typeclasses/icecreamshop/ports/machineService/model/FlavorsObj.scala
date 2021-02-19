package com.mundox.typeclasses.icecreamshop.ports.machineService.model

import com.mundox.typeclasses.icecreamshop.core.model.{IceCreamType, OneScoopIceCream, TwoScoopsIceCream}

final case class FlavorsObj(flavors: Seq[FlavorObj])

object FlavorsObj {

  def apply(iceCream: IceCreamType): FlavorsObj =
    iceCream match {
      case oneScoop: OneScoopIceCream => FlavorsObj(oneScoop)
      case twoScoops: TwoScoopsIceCream => FlavorsObj(twoScoops)
    }

  def apply(oneScoopIceCream: OneScoopIceCream): FlavorsObj =
    FlavorsObj(Seq(FlavorObj(oneScoopIceCream.mainFlavor)))

  def apply(twoScoopsIceCream: TwoScoopsIceCream): FlavorsObj =
    FlavorsObj(Seq(
      FlavorObj(twoScoopsIceCream.mainFlavor),
      FlavorObj(twoScoopsIceCream.secondaryFlavor)
    ))
}