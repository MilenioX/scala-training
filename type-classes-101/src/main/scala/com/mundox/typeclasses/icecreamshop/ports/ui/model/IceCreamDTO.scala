package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.IceCream

final case class IceCreamDTO(iceCreamDetail: IceCreamDetailDTO,
                             cup: Option[CupDTO],
                             cone: Option[ConeDTO],
                             addons: List[AddonsDTO])


object IceCreamDTO {
  def toDomain(iceCreamDTO: IceCreamDTO): Either[String, IceCream] = {
    iceCreamDTO.cup.fold(iceCreamDTO.cone.fold[Either[String, IceCream]](Left("Select an Ice Cream presentation please"))(coneDTO => {
      Right(IceCream(
        iceCreamDTO.iceCreamDetail match {
          case one: OneScoopIceCreamDTO => OneScoopIceCreamDTO.toDomain(one)
          case two: TwoScoopsIceCreamDTO => TwoScoopsIceCreamDTO.toDomain(two)
        },
        ConeDTO.toDomain(coneDTO),
        iceCreamDTO.addons.map(addonsDTO => AddonsDTO.toDomain(addonsDTO))))
    }))(cupDTO => {
      Right(IceCream(
        iceCreamDTO.iceCreamDetail match {
          case one: OneScoopIceCreamDTO => OneScoopIceCreamDTO.toDomain(one)
          case two: TwoScoopsIceCreamDTO => TwoScoopsIceCreamDTO.toDomain(two)
        },
        CupDTO.toDomain(cupDTO),
        iceCreamDTO.addons.map(addonsDTO => AddonsDTO.toDomain(addonsDTO))))
    })
  }
}