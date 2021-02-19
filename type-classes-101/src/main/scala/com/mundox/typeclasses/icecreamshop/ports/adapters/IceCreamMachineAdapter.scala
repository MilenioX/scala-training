package com.mundox.typeclasses.icecreamshop.ports.adapters

import com.mundox.typeclasses.icecreamshop.core.model.IceCream
import com.mundox.typeclasses.icecreamshop.core.services.IceCreamMachineService

case class IceCreamMachineAdapter() extends IceCreamMachineService {

  override def prepareAnIceCream(iceCream: IceCream): Unit = {
    println(s"We are preparing your ice Cream...")

  }
}
