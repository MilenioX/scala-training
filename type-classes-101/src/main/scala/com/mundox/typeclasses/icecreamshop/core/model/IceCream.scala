package com.mundox.typeclasses.icecreamshop.core.model

case class IceCream(iceCreamType: IceCreamType,
                    presentation: IceCreamPresentation,
                    addons: Seq[Addons])
