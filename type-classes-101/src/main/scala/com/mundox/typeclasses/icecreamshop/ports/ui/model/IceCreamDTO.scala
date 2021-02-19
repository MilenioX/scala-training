package com.mundox.typeclasses.icecreamshop.ports.ui.model

final case class IceCreamDTO(oneScoopIceCream: Option[OneScoopIceCreamDTO],
                             twoScoopsIceCream: Option[TwoScoopsIceCreamDTO],
                             addons: List[AddonsDTO])
