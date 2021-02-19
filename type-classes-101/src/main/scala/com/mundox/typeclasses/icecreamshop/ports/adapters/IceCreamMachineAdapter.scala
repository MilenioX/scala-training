package com.mundox.typeclasses.icecreamshop.ports.adapters

import com.mundox.typeclasses.icecreamshop.core.model.IceCream
import com.mundox.typeclasses.icecreamshop.core.services.IceCreamMachineService
import com.mundox.typeclasses.icecreamshop.ports.machineService.model.IceCreamObj
import com.mundox.typeclasses.icecreamshop.ports.machineService.service.Machine

final class IceCreamMachineAdapter(machine: Machine) extends IceCreamMachineService {

  override def prepareAnIceCream(iceCream: IceCream): Unit = {
    println(s"We are preparing your ice Cream...")
    machine.prepareIceCream(IceCreamObj(iceCream))
  }
}
