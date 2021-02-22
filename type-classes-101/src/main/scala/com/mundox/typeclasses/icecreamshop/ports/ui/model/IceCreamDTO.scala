package com.mundox.typeclasses.icecreamshop.ports.ui.model

final case class IceCreamDTO(iceCreamDetail: IceCreamDetailDTO,
                             cup: Option[CupDTO],
                             cone: Option[ConeDTO],
                             addons: List[AddonsDTO])
