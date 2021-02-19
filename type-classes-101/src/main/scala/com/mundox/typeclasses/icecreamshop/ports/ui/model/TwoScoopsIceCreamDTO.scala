package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.TwoScoopsIceCream

final case class TwoScoopsIceCreamDTO(mainFlavor: FlavorDTO,
                                      secondaryFlavor: FlavorDTO)

object TwoScoopsIceCreamDTO {
  def toDomain(iceCream: TwoScoopsIceCreamDTO): TwoScoopsIceCream =
    TwoScoopsIceCream(FlavorDTO.toDomain(iceCream.mainFlavor),
      FlavorDTO.toDomain(iceCream.secondaryFlavor))
}