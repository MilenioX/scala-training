package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.{Addons, Chips, Cookie, Kellogg}

final case class AddonsDTO(name: String)

object AddonsDTO {
  def toDomain(addonsDTO: AddonsDTO): Addons = {
    addonsDTO.name match {
      case "chips" => Chips()
      case "cookie" => Cookie()
      case "kellogg" => Kellogg()
    }
  }
}