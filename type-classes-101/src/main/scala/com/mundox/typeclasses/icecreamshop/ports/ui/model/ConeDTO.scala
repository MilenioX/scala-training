package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.Cone

final case class ConeDTO(size: String)

object ConeDTO {
  def toDomain(coneDTO: ConeDTO): Cone =
    Cone(coneDTO.size)
}
