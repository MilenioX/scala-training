package com.mundox.typeclasses.icecreamshop.ports.ui.model

final object DTODummies {
  def buildChocolateVainillaCookieIceCream() : IceCreamDTO =
    IceCreamDTO(
      None,
      Some(TwoScoopsIceCreamDTO(FlavorDTO("chocolate"), FlavorDTO("vanilla"))),
      List(AddonsDTO("cookie"))
    )
}
