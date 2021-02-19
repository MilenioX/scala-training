package com.mundox.typeclasses.icecreamshop.core.services

import com.mundox.typeclasses.icecreamshop.core.model.IceCream

trait IceCreamMachineService {
  def prepareAnIceCream(iceCream: IceCream): Unit
}
