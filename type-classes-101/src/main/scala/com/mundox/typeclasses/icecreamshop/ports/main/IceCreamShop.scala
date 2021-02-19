package com.mundox.typeclasses.icecreamshop.ports.main

import com.mundox.typeclasses.icecreamshop.ports.adapters.IceCreamMachineAdapter
import com.mundox.typeclasses.icecreamshop.ports.machineService.service.Machine
import com.mundox.typeclasses.icecreamshop.ports.ui.model.{DTODummies, IceCreamDTO}

object IceCreamShop extends App {

  def prepareAnIceCream(iceCreamDTO: IceCreamDTO): Unit = {
    for {
      iceCream <- IceCreamDTO.toDomain(iceCreamDTO)
    } yield iceCreamMachineService.prepareAnIceCream(iceCream)
  }

  println(s"Welcome to our Ice Cream Store")

  lazy val machine = new Machine()
  lazy val iceCreamMachineService = new IceCreamMachineAdapter(machine)

  println("=========================================================")
  println(s"So, your order is a Chocolate with Vanilla Ice Cream with a Cookie in a Cup of 12 onz., please hold on...")
  prepareAnIceCream(DTODummies.buildChocolateVanillaCookieIceCream())

  println("=========================================================")
  println(s"So, your order is a Tutti Fruit Ice Cream with chips in a cone, please hold on...")
  prepareAnIceCream(DTODummies.buildTuttiFruitWithChipsInACone())

}
