package com.mundox.typeclasses.icecreamshop.ports.tcsinstances

import com.mundox.typeclasses.icecreamshop.core.model.{Cone, Cup, IceCreamPresentation}
import com.mundox.typeclasses.icecreamshop.core.typeclasses.TransformToDomain
import com.mundox.typeclasses.icecreamshop.ports.ui.model.{ConeDTO, CupDTO, IceCreamDTO, IceCreamPresentationDTO}

object IceCreamPresentationToDomainInstances {

  implicit val coneToDomain = new TransformToDomain[ConeDTO, IceCreamPresentation] {
    override def toDomain(portsModel: ConeDTO): IceCreamPresentation =
      Cone(portsModel.size)
  }

  implicit val cupToDomain = new TransformToDomain[CupDTO, IceCreamPresentation] {
    override def toDomain(portsModel: CupDTO): IceCreamPresentation =
      Cup(portsModel.oz)
  }


  implicit val iceCreamPresentationToDomain = new TransformToDomain[IceCreamDTO, Either[String, IceCreamPresentation]] {
    override def toDomain(portsModel: IceCreamDTO): Either[String, IceCreamPresentation] = {
      portsModel.cup.fold[Either[String, IceCreamPresentation]](portsModel.cone.fold[Either[String, IceCreamPresentation]](Left("Error with the presentation value"))(c =>
        Right(Cone(c.size))))(c => Right(Cup(c.oz)))
    }
  }

}