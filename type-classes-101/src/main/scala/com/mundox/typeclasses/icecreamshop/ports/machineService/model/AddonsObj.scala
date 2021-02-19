package com.mundox.typeclasses.icecreamshop.ports.machineService.model

import com.mundox.typeclasses.icecreamshop.core.model.Addons

final case class AddonsObj(name: String)

object AddonsObj {
  def apply(addons: Addons): AddonsObj =
    AddonsObj(addons.name)
}