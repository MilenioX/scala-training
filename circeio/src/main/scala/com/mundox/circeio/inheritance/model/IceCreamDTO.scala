package com.mundox.circeio.inheritance.model

final case class IceCreamDTO(iceCreamDetail: IceCreamDetailDTO,
                             cup: Option[CupDTO],
                             cone: Option[ConeDTO],
                             addons: List[AddonsDTO])