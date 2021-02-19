package com.mundox.typeclasses.icecreamshop.ports.machineService.service

import com.mundox.typeclasses.icecreamshop.ports.machineService.model.IceCreamObj

final class Machine() {
  def prepareIceCream(iceCream: IceCreamObj): Unit = {
    println(s"Ice Cream Machine is starting to prepare an Ice Cream")
    iceCream.flavors.flavors.foreach(flavor => println(s"#_#: Adding the ${flavor.name} flavor."))
    iceCream.addons.addons.foreach(addons => println(s"#_#: Adding the ${addons.name} addons."))
    iceCream.presentation match {
      case "cup" => println(s"#_#: Ice cream served in a cup of ${iceCream.size} onz.")
      case "cone" => println(s"#_#: Ice cream served in a cone of size ${iceCream.size.toUpperCase}.")
    }
    println(s"Ice Cream Machine has finished the Ice Cream")
  }
}
