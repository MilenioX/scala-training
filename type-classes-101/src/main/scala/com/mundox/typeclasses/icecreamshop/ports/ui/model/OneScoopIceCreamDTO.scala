package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.OneScoopIceCream

final case class OneScoopIceCreamDTO(mainFlavor: FlavorDTO) extends IceCreamDetailDTO

object OneScoopIceCreamDTO {
  def toDomain(iceCream: OneScoopIceCreamDTO): OneScoopIceCream =
    OneScoopIceCream(FlavorDTO.toDomain(iceCream.mainFlavor))
}
