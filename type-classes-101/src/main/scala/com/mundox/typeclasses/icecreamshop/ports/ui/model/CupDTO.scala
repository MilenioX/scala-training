package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.Cup

final case class CupDTO(oz: Int)

object CupDTO {
  def toDomain(cupDTO: CupDTO): Cup =
    Cup(cupDTO.oz)
}
