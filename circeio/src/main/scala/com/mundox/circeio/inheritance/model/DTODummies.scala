package com.mundox.circeio.inheritance.model

final object DTODummies {
  def buildChocolateVanillaCookieIceCream() : IceCreamDTO =
    IceCreamDTO(
      TwoScoopsIceCreamDTO(FlavorDTO("chocolate"), FlavorDTO("vanilla")),
      Some(CupDTO(12)),
      None,
      List(AddonsDTO("cookie"))
    )

  def buildTuttiFruitWithChipsInACone(): IceCreamDTO =
    IceCreamDTO(
      OneScoopIceCreamDTO(FlavorDTO("tutti fruit")),
      None,
      Some(ConeDTO("M")),
      List(AddonsDTO("chips"))
    )
}
