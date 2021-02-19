package com.mundox.typeclasses.icecreamshop.ports.machineService.model

import com.mundox.typeclasses.icecreamshop.core.model.Flavor

case class FlavorObj(name: String)

object FlavorObj {
  def apply(flavor: Flavor): FlavorObj =
    FlavorObj(flavor.name)
}