package com.mundox.typeclasses.icecreamshop.ports.ui.model

final object DTODummies {
  def buildChocolateVanillaCookieIceCream() : IceCreamDTO =
    IceCreamDTO(
      None,
      Some(TwoScoopsIceCreamDTO(FlavorDTO("chocolate"), FlavorDTO("vanilla"))),
      "cup",
      Some(12),
      List(AddonsDTO("cookie"))
    )
}
