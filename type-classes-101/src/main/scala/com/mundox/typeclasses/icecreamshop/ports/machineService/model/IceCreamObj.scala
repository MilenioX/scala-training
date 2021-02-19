package com.mundox.typeclasses.icecreamshop.ports.machineService.model

import com.mundox.typeclasses.icecreamshop.core.model.{Cone, Cup, IceCream, IceCreamPresentation}

final case class IceCreamObj(flavors: FlavorsObj,
                             presentation: String,
                             sizeCup: Int,
                             addons: AddonsListObj)

object IceCreamObj {
  def apply(iceCream: IceCream): IceCreamObj =
    IceCreamObj(
      FlavorsObj(iceCream.iceCreamType),
      getPresentation(iceCream.presentation)._1,
      getPresentation(iceCream.presentation)._2,
      AddonsListObj(iceCream.addons.map(addons => AddonsObj(addons)))
    )

  def getPresentation(presentation: IceCreamPresentation): (String,Int) =
    presentation match {
      case cup: Cup => ("cup", cup.size)
      case _: Cone => ("cone", 0)
    }
}