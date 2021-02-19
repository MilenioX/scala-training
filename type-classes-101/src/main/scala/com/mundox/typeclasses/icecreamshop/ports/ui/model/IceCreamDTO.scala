package com.mundox.typeclasses.icecreamshop.ports.ui.model

import com.mundox.typeclasses.icecreamshop.core.model.{Cone, Cup, IceCream, IceCreamPresentation}

final case class IceCreamDTO(oneScoopIceCream: Option[OneScoopIceCreamDTO],
                             twoScoopsIceCream: Option[TwoScoopsIceCreamDTO],
                             presentation: String,
                             sizeCup: Option[Int],
                             addons: List[AddonsDTO])


object IceCreamDTO {
  def toDomain(iceCreamDTO: IceCreamDTO): Either[String, IceCream] = {
    iceCreamDTO.oneScoopIceCream.fold(iceCreamDTO.twoScoopsIceCream.fold[Either[String, IceCream]](Left("Select an Ice Cream type please"))(twoScoops => {
      Right(IceCream(
        TwoScoopsIceCreamDTO.toDomain(twoScoops),
        toPresentationDomain(iceCreamDTO.presentation, iceCreamDTO.sizeCup),
        iceCreamDTO.addons.map(addonsDTO => AddonsDTO.toDomain(addonsDTO))))
    }))(oneScoop => {
      Right(IceCream(
        OneScoopIceCreamDTO.toDomain(oneScoop),
        toPresentationDomain(iceCreamDTO.presentation, iceCreamDTO.sizeCup),
        iceCreamDTO.addons.map(addonsDTO => AddonsDTO.toDomain(addonsDTO))))
    })
  }

  def toPresentationDomain(presentation: String, sizeCup: Option[Int]): IceCreamPresentation =
    presentation match {
      case "cup" => Cup(sizeCup.getOrElse(12))
      case "cone" => Cone()
    }
}