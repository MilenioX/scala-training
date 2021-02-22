package com.mundox.typeclasses.icecreamshop.ports.tcsinstances

import com.mundox.typeclasses.icecreamshop.core.model.IceCream
import com.mundox.typeclasses.icecreamshop.core.typeclasses.TransformToDomain
import com.mundox.typeclasses.icecreamshop.ports.ui.model.{AddonsDTO, IceCreamDTO}
import com.mundox.typeclasses.icecreamshop.core.typeclasses.ToDomainSyntax.ToDomainOps
import com.mundox.typeclasses.icecreamshop.ports.tcsinstances.IceCreamTypeToDomainInstances.iceCreamTypeToDomainInstances
import com.mundox.typeclasses.icecreamshop.ports.tcsinstances.IceCreamPresentationToDomainInstances._

object IceCreamToDomainInstances {

  implicit val iceCreamToDomain = new TransformToDomain[IceCreamDTO, Either[String, IceCream]] {
    override def toDomain(portsModel: IceCreamDTO): Either[String, IceCream] = {
      for {
        presentation <- portsModel.toDomain(iceCreamPresentationToDomain)
      } yield IceCream(
        portsModel.iceCreamDetail.toDomain,
        presentation,
        portsModel.addons.map(addonsDTO => AddonsDTO.toDomain(addonsDTO)))
    }
  }

}