package com.mundox.typeclasses.icecreamshop.dummies

import com.mundox.typeclasses.icecreamshop.ports.ui.model.{AddonsDTO, FlavorDTO, IceCreamDTO, OneScoopIceCreamDTO, TwoScoopsIceCreamDTO}

object IceCreamDTODummies {
  def buildChocolateVanillaCookieIceCream() : IceCreamDTO =
    IceCreamDTO(
      None,
      Some(TwoScoopsIceCreamDTO(FlavorDTO("chocolate"), FlavorDTO("vanilla"))),
      "cup",
      Some(12),
      List(AddonsDTO("cookie")))

  def buildTuttiFruitWithChipsInACone(): IceCreamDTO =
    IceCreamDTO(
      Some(OneScoopIceCreamDTO(FlavorDTO("tutti fruit"))),
      None,
      "cone",
      None,
      List(AddonsDTO("chips")))

  def buildNoFlavorWithKellogInACup(): IceCreamDTO =
    IceCreamDTO(
      None,
      None,
      "cup",
      Some(24),
      List(AddonsDTO("kellogg")))
}
