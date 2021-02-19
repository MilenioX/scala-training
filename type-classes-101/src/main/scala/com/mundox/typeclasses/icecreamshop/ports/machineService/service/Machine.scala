package com.mundox.typeclasses.icecreamshop.ports.machineService.service

import com.mundox.typeclasses.icecreamshop.ports.machineService.model.IceCreamObj

final case class Machine() {
  def prepareIceCream(iceCream: IceCreamObj): Unit = {
    println(s"Ice Cream Machine is starting to prepare an Ice Cream")
    iceCream.flavors.flavors.foreach(flavor => println(s"Adding the ${flavor.name} flavor."))
    iceCream.addons.addons.foreach(addons => println(s"Adding the ${addons.name} addons"))
    println(s"Ice Cream Machine has finished the Ice Cream")
  }
}
