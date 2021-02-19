package com.mundox.typeclasses.icecreamshop.dummies

import com.mundox.typeclasses.icecreamshop.ports.ui.model.{AddonsDTO, ConeDTO, CupDTO, FlavorDTO, IceCreamDTO, OneScoopIceCreamDTO, TwoScoopsIceCreamDTO}

object IceCreamDTODummies {
  def buildChocolateVanillaCookieIceCream() : IceCreamDTO =
    IceCreamDTO(
      TwoScoopsIceCreamDTO(FlavorDTO("chocolate"), FlavorDTO("vanilla")),
      Some(CupDTO(12)),
      None,
      List(AddonsDTO("cookie")))

  def buildTuttiFruitWithChipsInACone(): IceCreamDTO =
    IceCreamDTO(
      OneScoopIceCreamDTO(FlavorDTO("tutti fruit")),
      None,
      Some(ConeDTO("M")),
      List(AddonsDTO("chips")))

  def buildNoFlavorWithKellogInACup(): IceCreamDTO =
    IceCreamDTO(
      OneScoopIceCreamDTO(FlavorDTO("chocolate")),
      None,
      None,
      List(AddonsDTO("kellogg")))
}
