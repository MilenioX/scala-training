package com.mundox.circeio.inheritance.model

final case class TwoScoopsIceCreamDTO(mainFlavor: FlavorDTO,
                                      secondaryFlavor: FlavorDTO)
  extends IceCreamDetailDTO