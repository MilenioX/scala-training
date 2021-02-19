package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.{Chocolate, Flavor, TuttiFruit, Vanilla}

final case class FlavorDTO(name: String)

object FlavorDTO {
  def toDomain(flavorDTO: FlavorDTO): Flavor =
    flavorDTO.name match {
      case "chocolate" => Chocolate()
      case "vanilla" => Vanilla()
      case "tutti fruit" => TuttiFruit()
    }
}
