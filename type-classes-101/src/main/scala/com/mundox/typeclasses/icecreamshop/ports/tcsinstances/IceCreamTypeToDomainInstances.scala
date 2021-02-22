package com.mundox.typeclasses.icecreamshop.ports.tcsinstances

import com.mundox.typeclasses.icecreamshop.core.model.{IceCreamType, OneScoopIceCream, TwoScoopsIceCream}
import com.mundox.typeclasses.icecreamshop.core.typeclasses.TransformToDomain
import com.mundox.typeclasses.icecreamshop.ports.ui.model.{FlavorDTO, IceCreamDetailDTO, OneScoopIceCreamDTO, TwoScoopsIceCreamDTO}
import com.mundox.typeclasses.icecreamshop.core.typeclasses.ToDomainSyntax.ToDomainOps

/*
  Step2: Define an instance of the type class
*/
object IceCreamTypeToDomainInstances {

  implicit val oneScoopIceCreamTypeToDomain = new TransformToDomain[OneScoopIceCreamDTO, IceCreamType] {
    override def toDomain(portsModel: OneScoopIceCreamDTO): IceCreamType =
      OneScoopIceCream(FlavorDTO.toDomain(portsModel.mainFlavor))
  }

  implicit val twoScoopsIceCreamTypeToDomain = new TransformToDomain[TwoScoopsIceCreamDTO, IceCreamType] {
    override def toDomain(portsModel: TwoScoopsIceCreamDTO): IceCreamType =
      TwoScoopsIceCream(
        FlavorDTO.toDomain(portsModel.mainFlavor),
        FlavorDTO.toDomain(portsModel.secondaryFlavor))
  }

  implicit val iceCreamTypeToDomainInstances = new TransformToDomain[IceCreamDetailDTO, IceCreamType] {
    override def toDomain(portsModel: IceCreamDetailDTO): IceCreamType =
      portsModel match {
        case one: OneScoopIceCreamDTO =>
          one.toDomain
        case two: TwoScoopsIceCreamDTO =>
          two.toDomain
      }
  }
}
